<template>
  <ul class="navbar-nav me-auto">
    <MenuItem v-for="menu in config.menus" :key="menu.url" :menu="menu" />
  </ul>
</template>

<script>
import MenuItem from "./MenuItem.vue";

export default {
  name: "MenuGroup",
  components: { MenuItem },
  inject: ["config"],
};
</script>
