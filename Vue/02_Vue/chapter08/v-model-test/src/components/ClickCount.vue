<template>
  <div>
    <h1>자식 Click Count : {{ cnt }}</h1>
  </div>
  <ChildClickCount />
</template>

<script>
import ChildClickCount from "./ChildClickCount.vue";

export default {
  name: "ClickCount",
  components: { ChildClickCount },
  // provide로 제공된 정보 삽입하기
  inject: ["cnt"],
};
</script>
