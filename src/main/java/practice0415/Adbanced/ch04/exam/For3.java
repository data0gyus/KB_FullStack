package practice0415.Adbanced.ch04.exam;

public class For3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i<= 100; i++){
            if (i % 3 ==0){
                sum += i;
            }
        }
        System.out.println("1~100에서 3의 배수의 총합 : " + sum);
    }
}
