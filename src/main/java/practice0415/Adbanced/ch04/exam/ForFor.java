package practice0415.Adbanced.ch04.exam;

public class ForFor {
    public static void main(String[] args) {
        for(int i = 1; i <=10; i++){
            for(int j = 1; j<=10; j++){
                int a = 4*i + 5*j;
                if(a == 60){
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}
