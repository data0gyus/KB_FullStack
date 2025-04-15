package practice0414.Advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 입력:" );
        int x = scanner.nextInt();

        System.out.print("y값 입력:");
        int y = scanner.nextInt();

        int result = x + y;
        System.out.println("x+y : "+result);

        while (true) {
            System.out.print("입력 문자열 :");
            String s = scanner.next();
            if(s.equals("q")){
                break;
            }
            System.out.println("출력 문자열: " +s);
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
