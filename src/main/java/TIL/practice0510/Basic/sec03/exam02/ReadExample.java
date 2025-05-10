package TIL.practice0510.Basic.sec03.exam02;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("c:/temp/test2.db");

            byte[] data;
            data = new byte[100];
            while(true){
                int c = is.read(data);
                if(c == -1) break;

                for (int i = 0; i < c; i++) {
                    System.out.println(data[i]);
                }

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
