package practice0423.Adbanced.ch11.sec06;

public class AccountExample {
    public static void main(String[] args) {
        Account a = new Account();

        a.deposit(10000);
        System.out.println("계좌 잔고 : " + a.getBalance());

        try{
            a.withdraw(5000);
            System.out.println("5000원 인출 : " + a.getBalance());
            System.out.println("계좌 잔고 : " + a.getBalance());

            a.withdraw(7000);
            System.out.println("7000원 인출 : " + a.getBalance());
            System.out.println("계좌 잔고 : " + a.getBalance());
        } catch (InsufficientException e){
            System.out.println("예외 발생 : " + e.getMessage());
        }

        System.out.println("계좌 잔고 : " + a.getBalance());

    }
}
