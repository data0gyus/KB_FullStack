<template>
  <div class="row mb-3">
    <div class="col">
      <div class="input-group">
        <input
          id="msg"
          type="text"
          class="form-control"
          name="msg"
          placeholder="할일을 여기에 입력!"
          v-model.trim="todo"
          @keyup.enter="addTodoHandler"
        />
        <!-- 추가 버튼 클릭 시 작성된 할 일 내용을 todolist에 추가 -->
        <span class="btn btn-primary input-group-addon" @click="addTodoHandler"
          >추가</span
        >
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref } from "vue";

const todo = ref(""); // ref()에 등록된 값 접근 방법 : 변수명.value
const emit = defineEmits(["add-todo"]); // 부모로 방출할 이벤트 유효성 검사

// 추가 동작
const addTodoHandler = () => {
  if (todo.value.length >= 3) {
    // 부모 컴포넌트로 'add-todo' 이벤트 발신
    emit("add-todo", todo.value);
    todo.value = "";
  } else {
    // 입력된 내용 삭제
    alert("할 일은 3글자 이상으로 작성해주세요!!");
  }
};
</script>
