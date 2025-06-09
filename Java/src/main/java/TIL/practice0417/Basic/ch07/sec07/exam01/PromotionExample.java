package TIL.practice0417.Basic.ch07.sec07.exam01;
class A{ }
class B extends A{ }
class C extends A{ }
class D extends B{ }
class E extends C{ }

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        A a1 = b; // B → A 가능 : 업캐스팅
        A a2 = c; // C → A 가능 : 업캐스팅
        A a3 = d; // D → B → A 가능 : 업캐스팅
        A a4 = e; // E → C → A 가능 : 업캐스팅
        B b1 = d; // D → B 가능 : 업캐스팅
        C c1 = e; // E → C 가능 : 업캐스팅
        //B b3 = e; // E는 C 계열이라 B로 변환 불가
        //C c2 = d; // D는 B 계열이라 C로 변환 불가
    }
}

// A 아래에 B 와 C 존재
// B 아래에는 D 존재  =>  A - B - D
// C 아래에는 E 존재  =>  A - C - E
// 형제 클래스 간에는 상속 관계가 없기 때문에 타입 변환 불가
