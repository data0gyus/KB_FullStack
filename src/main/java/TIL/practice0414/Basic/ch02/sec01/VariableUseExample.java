package TIL.practice0414.Basic.ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int minut = 5;
        System.out.println(hour + "시간 " + minut+ "분" );
        int totalMinute = 60*hour + minut;
        System.out.println("총 "+ totalMinute +"분");
    }
}
