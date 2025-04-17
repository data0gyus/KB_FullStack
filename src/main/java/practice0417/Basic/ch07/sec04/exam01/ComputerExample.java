package practice0417.Basic.ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator c = new Calculator();

        System.out.println("원 면적 : " + c.areaCircle(r));
        System.out.println();

        Computer c1 = new Computer();
        System.out.println("원 면적 : " + c1.areaCircle(r));
    }
}
