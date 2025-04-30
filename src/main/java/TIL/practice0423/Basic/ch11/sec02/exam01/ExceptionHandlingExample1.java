package TIL.practice0423.Basic.ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data){
        int result = data.length(); // data가 null일 경우 NullPointerException 발생할 수 있음
        System.out.println("문자 수 : " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); // null값 대입으로 예외 발생
        System.out.println("[프로그램 종료]"); // 예외 발생으로 출력되지 않음
    }
}

// 결과 - 오류 발생
// [프로그램 시작]
//
// 문자 수 : 10
// 2 actionable tasks: 2 executed
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
//	at practice0423.Basic.ch11.sec02.exam01.ExceptionHandlingExample1.printLength(ExceptionHandlingExample1.java:5)
//	at practice0423.Basic.ch11.sec02.exam01.ExceptionHandlingExample1.main(ExceptionHandlingExample1.java:12)