package TIL.practice0510.Basic.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        byte[] array = {65,66,67};
        try{
            OutputStream os = new FileOutputStream("C:/temp/test2.db");

            os.write(array);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
