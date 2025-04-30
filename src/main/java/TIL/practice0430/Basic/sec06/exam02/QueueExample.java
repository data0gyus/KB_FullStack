package TIL.practice0430.Basic.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> mq = new LinkedList<>();

        mq.offer(new Message("sendMail", "홍길동"));
        mq.offer(new Message("sendSMS", "신용권"));
        mq.offer(new Message("sendKakaotalk", "감자바"));

        while (!mq.isEmpty()) {
            Message m = mq.poll();
            switch(m.command){
                case "sendMail":
                    System.out.println(m.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(m.to + "님에게 SMS를 보냅니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(m.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
