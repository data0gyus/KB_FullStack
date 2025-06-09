<template>
  <div class="container mt-5">
    <h2 v-if="menu"><i :class="menu.icon"></i> {{ menu.title }}</h2>
  </div>
</template>

<script>
export default {
  name: "JeweleryPage",
  inject: ["config"],
  computed: {
    menu() {
      return this.config.menus.find((m) => m.url === this.$route.path);
    },
  },
};
</script>
