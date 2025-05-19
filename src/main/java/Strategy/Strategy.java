package Strategy;

/**
 * 가위바위보 전략을 정의하는 인터페이스
 * 모든 전략 클래스는 이 인터페이스를 구현해야 함
 */
public interface Strategy {
    /**
     * 다음에 낼 손을 결정하는 메서드
     *@return 다음에 낼 손
     */
    Hand nextHand();

    /**
     * 게임 결과를 학습하는 메서드
     *@paramwin 이겼으면 true, 졌으면 false
     */
    void study(boolean win);
}
