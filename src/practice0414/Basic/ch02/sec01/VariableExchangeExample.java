package practice0414.Basic.ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x:" + x+"," + "y:" + y);

        int b = x;
        x = y;
        y = b ;
        System.out.println("x:" + x+"," + "y:" + y);
    }
}
