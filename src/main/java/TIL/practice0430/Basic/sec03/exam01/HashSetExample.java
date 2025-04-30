package TIL.practice0430.Basic.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        // 객체 저장
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java"); // 중복 객체이므로 저장하지 않음
        set.add("iBATIS");

        // 저장된 객체 수 출력
        int size = set.size();
        System.out.println("총 객체 수 : " + size);
    }
}
// 예상
// 총 객체 수 : 4
// Set 컬렉션은 객체를 중복해서 저장할 수 없음
// 따라서, Java가 중복 객체이므로 하나만 저장됨

// 출력 결과
// 총 객체 수 : 4
