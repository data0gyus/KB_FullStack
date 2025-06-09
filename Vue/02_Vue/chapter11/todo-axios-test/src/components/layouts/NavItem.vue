<!-- NavItem 컴포넌트 -->
<template>
  <li class="nav-item">
    <RouterLink class="nav-link" :to="menu.uri">{{ menu.text }}</RouterLink>
  </li>
</template>

<script setup>
const props = defineProps({
  menu: {
    type: Object,
    required: true,
  },
});
</script>
