package pracitce0415.Basic.ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        //intArray[0] =10; // NullPointerException

        String str = null;
        //System.out.println("총 문자 수 :" + str.length());  // NullPointerException
    }
}
// 변수가 null인 상태에서 객체의 데이터나 메소드를 사용하려 할 때 발생하는 예외
// 참조 변수가 객체를 정확히 참조하도록 번지를 대입해야 해결됨
