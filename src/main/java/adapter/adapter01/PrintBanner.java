package adapter.adapter01;


public class PrintBanner extends Banner implements Print {
    // 상속은 코드 재사용
    // print는 사용자에게 보여주기 위함

    public PrintBanner(String string) {
        super(string);
    }

    // wrapper 역할
    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
