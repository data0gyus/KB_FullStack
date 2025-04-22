package practice0422.Basic.sec06.exam01;

public class ButtonExample {
    public static void main(String[] args) {


        // Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스 ( 로컬 클래스 )
        class Listener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

//        Button b = new Button();
//        b.setClick(new Listener());
//        b.use();
    }
}
