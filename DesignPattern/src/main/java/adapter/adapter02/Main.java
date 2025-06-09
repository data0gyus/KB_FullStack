package adapter.adapter02;

import adapter.adapter01.Banner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();

        print(new PrintBanner(new Banner("Hello")));
    }

    // 고정된 사용자측 코드
    public static void print(Print p){
        p.printWeak();
        p.printStrong();

    }
}
