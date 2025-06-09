const fs = require('fs');

const stream = fs.createReadStream(`c:/KB_Fullstack/02_Vue/실습문제/20250313/심화/readMe.txt`, 'utf-8');

stream.on('data', (data) => {
    console.log(data);
})
    .on('end', () => {
        console.log('finished');
    })
    .on('error', (err) => {
        console.error(`error : ${err}`)
    });