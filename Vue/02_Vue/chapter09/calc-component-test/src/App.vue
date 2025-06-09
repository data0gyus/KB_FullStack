<template>
  <div>
    <h2>기본 모양</h2>
    <Calc />
    <br />
    <hr />

    <h2>ref를 이용한 반응형 데이터</h2>
    <Calc2 />
    <br />
    <hr />

    <h2>reactive를 이용한 반응형 데이터</h2>
    <Calc3 />
    <br />
    <hr />
    <h2>computed를 이용한 반응형 데이터</h2>
    <Calc4 />
  </div>
</template>
<script>
import Calc from "./components/Calc.vue";
import Calc2 from "./components/Calc2.vue";
import Calc3 from "./components/Calc3.vue";
import Calc4 from "./components/Calc4.vue";

export default {
  name: "App",
  components: { Calc, Calc2, Calc3, Calc4 },
};
</script>
