package practice0414.Basic.ch03.sec03;

public class OverFlowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i=0; i<5; i++){
            var1++;
            System.out.println("var1 = " + var1);
        }
        System.out.println("----------------------");

        byte var2 = -125;
        for(int i=0; i<5; i++){
            var2--;
            System.out.println("var2 = " + var2);
        }
    }
}
// var1 = 126
//var1 = 127
//var1 = -128
//var1 = -127
//var1 = -126
//----------------------
//var2 = -126
//var2 = -127
//var2 = -128
//var2 = 127
//var2 = 126