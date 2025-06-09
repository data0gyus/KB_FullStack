package TIL.practice0508.Basic.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum; // 합계를 구하기 위한 변수

    public static void main(String[] args) {
        IntStream Intstream = IntStream.rangeClosed(1,100);
        sum = Intstream.sum();
//        Intstream.forEach(a -> sum += a);
        System.out.println("총합 : " + sum);
    }
}
