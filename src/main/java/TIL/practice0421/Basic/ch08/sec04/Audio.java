package TIL.practice0421.Basic.ch08.sec04;

public class Audio implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUNME){
            this.volume = RemoteControl.MAX_VOLUNME;
        }
        else if(volume<RemoteControl.MIN_VOLUNME){
            this.volume = RemoteControl.MIN_VOLUNME;
        }
        else{
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : " + volume);

    }
}
