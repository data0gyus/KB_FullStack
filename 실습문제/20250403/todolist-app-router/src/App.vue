<template>
  <div class="container">
    <Header />
    <RouterView />
    <Loading v-if="states.isLoading" />
  </div>
</template>

<script setup>
import { reactive, computed, provide } from "vue";
import Header from "./components/Header.vue";
import Loading from "./components/Loading.vue";
import axios from "axios";

const BASEURI = "/api/todos";
const states = reactive({ todoList: [], isLoading: false });

const fetchTodoList = async () => {
  states.isLoading = true;
  try {
    const response = await axios.get(BASEURI);
    if (response.status === 200) {
      states.todoList = response.data;
    } else {
      alert("데이터 조회 실패");
    }
  } catch (error) {
    alert("에러발생:" + error);
  } finally {
    states.isLoading = false;
  }
};

const addTodo = async ({ todo, desc }, successCallback) => {
  states.isLoading = true;
  try {
    const payload = { todo, desc };
    const response = await axios.post(BASEURI, payload);
    if (response.status === 201) {
      states.todoList.push({ ...response.data, done: false });
      successCallback();
    } else {
      alert("Todo 추가 실패");
    }
  } catch (error) {
    alert("에러발생:" + error);
  } finally {
    states.isLoading = false;
  }
};
const updateTodo = async ({ id, todo, desc, done }, successCallback) => {
  // 로딩 스피너가 보이도록 상태값 변경
  states.isLoading = true;

  try {
    const payload = { id, todo, desc, done };
    const response = await axios.put(BASEURI + `/${id}`, payload);
    if (response.status === 200) {
      let index = states.todoList.findIndex((todo) => todo.id === id);
      states.todoList[index] = payload;
      successCallback();
    } else {
      alert("Todo변경실패");
    }
  } catch (error) {
    alert("에러발생:" + error);
  } finally {
    // 로딩 스피너가 보이지 않도록 상태값 변경
    states.isLoading = false;
  }
};

const deleteTodo = async (id) => {
  states.isLoading = true;
  try {
    const response = await axios.delete(BASEURI + `/${id}`);
    console.log(response.status, response.data);
    if (response.status === 200) {
      let index = states.todoList.findIndex((todo) => todo.id === id);
      states.todoList.splice(index, 1);
    } else {
      alert("Todo 삭제 실패");
    }
  } catch (error) {
    alert("에러발생:" + error);
  } finally {
    states.isLoading = false;
  }
};

const toggleDone = async (id) => {
  states.isLoading = true;
  try {
    let todo = states.todoList.find((todo) => todo.id === id);
    let payload = { ...todo, done: !todo.done };
    const response = await axios.put(BASEURI + `/${id}`, payload);
    if (response.status === 200) {
      todo.done = payload.done;
    } else {
      alert("Todo 완료 변경 실패");
    }
  } catch (error) {
    alert("에러발생 :" + error);
  } finally {
    states.isLoading = false;
  }
};

provide(
  "todoList",
  computed(() => states.todoList)
);
provide("actions", {
  addTodo,
  deleteTodo,
  toggleDone,
  updateTodo,
  fetchTodoList,
});

fetchTodoList();

/* 기본 문제
const states = reactive({
  todoList: [
    { id: 1, todo: "ES6학습", desc: "설명1", done: false },
    { id: 2, todo: "React학습", desc: "설명2", done: false },
    { id: 3, todo: "ContextAPI 학습", desc: "설명3", done: true },
    { id: 4, todo: "야구 경기 관람", desc: "설명4", done: false },
  ],
});

const addTodo = ({ todo, desc }) => {
  states.todoList.push({ id: new Date().getTime(), todo, desc, done: false });
};

const updateTodo = ({ id, todo, desc, done }) => {
  let index = states.todoList.findIndex((todo) => todo.id === id);
  states.todoList[index] = { ...states.todoList[index], todo, desc, done };
};

const deleteTodo = (id) => {
  let index = states.todoList.findIndex((todo) => todo.id === id);
  states.todoList.splice(index, 1);
};

const toggleDone = (id) => {
  let index = states.todoList.findIndex((todo = todo.id === id));
  states.todoList[index].done = !states.todoList[index].done;
};

provide(
  "todoList",
  computed(() => states.todoList)
);
provide("actions", { addTodo, deleteTodo, toggleDone, updateTodo });*/
</script>
