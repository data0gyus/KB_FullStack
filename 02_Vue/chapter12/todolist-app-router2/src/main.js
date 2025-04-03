// Entry point : 애플리케이션의 진입점
import "./assets/main.css";

import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import "bootstrap/dist/css/bootstrap.min.css";

const app = createApp(App);

app.use(router);

app.mount("#app");
