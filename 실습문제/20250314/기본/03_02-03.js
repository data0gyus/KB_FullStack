const p1 = { name: "john", age: 20 };
p1.age = 22;
console.log(p1);
// p1 = { name: "lee", age: 25 };

// 위에 주석을 풀면 오류
// 주석을 그대로 두면은 { name : 'john', age: 22}
