package template;

public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    // AbstractDisplay에서 구현 하는 메서드
    public final void display() {
        open();
        for(int i =0;i<5 ; i++){
            print();
        }
        close();
    }
}
