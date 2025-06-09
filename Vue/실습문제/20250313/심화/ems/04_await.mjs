import fs from 'node:fs/promises';

async function readDirAsyn() {
    try {
        const a = await fs.readdir(`./`);
        console.log(a);
    } catch (err) {
        console.error(err);
    }
}

readDirAsyn();