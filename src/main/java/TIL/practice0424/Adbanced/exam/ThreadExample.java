package TIL.practice0424.Adbanced.exam;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new MovieThread();
        Thread t2 = new Thread(new MusicRunnable());

        t1.start();
        t2.start();
    }
}
