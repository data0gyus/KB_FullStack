<template>
  <main class="component-grid">
    <!-- 컴포넌트 그룹 (그리드 아이템)-->
    <section class="component-card">
      <h2>버튼</h2>
      <Basebutton variant="primary">Primary</Basebutton>
      <Basebutton variant="outline">Outline</Basebutton>
      <Basebutton variant="pill">Pill</Basebutton>
    </section>
    <section class="component-card">
      <h2>알림창</h2>
      <BaseAlert variant="success">Success</BaseAlert>
      <BaseAlert variant="warning">Warning</BaseAlert>
      <BaseAlert variant="error">Error</BaseAlert>
    </section>
    <section class="component-card">
      <h2>뱃지</h2>
      <BaseBadge variant="success">success</BaseBadge>
      <BaseBadge variant="number">3</BaseBadge>
    </section>
  </main>
</template>

<script setup>
import Basebutton from './UI/Basebutton.vue'
import BaseAlert from './UI/BaseAlert.vue'
import BaseBadge from './UI/BaseBadge.vue'
</script>
