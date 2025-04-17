package practice0416.Basic.ch06.sec06.exam01;

public class Car {
    // 필드 선언
    String model;       // 예상 : null
    boolean start;      // 예상 : false
    int speed;          // 예상 : 0



    // main 만들어서 확인해보기
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();

        // Car 객체의 필드값 읽기
        System.out.println("모델명: " + myCar.model);
        System.out.println("시동여부: " + myCar.start);
        System.out.println("현재속도: " + myCar.speed);

        // 확인 결과
        // 모델명: null
        // 시동여부: false
        // 현재속도: 0


    }
}
