package practice0414.Basic.ch02.sec02;

public class Error {
    public static void main(String[] args) {
//        int value;
        int value = 3;
        int result = value + 10; //에러
        System.out.println(result);
    }
}
// java: variable value might not have been initialized
// 변수의 초기화
// 초기화 되지 않은 변수를 사용하여 컴파일 에러 발생
