<template>
  <div class="card card-body">
    <h2>About</h2>
    <p>요청 경로 : {{ currentRoute.fullPath }}</p>
  </div>
</template>

<script setup>
import { useRoute } from "vue-router";
import { onMounted } from "vue";

const currentRoute = useRoute();
onMounted(() => {
  console.log(currentRoute);
});
</script>

<!-- <script>
import { useRoute } from "vue-router";
import { onMounted } from "vue";

export default {
  name: "About",
  setup() {
    const currentRoute = useRoute();

    onMounted(() => {
      console.log(currentRoute);
    });
    return { currentRoute };
  },
};
</script> -->
