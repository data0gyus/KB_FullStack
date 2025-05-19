package Strategy;

import java.util.Random;

/**
 * 이기면 다음에도 같은 손을 내는 단순한 전략
 */
public class WinningStrategy implements Strategy {
    private Random random;// 랜덤 객체
    private boolean won = false;// 이전 게임에서 이겼는지 여부
    private Hand prevHand;// 이전에 냈던 손

    // 생성자: 난수 생성을 위한 시드값 받음
    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if(!won) {
            // 지난 게임에서 이기지 못했으면 새로운 손을 선택
            prevHand = Hand.getHand(random.nextInt(3));
        }

        // 이겼으면 이전과 같은 손을, 졌으면 새로운 손을 반환
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        // 이번 게임의 승패 결과를 저장
        won = win;
    }
}