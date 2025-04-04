// Entry point : 애플리케이션의 진입점
import "./assets/main.css";

import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import "bootstrap/dist/css/bootstrap.min.css";

// pinia 가져오기
import { createPinia } from "pinia";

const app = createApp(App);
app.use(createPinia());
app.use(router);

app.mount("#app");
