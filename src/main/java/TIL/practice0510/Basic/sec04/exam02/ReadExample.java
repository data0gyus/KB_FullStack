package TIL.practice0510.Basic.sec04.exam02;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        try{
            Reader r = null;
            // 1번 : 한 글자씩 처리
            r = new FileReader("C:/temp/test.txt");
            while(true){
                int data = r.read();
                if(data == -1) break;
                System.out.println((char)data);
            }
            r.close();
            System.out.println();

            // 2번 : 글자 배열로 처리
            r = new FileReader("C:/temp/test.txt");
            char[] arr = new char[1024];
            while(true){
                int data = r.read(arr);
                if(data == -1) break;
                for(int i=0; i<data; i++){
                    System.out.println(arr[i]);
                }
            }
            r.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
