async function init() {
    try {
        let response = await fetch('https://jsonplaceholder.typicode.com/users');
        // console.log('response :', response);
        let data = await response.json(); // 비동기
        console.log(data);
    } catch(err) {
        console.error(err);
    }
}

init();