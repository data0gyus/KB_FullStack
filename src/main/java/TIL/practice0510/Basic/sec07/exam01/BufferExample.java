package TIL.practice0510.Basic.sec07.exam01;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws Exception {

            String ofp1 = BufferExample.class.getResource("/TIL/practice0510/Basic/sec07/exam01/originalFile1.jpg").getPath();
            String tfp1 = "C:/temp/originalFile2.jpg";
            FileInputStream fis = new FileInputStream(ofp1);
            FileOutputStream fos = new FileOutputStream(tfp1);
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            long bufferTime = copy(bis, bos);
            System.out.println("향상 보조 스트림 사용 : " + bufferTime);

            bos.close();
            bis.close();
            fos.close();
            fis.close();
    }

    private static long copy(InputStream inputStream, OutputStream outputStream) throws Exception {
        long start = System.nanoTime();

        while(true) {
            int data = inputStream.read();
            if(data == -1) break;
            outputStream.write(data);
        }
        outputStream.flush();
        long end = System.nanoTime();
        return(end - start);

    }
}
