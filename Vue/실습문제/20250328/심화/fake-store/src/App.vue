<template>
  <div>
    <DefaultLayout />
    <RouterView></RouterView>
    <Footer />
  </div>
</template>

<script>
import DefaultLayout from "./components/DefaultLayout.vue";
import Footer from "./components/Footer.vue";
import config from "@/config";
export default {
  name: "App",
  components: { DefaultLayout, Footer },
  provide() {
    return {
      config,
    };
  },
};
</script>

<style>
@import url("https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css");
@import url("https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css");
</style>
