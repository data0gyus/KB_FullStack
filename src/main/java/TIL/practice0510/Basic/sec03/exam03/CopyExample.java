package TIL.practice0510.Basic.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) {
        String originalFileName = "C:/temp/test1.jpg";
        String targerFileName = "C:/temp/test2.jpg";
        try{
            InputStream in = new FileInputStream(originalFileName);
            OutputStream out = new FileOutputStream(targerFileName);

            byte[] data = new byte[1024];
//            while(true){
//                int num = in.read(data);
//                if(num == -1) break;
//                out.write(data, 0, num);
//            }
            in.transferTo(out);

            out.flush();
            out.close();
            in.close();

            System.out.println("복사가 잘 되었습니다. 확인하세요!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
