// use my_database
//
// db.users.find()
//
// use tutorial2

// 1행 삽입
db.users.insertOne({username:"smith"})

// 여러 행 삽입
db.users.insertMany([
    {username:"jones"},
    {username:"tom"}
])

// 확인
db.users.find() // 모두 다 조회

// 도큐먼트(행) 개수 확인
db.users.countDocuments()
db.users.estimatedDocumentCount() // 추정치 계산


// username이 일치하는 도큐먼트 검색
db.users.find({username:"jones"})

// 묵시적 AND
// - 자동 생성된 _id 필드값은 꼭 ObjectId로 감싸줘라!
db.users.find({
    _id : ObjectId("6833edcde0e0441065e80d17"),
    username:"jones"
})


// 명시적 AND
db.users.find({
    $and:[
        {_id : ObjectId("6833edcde0e0441065e80d17")},
        {username:"jones"}
    ]
})

// OR 연산자 사용
db.users.find({
    $or: [
        {username: "smith"},
        {username: "jones"}
    ]
})

// === 필드 추가 ===
// 구 버전 (MongoDB 3.2 이전)
db.users.update({username: "smith"}, {$set: {country: "Canada"}})

// 신 버전 (MongoDB 3.2+) - 권장
db.users.updateOne(
    {username: "smith"},    // 쿼리 셀럭터
    {$set: {country2: "Canada2"}
    })

// === 결과 확인 ===
db.users.find({username: "smith"})

// === 필드 삭제 ===
// 구 버전 (MongoDB 3.2 이전)
// country 필드 삭제
// {$unset: {country: 1}} 에서 1은 의미 없음!! (K:V 형태 맞추려고 사용)
db.users.update({username: "smith"}, {$unset: {country: 1}})

// 신 버전 (MongoDB 3.2+) - 권장
db.users.updateOne({username: "smith"}, {$unset: {country2: 1}})

// === 결과 확인 ===
db.users.find({username: "smith"})


// 대체
db.users.replaceOne({username: "smith"}, {country2: "Canada"})

// {username: "smith"} -> {country2: "Canada"} 대체되어 username이 없음(unset)
db.users.find()

// === 복잡한 데이터 업데이트 ===
// 구 버전 (MongoDB 3.2 이전)
db.users.update({username: "tom"}, {
    $set: {
        favorites: {
            cities: ["Chicago", "Cheyenne"],
            movies: ["Casablanca", "For a Few Dollars More", "The Sting"]
        }
    }
})

// 신 버전 (MongoDB 3.2+) - 권장
db.users.updateOne({username: "tom"}, {
    $set: {
        favorites: {
            cities: ["Chicago", "Cheyenne"],
            movies: ["Casablanca", "For a Few Dollars More", "The Sting"]
        }
    }
})

db.users.updateOne({username: "jones"},
    {
        $set: {
            favorites: {
                movies: ["Casablanca", "Rocky"]
            }
        }
    })

// 점 표기법으로 중첩 필드 검색
db.users.find({"favorites.movies": "Casablanca"}).pretty()

// === 다중 업데이트 비교 ===
// 신 버전 (MongoDB 3.2+) - 권장
db.users.updateMany(
    {"favorites.movies": "Casablanca"},
    {$addToSet: {"favorites.movies": "The Maltese Falcon"}},
    {upsert: false} // multi 옵션 불필요
)
// 1. favorites 객체 안의 movies 배열에 "Casablanca"가 포함된 도큐먼트 찾기
// 2. favorites.movies 배열에 "The Maltese Falcon" 추가 (이미 있으면 추가 안함)
// 3. upsert: false: 조건에 맞는 도큐먼트가 없어도 새로 생성하지 않음
// 4. multi: true: 조건에 맞는 모든 도큐먼트를 수정


// === 단일 업데이트 (신버전) ===
db.users.updateOne(
    {"favorites.movies": "Casablanca"},
    {$push: {"favorites.movies": "Citizen Kane"}}
)

// 1. favorites 객체 안의 movies 배열에 "Casablanca"가 포함된 도큐먼트 찾기
// -updateOne() 메서드이기 때문에 조건에 맞는 첫 번째 도큐먼트만 수정
// 2. favorites.movies 배열에 "Citizen Kane" 추가 (중복 허용)

// === 조건부 삭제 ===
// 신 버전 (MongoDB 3.2+) - 권장
db.users.deleteOne({"favorites.cities": "Cheyenne"})    // 첫 번째 문서만 삭제
db.users.deleteMany({"favorites.cities": "Cheyenne"})   // 조건에 맞는 모든 문서 삭제

// === 모든 문서 삭제 ===
// 신 버전 (MongoDB 3.2+) - 권장
db.users.deleteMany({})  // 모든 문서 삭제 (컬렉션 유지)
db.users.countDocuments() // 0개 확인

// === 컬렉션 삭제 ===
db.users.drop()  // 버전 무관 - 컬렉션 자체 삭제

// 명시적 컬렉션 생성
// db.createCollection("tutorial2")

db.tutorial2.drop()


// --------------------------------------------------------------------------------------------------

// 인덱스

// === 대용량 데이터 생성/확인 (구 버전) ===
// 20만 개 도큐먼트 생성
for(let i = 0; i < 200000; i++) {
    db.numbers.insert({num: i});
}

// 도큐먼트 개수 확인
db.numbers.count()


// === 대용량 데이터 생성/확인 (신 버전) ===
// 20만 개 도큐먼트생성 (신 버전 - MongoDB 3.2+)
// 방법 1: insertMany로 배치 삽입 (더 효율적)
let docs = [];
for(let i = 0; i < 200000; i++) {
    docs.push({num: i});
    // 1000개씩 배치로 삽입 (메모리 효율성)
    if(docs.length === 1000) {
        db.numbers.insertMany(docs);
        docs = [];
    }
}
if(docs.length == 0) {
    db.numbers.insertMany(docs);
}

// 방법 2: 개별 삽입 (호환성 우선시)
for(let i = 0; i < 200000; i++) {
    db.numbers.insertOne({num: i});
}

// 도큐먼트 개수 확인
db.numbers.countDocuments()  // 정확한 개수
db.numbers.estimatedDocumentCount()  // 빠른 추정값


// 큰 값 검색 ($gt: greater than)
db.numbers.find({num: {"$gt": 199995}})

// 범위 검색 ($gt, $lt)
db.numbers.find({num: {"$gt": 20, "$lt": 25}})

// 쿼리 실행 계획 확인
db.numbers.find({num: {"$gt": 199995}}).explain("executionStats")


// === 인덱스 생성 ===
// 신 버전 (MongoDB 3.0+) - 권장
db.numbers.createIndex({num: 1}) // 1 : 오름차순


// === 인덱스 확인 ===
db.numbers.getIndexes()  // 버전 무관


// 인덱스 적용 후 explain() 결과
// 인덱스 설정 후 다시 num 조건 검색
db.numbers.find({num: {"$gt": 199995}}).explain("executionStats")


// === 데이터베이스 및 컬렉션 정보 ===
// 데이터베이스 목록 보기
// show dbs

// 현재 데이터베이스의 컬렉션 목록 보기
// show collections

// === 상태 정보 확인 ===
// 구 버전 (MongoDB 4.4 이전)
db.stats()
db.numbers.stats()

// 신 버전 (MongoDB 4.4+) - 더 자세한 정보
db.runCommand({dbStats: 1})
db.runCommand({collStats: "numbers"})

// === 연결 상태 확인 ===
db.hello()  // MongoDB 5.0+
db.isMaster()  // 구 버전 (MongoDB 5.0 이전)

