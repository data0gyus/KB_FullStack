package TIL.practice0508.Adbanced.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

        IntStream intS = Arrays.stream(intArray);
//        intS.asDoubleStream().forEach(System.out::println);
        intS.asDoubleStream().forEach(i -> System.out.println(i));

        System.out.println();

        intS = Arrays.stream(intArray);
        intS.boxed().forEach(i -> System.out.println(i));
//        intS.boxed().forEach(System.out::println);
//        intS.boxed().forEach(i -> System.out.println(i.intValue()));
    }
}
