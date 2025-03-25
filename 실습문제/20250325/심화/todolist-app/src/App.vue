<!-- vewinit : vue3 기본 형태 스니펫 -->

<template>
  <div id="app" class="container">
    <div class="card card-body bg-light">
      <div class="title">🕒 TodoList App 💻</div>
    </div>

    <div class="card card-default card-borderless">
      <div class="card-body">
        <!-- 입력용 컴포넌트 
          방출(add-todo)된 이벤트가 감지 되었을 때
          addTodo() 메서드 호출
        -->
        <InputTodo @add-todo="addTodo" />
        <!-- 카운트 컴포넌트 -->
        <TodoCount
          :todolist="todolist"
        /><!--:completedCount="completedCount" />-->

        <!-- 목록 컴포넌트 
            - 목록 화면 렌더링에 필요한 데이터 todolist를 
              부모(App.vue)가 가지고 있음

            - 부모 -> 자식 데이터 전달 : props 이용
              -> v-bind : 전달할 이름 = "데이터"
         -->
        <TodoList
          v-bind:todolist="sortedList"
          @toggle-completed="toggleCompleted"
          @delete-todo="deleteTodo"
        />
      </div>
    </div>
  </div>
</template>
<script>
// import 태그명 from '경로';
import InputTodo from "./components/InputTodo.vue";
import TodoList from "./components/TodoList.vue";
import TodoCount from "./components/TodoCount.vue";

export default {
  components: {
    // 사용할 자식 컴포넌트 등록
    InputTodo,
    TodoList,
    TodoCount,
  },
  data() {
    return {
      todolist: [
        { id: Date.now(), todo: "자전거 타기", completed: false },
        { id: Date.now() + 1, todo: "딸과 공원 산책", completed: true },
        { id: Date.now() + 2, todo: "일요일 애견 카페", completed: false },
        { id: Date.now() + 3, todo: "Vue 원고 집필", completed: false },
      ],
    };
  },
  methods: {
    /* 할 일 추가 메서드 */
    // receiveTodo : InputTodo 컴포넌트의
    // this.$emit("add-todo", this.todo); 에서 전달된 this.todo (payload)

    addTodo(receiveTodo) {
      this.todolist.push({
        id: Date.now(),
        todo: receiveTodo,
        completed: false,
      });
    },

    /* 할 일 완료 여부 변경 메서드 */
    // 매개변수 id : TodoListItem 에서 부터 전달된 id
    toggleCompleted(id) {
      let index = this.todolist.findIndex((item) => id === item.id);
      this.todolist[index].completed = !this.todolist[index].completed;
    },

    /* 할 일 삭제 메서드 */
    // 매개변수 id : TodoListItem 에서 부터 전달된 id
    deleteTodo(id) {
      // 배열.findIndex(콜백함수) : 콜백 함수의 결과가 true인 index를 반환
      let index = this.todolist.findIndex((item) => id === item.id);
      this.todolist.splice(index, 1);
    },
  },

  // computed : data가 변할 때 자동으로 계산
  // -> 계산되서 return된 값은 함수명(sortedList)으로 사용
  computed: {
    /*completedCount() {
      // todolist의 요소 중 completed 가 true인 요소만 남긴 배열 반환
      return this.todolist.filter((todo) => todo.completed).length;
    },*/
    // 정렬
    sortedList() {
      this.todolist.sort((t1, t2) => {
        // true > false  -> 결과 : true
        if (t1.completed > t2.completed) {
          return 1; // 양수 반환 시 자리 바뀜 (t1, t2 -> t2, t1)
        }

        if (t1.completed < t2.completed) {
          return -1; // 음수 반환 시 자리 바꿈 X
        }

        // 위 if문 실행 X === completed가 같을 경우
        // -> 문자열 오름 차순 정렬

        // 모두 소문자로 변경(대소문자 구분 X)
        const todo1 = t1.todo.toLowerCase();
        const todo2 = t2.todo.toLowerCase();

        if (todo1 > todo2) return 1; // 자리 교체
        else if (todo1 === todo2) return 0; // 유지
        else return -1; // 유지
      });

      // 정렬된 todoList 반환
      return this.todolist;
    },
  },
};
</script>
