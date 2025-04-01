import { createRouter, createWebHistory } from "vue-router";

import Home from "@/pages/Home.vue";
import About from "@/pages/About.vue";
import Members from "@/pages/Members.vue";
import Videos from "@/pages/Videos.vue";
import MemberInfo from "@/pages/MemberInfo.vue";
import NotFound from "@/pages/NotFound.vue";

// const Guard = (to, from) => {
//   if (from.name !== "members" && from.name !== "members/id") {
//     return false;
//   }
// };
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: "/", component: Home },
    { path: "/about", component: About },
    { path: "/members", component: Members, name: "members" },
    {
      path: "/members/:id",
      component: MemberInfo,
      name: "members/id",
      beforeEnter: (to, from) => {
        console.log("from.name:", from.name);
        if (from.name !== "members" && from.name !== "members/id") {
          return { path: "/members" };
        }
      },
    },
    { path: "/videos", component: Videos },
    { path: "/:path(.*)*", component: NotFound },
  ],
});

export default router;
