package TIL.practice0510.Basic.sec04.exam01;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        char[] arr = {'C','D','E'};
        try{
            Writer w = new FileWriter("c:/temp/test.txt");
            w.write(a);
            w.write(b);
            w.write(arr);

            w.flush();
            w.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
