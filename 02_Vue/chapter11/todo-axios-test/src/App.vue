<template>
  <DefaultLayout>
    <!-- header slot에 Header 컴포넌트 끼워넣기 -->
    <template v-slot:header><Header /> </template>

    <!-- navbar slot에 Navbar 컴포넌트 끼워넣기 -->
    <template v-slot:navbar><Navbar /> </template>

    <!-- <slot>에 라우트된 페이지 끼워넣기 -->
    <template v-slot:default><RouterView /> </template>
  </DefaultLayout>
</template>

<script setup>
import { RouterView } from "vue-router";
import DefaultLayout from "./components/layouts/DefaultLayout.vue";
import Header from "./components/layouts/Header.vue";
import Navbar from "./components/layouts/Navbar.vue";
</script>
