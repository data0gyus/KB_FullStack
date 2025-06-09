<template>
  <div class="card card-body">
    <h2>Test</h2>

    <!-- 중첩 라우터 버튼 -->
    <div>
      <RouterLink :to="{ name: 'test/num', params: { num: 1 } }">
        <button class="btn btn-primary">1번 버튼</button>
      </RouterLink>
      <RouterLink :to="{ name: 'test/num', params: { num: 2 } }">
        <button class="btn btn-warning">2번 버튼</button>
      </RouterLink>
      <RouterLink :to="{ name: 'test/num', params: { num: 3 } }">
        <button class="btn btn-danger">3번 버튼</button>
      </RouterLink>
    </div>

    <!-- 라우트된 컴포넌트가 보여지는 부분 -->
    <RouterView />
  </div>
</template>

<script>
export default {
  name: "Test",
};
</script>
