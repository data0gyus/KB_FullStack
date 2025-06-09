package TIL.practice0421.Basic.ch08.sec08;

public class SmartTelevision implements Searchable, RemoteControl {
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void trunOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void search(String url) {
        System.out.println( url + "을 검색합니다.");
    }
}
