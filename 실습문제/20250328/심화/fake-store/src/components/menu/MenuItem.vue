<template>
  <li class="nav-item">
    <RouterLink class="nav-link" :to="menu.url">
      <i :class="menu.icon"></i> {{ menu.title }}
    </RouterLink>
  </li>
</template>

<script>
export default {
  name: "MenuItem",
  props: {
    menu: {
      type: Object,
      required: true,
    },
  },
};
</script>
