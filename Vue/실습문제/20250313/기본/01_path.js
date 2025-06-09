const path = require('path');

const a = path.join('some', 'work', 'ex.txt');
console.log(a);

const dir = path.dirname(__filename);
console.log(`파일 절대 경로 : ${__filename}`);
console.log(`경로만 : ${dir}`);

const fn = path.basename(__filename);
const fn2 = path.basename(__filename, '.js');

console.log(`파일 이름 : ${fn}`);
console.log(`파일 이름(확장자 제외) : ${fn2}`);

const ext = path.extname(__filename);
console.log(`파일 확장자 : ${ext}`);

const allPath = path.parse(__filename);
console.log(allPath);