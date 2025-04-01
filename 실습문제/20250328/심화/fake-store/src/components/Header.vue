<template>
  <header class="container-fulid">
    <!-- jumbotron -->
    <div class="mt-4 p-5 bg-primary text-white jumbotron">
      <h1>{{ config.title }}</h1>
      <p>{{ config.subtitle }}</p>
    </div>
  </header>
</template>
<script>
export default {
  name: "Header",
  inject: ["config"],
};
</script>
<style>
.jumbotron {
  background-image: url("../assets/background.jpg");
}
</style>
