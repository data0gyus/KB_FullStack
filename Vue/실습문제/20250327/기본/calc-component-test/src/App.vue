<template>
  <div>
    <Calc1 />
    <br />
    <hr />

    <Calc2 />
    <br />
    <hr />

    <Calc3 />
    <br />
    <hr />

    <Calc4 />
    <br />
    <hr />
    <Calc5 />
  </div>
</template>

<script>
import Calc1 from "./components/Calc1.vue";
import Calc2 from "./components/Calc2.vue";
import Calc3 from "./components/Calc3.vue";
import Calc4 from "./components/Calc4.vue";
import Calc5 from "./components/Calc5.vue";

export default {
  name: "App",
  components: { Calc1, Calc2, Calc3, Calc4, Calc5 },
};
</script>
