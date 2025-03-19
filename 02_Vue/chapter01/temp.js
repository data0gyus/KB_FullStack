const arr1 = [1, 2, 3];
const arr2 = arr1;

console.log('arr1 : ', arr1); // 1,2,3
console.log('arr2 : ', arr2); // 1,2,3

arr2[0] = 100; // 복사본 0번 인덱스 값을 변경 
console.log('변경후');
console.log('arr1 : ', arr1); // 100,2,3
console.log('arr2 : ', arr2); // 100,2,3
// -> 얕은 복사 : 주소만 복사

// 둘 다 100으로 나오는 이유?
// 객체 지향 언어이므로 주소 참조라는 특징을 이용


// 깊은 복사 : 실제 데이터를 복사(복제)
const arr3 = [100, 200, 300];

const arr4 = [...arr3]; // ... : 전개 연산자
// [...arr3] -> [...[100,200,300]] -> [100,200,300]

arr4[0] = 99999;

console.log('arr3 : ', arr3);
console.log('arr4 : ', arr4);