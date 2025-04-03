import { createRouter, createWebHistory } from "vue-router";
import HomePage from "../pages/HomePage.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: HomePage,
    },
    {
      path: "/electronics",
      name: "electronics",
      // lazy loading
      component: () => import("../pages/ElectronicsPage.vue"),
    },
    {
      path: "/jewelery",
      name: "jewelery",
      component: () => import("../pages/JeweleryPage.vue"),
    },
    {
      path: "/mensclothing",
      name: "mensclothing",
      component: () => import("../pages/MensClothingPage.vue"),
    },
    {
      path: "/womenclothing",
      name: "womenclothing",
      component: () => import("../pages/WomensClothingPage.vue"),
    },
  ],
});

export default router;
