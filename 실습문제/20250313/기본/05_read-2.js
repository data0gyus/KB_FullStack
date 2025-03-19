const fs = require('fs');

fs.readFile(`c:/KB_Fullstack/02_Vue/실습문제/20250313/기본/example.txt`, 'utf-8', (err, a) => {
    if (err) {
        console.error(err);
        return;
    }
    console.log(a);
});