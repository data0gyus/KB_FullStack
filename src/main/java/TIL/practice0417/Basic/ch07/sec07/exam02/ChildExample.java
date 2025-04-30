package TIL.practice0417.Basic.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        // 자식 객체 생성
        Child child = new Child();

        // 자동 타입 변환 - 업캐스팅
        Parent parent = child;


        parent.method1(); // Parent()의 method1() 호출
        parent.method2(); // Child에서 오버라이딩된 method2() 호출
        // parent.method3(); // <= 잘못된 코드
                             // why? Parent 타입에는 method3() 메서드가 없기 때문에
                             // 실제 객체는 child지만, 참조 타입이 Parent이기 때문
    }
}
