package TIL.practice0510.Basic.sec03.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("C:/temp/test1.db");
            while(true){
                int data = is.read();
                if(data == -1) break;
                System.out.println(data);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
