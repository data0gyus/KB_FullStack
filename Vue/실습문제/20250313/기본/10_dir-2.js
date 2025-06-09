const fs = require('fs');

if (fs.existsSync(`c:/KB_Fullstack/02_Vue/실습문제/20250313/기본/test2/test3/test4`)) {
    console.log('test2/test3/test4 directory is exists');
} else {
    fs.mkdir(`c:/KB_Fullstack/02_Vue/실습문제/20250313/기본/test2/test3/test4`, { recursive: true }, (err) => {
        if (err) {
            return console.error(err);
        }
        console.log('test2/test3/test4 directory success!');
    });
}