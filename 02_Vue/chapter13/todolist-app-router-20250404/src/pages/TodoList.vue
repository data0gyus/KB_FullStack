<template>
  <!-- 버튼들을 포함하는 행 -->
  <div class="row">
    <div class="col p-3">
      <!-- 할일 추가 페이지로 이동하는 라우터 링크 -->
      <!-- 클릭 시 RouterView에 표시되는 컴포넌트가 변경됨 -->
      <RouterLink class="btn btn-primary" to="/todos/add">
        할일 추가
      </RouterLink>

      <!-- 목록을 새로고침하는 버튼 -->
      <button class="btn btn-primary ms-1" @click="fetchTodoList">
        새로 고침
      </button>
    </div>
  </div>

  <!-- 할일 목록을 표시하는 행 -->
  <div class="row">
    <div class="col">
      <ul class="list-group">
        <!-- 각 할일 항목을 TodoItem 컴포넌트로 표시 -->
        <TodoItem
          v-for="todoItem in todoList"
          :key="todoItem.id"
          :todoItem="todoItem"
        />
      </ul>
    </div>

    <span>완료된 할일 개수 : {{ doneCount }}</span>
  </div>
</template>
<script setup>
import TodoItem from "@/components/TodoItem.vue";
import { RouterLink } from "vue-router";
import { computed } from "vue";

// store 가져오기 + 객체 생성
import { useTodoListStore } from "@/stores/todoList.js";
const todoListStore = useTodoListStore();

const todoList = computed(() => todoListStore.todoList);
const { fetchTodoList } = todoListStore;

// 완료된 할 일의 개수
const doneCount = computed(() => todoListStore.doneCount);
</script>
