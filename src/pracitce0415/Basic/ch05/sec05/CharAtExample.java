package pracitce0415.Basic.ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        char a = ssn.charAt(6);

        switch(a) {
            case'1':
            case'3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case'4':
                System.out.println("여자입니다.");
                break;
        }
    }
}
