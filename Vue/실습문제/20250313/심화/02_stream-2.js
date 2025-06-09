const fs = require('fs');

const streamread = fs.createReadStream(`c:/KB_Fullstack/02_Vue/실습문제/20250313/심화/readMe.txt`, 'utf-8');
const streamwrite = fs.createWriteStream(`c:/KB_Fullstack/02_Vue/실습문제/20250313/심화/writeMe.txt`);

streamread.pipe(streamwrite);