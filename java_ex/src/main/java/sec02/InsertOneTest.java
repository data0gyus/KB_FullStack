package sec02;

import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertOneResult;
import org.bson.Document;

public class InsertOneTest {
    public static void main(String[] args) {
        MongoCollection<Document> collection = Database.getCollection("todo");

        // 문서을 정의하는 객체 생성(BSON)
        Document document = new Document();

        document.append("title", "MongoDB");
        document.append("desc","MongoDB 공부하기");
        document.append("done",false);

        // 컬렉션에 문서 1개 삽입 후 결과 객체 반환 받기
        InsertOneResult result = collection.insertOne(document);
        // 생성된 문서의 _id 필드값 얻어오기
        System.out.println("==> InsertOne Result : " + result.getInsertedId());
        // 데이터베이스 연결 종료 및 리소스 정리
        Database.close();
    }
}
