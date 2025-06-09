<template>
  <div class="card card-body">
    <div className="mt-5">
      <img :src="member.photo" class="img" />
      <h3>{{ member.name }}({{ member.role }})</h3>
      <p>{{ member.desc }}</p>
      <a
        v-if="member.insta && member.insta !== 0"
        class="fa fa-instagram m-1"
        :href="member.insta"
      >
      </a>
      <a
        v-if="member.facebook && member.facebook !== 0"
        class="fa fa-facebook m-1"
        :href="member.facebook"
      >
      </a>
      <a
        v-if="member.youtube && member.youtube !== 0"
        class="fa fa-youtube m-1"
        :href="member.youtube"
      >
      </a>
      <br /><br />
      <RouterLink to="/members">멤버 목록으로</RouterLink>
    </div>
  </div>
</template>

<script>
import { useRoute } from "vue-router";
import members from "@/members.json";

export default {
  name: "MemberInfo",
  setup() {
    const currentRoute = useRoute();
    const id = parseInt(currentRoute.params.id, 10);
    const member = members.find((m) => m.id === id);
    console.log("현재 멤버:", member);
    return { member, currentRoute };
  },
};
</script>
