package practice0423.Basic.ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for(int i=0; i<=array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            }catch (NumberFormatException e) {
                System.out.println("예외 발생 : 숫자 형식 오류 - " + e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("예외 발생 : 배열 인덱스 초과 - " + e.getMessage());
            } catch (Exception e) {
                System.out.println("문제 발생");
            }
        }
    }
}
