
// 외부에서 해당 모듈의 hi, goodbye를 import 가능하게함 
/* export */ const hi = (name) => {
    console.log(`${name}님, 안녕하세요?`);
};

/* export */ const goodbye = (name) => {
    console.log(`${name}님, 안녕히 가세요.`);
};

export { hi, goodbye };

// export 없으면 h1, goodby 변수 선언 -> 함수가 대입 되어있는 상태

