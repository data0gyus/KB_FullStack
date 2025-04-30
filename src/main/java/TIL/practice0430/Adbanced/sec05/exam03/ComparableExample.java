package TIL.practice0430.Adbanced.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<Person>();

        ts.add(new Person("홍길동", 35));
        ts.add(new Person("감자바", 25));
        ts.add(new Person("박지원",31));

        for (Person p : ts) {
            System.out.println(p.name + " : " + p.age);
        }
    }
}
