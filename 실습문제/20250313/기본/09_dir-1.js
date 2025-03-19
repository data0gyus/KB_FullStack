const fs = require('fs');

if (fs.existsSync(`c:/KB_Fullstack/02_Vue/실습문제/20250313/기본/test`)) {
    console.log('test directory is exists');
} else {
    fs.mkdirSync(`c:/KB_Fullstack/02_Vue/실습문제/20250313/기본/test`);
    console.log('test directory success!')
}