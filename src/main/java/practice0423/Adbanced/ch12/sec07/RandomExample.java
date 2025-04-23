package practice0423.Adbanced.ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        int[] a = new int[6];
//        Random r = new Random(3); // 우선은 선택한 번호는 고정시킴
        Random r = new Random();
        System.out.print("선택 번호 : ");
        for(int i=0; i<6 ; i++){
            a[i] = r.nextInt(45) +1;
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int[] b = new int[6];
//        Random r2 = new Random(5); // 우선은 당첨 번호 고정 - if문이 돌아가는지 확인하기 위함
        Random r2 = new Random();
        System.out.print("당첨 번호 : ");
        for(int i=0; i<6 ; i++){
            b[i] = r2.nextInt(45) +1;
            System.out.print(b[i] + " ");
        }
        System.out.println();

        Arrays.sort(a);
        Arrays.sort(b);
        boolean result = Arrays.equals(a, b);
        if (result){
            System.out.println("당첨 결과 : 1등입니다.");
        } else {
            System.out.println("당첨 결과 : 당첨되지 않았습니다.");
        }
    }
}
