package TIL.practice0510.Basic.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        byte a = 65;
        byte b = 66;
        byte c = 67;

        try {
            OutputStream os = new FileOutputStream("C:/temp/test1.db");

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
