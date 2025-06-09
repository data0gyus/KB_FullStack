import { createRouter, createWebHistory } from "vue-router";
import Home from "@/pages/Home.vue";
import About from "@/pages/About.vue";
import Members from "@/pages/Members.vue";
import Videos from "@/pages/Videos.vue";
import MemberInfo from "@/pages/MemberInfo.vue";
import Test from "@/pages/Test.vue";
import TestChild from "@/pages/TestChild.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: "/", component: Home },
    { path: "/about", component: About },
    { path: "/members", component: Members },
    // 명명된 라우트
    { path: "/videos", component: Videos, name: "vi" },
    // 동적 라우트
    { path: "/members/:id", component: MemberInfo },
    // 중첩 라우트
    {
      path: "/test",
      component: Test,
      children: [{ path: ":num", component: TestChild, name: "test/num" }],
    },
  ],
});

export default router;
