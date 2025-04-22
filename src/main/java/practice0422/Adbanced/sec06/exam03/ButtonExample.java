package practice0422.Adbanced.sec06.exam03;



public class ButtonExample {
    public static void main(String[] args) {
        // Ok 버튼 객체 생성
        Button btnOk = new Button();

        class Okl implements Button.ClickListener{
            @Override
            public void onClick() {
                System.out.println("Ok 버튼을 클릭했습니다.");
            }
        }

        btnOk.setClickListener(new Okl());

        // Ok 버튼 클릭하기
        btnOk.click();
    }
}
