package TIL.practice0421.Basic.ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.trunOn();
        rc.turnOff();

        Searchable searchable = new SmartTelevision();
        searchable.search("http://www.youtube.com");
    }
}
