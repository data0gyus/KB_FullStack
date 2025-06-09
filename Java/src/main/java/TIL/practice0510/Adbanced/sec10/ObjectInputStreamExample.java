package TIL.practice0510.Adbanced.sec10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("c:/temp/object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Member m = (Member) ois.readObject();
        Product p = (Product) ois.readObject();
        int[] arr = (int[]) ois.readObject();

        System.out.println(m);
        System.out.println(p);
        System.out.println(Arrays.toString(arr));

        ois.close();
        fis.close();
    }
}
