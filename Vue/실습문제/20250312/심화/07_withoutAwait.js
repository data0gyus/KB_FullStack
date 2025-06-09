/* fetch(경로) : 
    - 비동기로 응답(response) 가져오기
    - 결과로 Promise 반환
    - 무조건 성공( resolve() 실행 -> then()으로만 처리 가능 )
    -> response.ok 등을 이용해서 응답 상태 코드를 확인 
*/

// response : fetch 결과 
fetch('https://jsonplaceholder.typicode.com/users')
    /*.then((response) => response.json())
    .then((data) => console.log(data))
    .catch((err) => console.log(err));
    */
    .then((response) => {
        // 정상 응답(200) 확인 
        if (response.ok) { //response.status == 200
            return response.json(); // Promise 반환 
       }
    })
    .then((data) => {
        console.log(data);
    })
    .catch((err) => {
        console.log(err);
   })
