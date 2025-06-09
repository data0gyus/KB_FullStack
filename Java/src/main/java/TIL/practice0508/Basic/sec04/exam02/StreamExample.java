package TIL.practice0508.Basic.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = {"홍길동", "신용권","김미나"};
        Stream<String> str = Arrays.stream(strArray);
        str.forEach(s -> System.out.print(s + " , "));
        System.out.println();

        int [] intArray = {1,2,3,4,5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(i -> System.out.print(i + " , "));
    }
}
