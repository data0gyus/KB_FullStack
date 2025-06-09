package TIL.practice0421.Basic.ch08.sec04;

public interface RemoteControl {
    int MAX_VOLUNME = 10;
    int MIN_VOLUNME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
