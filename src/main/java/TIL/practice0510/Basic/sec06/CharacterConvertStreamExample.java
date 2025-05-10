package TIL.practice0510.Basic.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) {
        String str = "문자 변환 스트림을 사용합니다.";
        write(str);
        String data = read();
        System.out.println(data);
    }

    public static void write(String str) {
        try{
            OutputStream out = new FileOutputStream("c:/temp/test.txt");
            Writer w = new OutputStreamWriter(out, "UTF-8");
            w.write(str);
            w.flush();
            w.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String read() {
        try{
            InputStream in = new FileInputStream("c:/temp/test.txt");
            Reader r = new InputStreamReader(in, "UTF-8");
            char[] arr = new char[1024];
            int data = r.read(arr);
            r.close();
            String str = new String(arr,0,data);
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
