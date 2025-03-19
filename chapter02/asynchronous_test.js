function displayA() {
    console.log('A');
}
function displayB() {
    // 2초 후에 B를 출력 
    // 그동안 다른 코드 수행하고 있어 -> 비동기
    setTimeout(() => {
        console.log('B');
     }, 2000);
}
function displayC() {
    console.log('C');
}

displayA();
displayB();
displayC();