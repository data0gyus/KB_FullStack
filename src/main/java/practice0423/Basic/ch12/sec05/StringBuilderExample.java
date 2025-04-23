package practice0423.Basic.ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")                  // 문자열 끝에 DEF 추가 -> DEF
                .insert(0, "ABC")     // 문자열 0번위치에 ABC 추가 -> ABCDEF
                .delete(3, 4)                   // 3번 인덱스부터 4번 직전까지 제거 -> 3번 인덱스 제거 (D 제거) -> ABCEF
                .toString();                    // 문자열 리턴
        System.out.println(data);
    }
}

// 결과 출력
// ABCEF
