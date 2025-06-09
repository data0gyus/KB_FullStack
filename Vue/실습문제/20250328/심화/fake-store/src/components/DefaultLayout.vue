<template>
  <div class="container">
    <Header />
    <NavBar />
  </div>
</template>

<script>
import Header from "./Header.vue";
import NavBar from "./NavBar.vue";

export default {
  name: "DefaultLayout",
  components: { Header, NavBar },
};
</script>
