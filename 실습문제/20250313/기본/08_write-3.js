const fs = require('fs');

const a = fs.readFileSync(`c:/KB_Fullstack/02_Vue/실습문제/20250313/기본/example.txt`, 'utf-8');

if (fs.existsSync(`c:/KB_Fullstack/02_Vue/실습문제/20250313/기본/text-1.txt`)) {
    console.log('text-1 is exist');
} else {
    fs.writeFileSync('c:/KB_Fullstack/02_Vue/실습문제/20250313/기본/text-1.txt', a);
}