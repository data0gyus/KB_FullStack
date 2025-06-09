export default {
  /* Header 컴포넌트에서 사용할 데이터터 */
  title: "Fake Store", // 메인타이틀
  subtitle: "Vue3 연습사이트", // 서브타이틀

  /* Navbar 컴포넌트 - MenuGroup 컴포넌트에서 사용할 데이터 */
  menus: [
    // 메인 메뉴 구성정보
    {
      title: "가전",
      url: "/electronics",
      icon: "fa-solid fa-tv",
      backgroundImage: "",
    },
    {
      title: "주얼리",
      url: "/jewelery",
      icon: "fa-solid fa-gem",
    },
    {
      title: "남성의류",
      url: "/mensclothing",
      icon: "fa-solid fa-user-tie",
    },
    {
      title: "여성의류",
      url: "/womensclothing",
      icon: "fa-solid fa-person-dress",
    },
  ],
};
