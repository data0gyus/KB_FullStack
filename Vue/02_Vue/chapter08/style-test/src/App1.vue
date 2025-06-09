<template>
  <div>
    <NamedSlotTest />
    <ScopedSlotTest />
  </div>
</template>

<script>
import NamedSlotTest from "./components/slots/NamedSlotTest.vue";
import ScopedSlotTest from "./components/slots/ScopedSlotTest.vue";
export default {
  name: "App1",
  components: { NamedSlotTest, ScopedSlotTest },
};
</script>
