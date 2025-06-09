import order from './pizza_order.mjs';

order('후라이드치킨')
    .then((fn) => {
        // fn : resolve()를 통해 반환된 함수 
        fn(); // 반환 받은 함수 실행 
    })
    .catch((err) => {
        // err : reject()를 통해 반환된 값(문자열)
        console.log(err);
    });
