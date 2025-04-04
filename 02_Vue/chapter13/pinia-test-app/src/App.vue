<template>
  {{ store.count }} / {{ store.doubleCount }} <br />
  {{ count }}
  <!-- 최초의 값만 존재  -->
</template>

<script setup>
import { useCounterStore } from "@/stores/counter.js";
import { computed } from "vue";

const store = useCounterStore();

// store에서 제공하는 increment 함수 분해 할당
const { increment } = store; // 함수 -> 분해 할당

const count = computed(() => store.count);
increment();
console.log(count);
</script>
