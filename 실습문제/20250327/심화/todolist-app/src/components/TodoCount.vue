<template>
  <div class="row mb-3">
    <div class="col-md text-center">
      전체 todo 개수 : <span>{{ todoList.length }}</span>
    </div>
    <div class="col-md text-center">
      <!-- 완료 todo 개수 : <span :class="completedCount && completed">{{completedCount}}</span> -->
      완료 todo 개수 :
      <span :class="{ completed: completedCount > 0 }">{{
        completedCount
      }}</span>
    </div>
    <div class="col-md text-center">
      미완료 todo 개수 :
      <span :class="{ notCompleted: todoList.length - completedCount > 0 }">{{
        todoList?.length - completedCount
      }}</span>
    </div>
  </div>
</template>
<script setup>
import { computed } from "vue";
const props = defineProps({ todoList: { type: Array, required: true } });
const emit = defineEmits(["completed-count"]);
// 부모로 부터 데이터 전달 받기 + 유효성 검사
// props: {
//   //completedCount: { type: Number },
//   todoList: { type: Array, required: true },
// },
const completedCount = computed(() => {
  // todolist의 요소 중 completed 가 true인 요소만 남긴 배열 반환
  return props.todoList.filter((todo) => todo.completed).length;
});
</script>
