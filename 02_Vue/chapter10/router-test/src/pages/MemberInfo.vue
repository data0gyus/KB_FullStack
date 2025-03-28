<template>
  <div class="card card-body">
    <h2>MemberInfo</h2>

    <h3>현재 아이디 : {{ id }}</h3>
  </div>
</template>

<script>
import { useRoute, useRouter } from "vue-router";
export default {
  name: "MemberInfo",
  setup() {
    // useRoute() : 현재 라우트 정보 객체
    const currentRoute = useRoute();

    // useRouter() : 라우터 인스턴스(페이지 이동, 히스토리 제어)
    const router = useRouter();

    console.log("currentRoute : ", currentRoute);
    console.log("router : ", router);

    // 동적 라우트 시 지정한 파라미터(:id) 얻어오기
    const id = currentRoute.params.id;

    return { id };
  },
};
</script>
