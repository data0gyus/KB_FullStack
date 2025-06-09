// //import fs from 'node:fs/promises';
// import fs from 'node:fs';

// // fs.readdir
// fs.promises.readdir

import fs from 'node:fs/promises'; // 반환형이 Promise

async function getDirectories() {
    try {

        const result = await fs.readdir('./'); //Promise 반환 
        console.log(result);
    } catch (err) {
        console.log(err);
    }

}

getDirectories(); // 호출 