import { createRouter, createWebHistory } from "vue-router";

import ElectronicPage from "@/pages/ElectronicPage.vue";
import JeweleryPage from "@/pages/JeweleryPage.vue";
import MensClothingPage from "@/pages/MensClothingPage.vue";
import WomensClothingPage from "@/pages/WomensClothingPage.vue";
import HomePage from "@/pages/HomePage.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: "/", name: "home", component: HomePage },
    { path: "/electronics", name: "electronics", component: ElectronicPage },
    { path: "/jewelery", name: "jewelery", component: JeweleryPage },
    {
      path: "/mensclothing",
      name: "mensclothing",
      component: MensClothingPage,
    },
    {
      path: "/womenclothing",
      name: "womenclothing",
      component: WomensClothingPage,
    },
  ],
});

export default router;
