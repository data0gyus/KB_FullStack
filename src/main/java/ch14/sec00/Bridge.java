package ch14.sec00;

public class Bridge {
    int counter; // 전체 통과 회수
    String name;
    String address;

    public Bridge() {
        counter = 0;
        name = "아무개";
        address = "모름";
    }

    synchronized public void across(String name, String address) { // race condition : CS 상태
        counter ++;
        this.name = name;
        this.address = address;
        check();
        // T1이 먼저 세팅: T1 이 Check 진입
        // T2가 this.name=name 까지 확인 및 변경  -> name = T2, address = T1이 되면서 문제 발생
        // Core가 많을 수록 더 많이 발생할 확률이 높아짐
        // Bridge는 1개 있는데 동시에 여러개를 써서 문제가 발생 -> 1개의 스레드만 쓸 수 있게 변경해야 함 : lock 운영
    }

    private void check() {
        if(name.charAt(0) != address.charAt(0)) {
            System.out.println("문제 발생 !!! " +this);
        }
    }

    @Override
    public String toString() {
        return "Bridge{" +
                "counter=" + counter +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
