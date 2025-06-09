package Strategy;

/**
 * 가위바위보의 손을 표현하는 열거형
 * 각 손의 값과 승패 판정 로직을 포함
 */
public enum Hand {
    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);

    private String name;// 가위,바위,보 손의 이름
    private int handvalue;// 가위,바위,보 손의 값

    // 생성자
    private Hand(String name, int handvalue) {
        this.name = name;
        this.handvalue = handvalue;
    }

    // 값에 따라 손을 반환하는 정적 배열
    private static Hand[] hands = {
            ROCK, SCISSORS, PAPER
    };

    // 값을 기반으로 손 객체를 가져오는 정적 메서드
    public static Hand getHand(int handvalue) {
        return hands[handvalue];
    }

    /**
     * 손의 승패를 판정하는 메서드
     *@param h 비교할 다른 손
     *@return 무승부는 0, this가 이기면 1, h가 이기면 -1
     */
    private int fight(Hand h) {
        if(this == h) {
            return 0;// 같은 손이면 무승부
        } else if((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;// 이 손이 이기는 경우
        } else {
            return -1;// 이 손이 지는 경우
        }
    }

    // this가 h보다 강할 때 true 반환
    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    // this가 h보다 약할 때 true 반환
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    // 가위 바위 보의 문자열 표현
    @Override
    public String toString() {
        return name;
    }
}
