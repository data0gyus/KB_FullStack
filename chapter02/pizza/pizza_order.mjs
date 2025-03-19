
function pizzaOrder(pizzaName) {
    
    const pizzaList = ['치즈피자', '불고기피자', '페퍼로니피자'];

    // Promise 객체 : 비동기 코드 수행 후 결과 반환을 약속하는 객체 
    return new Promise((resolve, reject) => {
        
        // 전달 받은 피자가 list에 있다면 
        if (pizzaList.includes(pizzaName)) {
            
            // Promise 성공 시 함수 반환 
            resolve(() => {
                console.log(`${pizzaName} 주문 완료`);

                setTimeout(() => {
                    console.log(`${pizzaName} 배달을 시작했습니다!`);
                }, 3000); // 3초 후 수행
                
            });

        } else {

            // Promise 실패 시 '값' 반환
            reject(`주문 실패. ${pizzaName}은 존재하지 않습니다.`);
        }
    });
}


// pizzaOrder 함수 내보내기
// -> 외부 import 가능해짐
export default pizzaOrder;