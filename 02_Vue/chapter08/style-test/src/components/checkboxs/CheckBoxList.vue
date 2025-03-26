<template>
  <div v-for="item in items" :key="item.id">
    <slot name="icon" :checked="item.checked"></slot>
    <!-- {checked}-->
    <input
      type="checkbox"
      :value="item.id"
      :checked="item.checked"
      @change="
        $emit('check-changed', { id: item.id, checked: $event.target.checked })
      "
    />
    <slot :checked="item.checked" :label="item.label"></slot>
    <!-- {checked, label }-->
  </div>
</template>
<script>
export default {
  name: "CheckBoxList",
  props: ["items"], // 배열
};
</script>
