package practice0416.Basic.ch06.sec07.exam03;

public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    public Korean() {
    }

    // alt+insert 키 누르면 생성자 누르면 생성자 선언 가능
    // 생성자 선언
    public Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
