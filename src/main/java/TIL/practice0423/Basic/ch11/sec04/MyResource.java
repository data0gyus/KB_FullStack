package TIL.practice0423.Basic.ch11.sec04;

public class MyResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("[MyResource(" + name + ") 닫기]");
    }

    private String name;
    public MyResource(String name) {
        this.name = name;
        System.out.println("[MyResource(" + name + ") 열기]");
    }
    public String read1() {
        System.out.println("[MyResource(" + name + ") 읽기]");
        return "100";
    }
    public String read2() {
        System.out.println("[MyResource(" + name + ") 읽기]");
        return "abc";
    }
}
