<!-- 메뉴 아이템 컴포넌트 -->

<template>
  <li class="nav-item">
    <!-- props로 전달 받은 menu객체의 url 속성 값을 router-link의 to 속성에 대입 -->
    <router-link class="nav-link" :to="menu.url">
      <!-- props로 전달 받은 menu객체의 icon 속성 값(font-awesome 아이콘 클래스)을 class에 대입 -->
      <i :class="menu.icon"></i>
      {{ menu.title }}
    </router-link>
  </li>
</template>

<script setup>
const props = defineProps({
  menu: { Type: Object, required: true },
});
</script>
