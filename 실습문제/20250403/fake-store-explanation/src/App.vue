<!-- 루트 컴포넌트 -->
<template>
  <DefaultLayout>
    <!-- 헤더 컴포넌트 표시 -->
    <template v-slot:header><Header /></template>
    <!-- 네비게이션 컴포넌트 표시 -->
    <template v-slot:navbar><NavBar /></template>

    <!-- 라우터 뷰 컴포넌트 표시 -->
    <template v-slot:default><RouterView /></template>

    <!-- 푸터 컴포넌트 표시 -->
    <template v-slot:footer><Footer /></template>
  </DefaultLayout>
</template>

<script setup>
import { RouterView } from "vue-router";
import DefaultLayout from "./components/DefaultLayout.vue";
import Header from "./components/Header.vue";
import NavBar from "./components/NavBar.vue";
import Footer from "./components/Footer.vue";
</script>
