package adapter.adapter01;

public class Main {
    public static void main(String[] args) {
//        Print p =  new PrintBanner("Hello");
//        // 인터페이스            어댑터
//        p.printWeak();
//        p.printStrong();

        print(new PrintBanner("Hello"));
    }
    // 고정된 사용자측 코드
    public static void print(Print p){
        p.printWeak();
        p.printStrong();
    }
}
