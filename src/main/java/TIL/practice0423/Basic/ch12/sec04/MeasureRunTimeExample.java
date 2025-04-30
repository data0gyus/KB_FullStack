package TIL.practice0423.Basic.ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long s = System.nanoTime();
        int sum = 0;
        for (int i = 1; i<= 1000000; i++){
            sum += i;
        }
        long e = System.nanoTime();

        System.out.println("1부터 1000000까지의 합 : "+ sum );
        System.out.println((e-s) + "나노초가 걸렸습니다.");
    }
}
