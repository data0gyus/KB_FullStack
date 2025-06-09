<template>
  <div class="card card-body">
    <h2>TestChild</h2>
    <h3>파라미터 num : {{ num }}</h3>
    <button class="btn btn-secondary" @click="closeTest">닫기</button>
  </div>
</template>

<script>
import { useRoute, useRouter } from "vue-router";
import { ref, watchEffect } from "vue"; // Composition API 방식의 단일 값 proxy 래핑 객체

export default {
  name: "TestChild",

  setup() {
    // 현재 라우트 정보 (path, fullpath, params 등의 정보가 담겨 있음)
    const currentRoute = useRoute();

    // 동적 라우트(:num)에 전달된 값 얻어와 num 변수에 저장
    const num = ref(currentRoute.params.num);

    // watchEffect : ref, reactive 변화가 감지되면 수행
    watchEffect(() => {
      // num에 바뀐 파라미터 대입 -> 컴포넌트 다시 랜더링
      num.value = currentRoute.params.num;
    });

    // 프로그래밍 방식의 라우팅 제어하기
    const router = useRouter();

    const closeTest = () => {
      router.push("/test"); // /test로 라우팅 -> 주소 변경 + 컴포넌트 변경

      // <RouterLink to="/test"> 클릭한 것과 같은 효과
    };

    // setup 에서 return된 속성만 template에서 사숑 가능
    return { num, closeTest };
  },
};
</script>
