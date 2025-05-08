package ch17.exam01;

import java.util.ArrayList;
import java.util.List;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("홍길동","남",92));
        totalList.add(new Student("김수영","여",87));
        totalList.add(new Student("감자바","남",95));
        totalList.add(new Student("오해영","여",93));

        List<Student> maleList = new ArrayList<>();
        for (Student student : totalList) {
            if (student.getSex().equals("남")){
                maleList.add(student);
            }
        }

        // 스트림을 사용하는 경우
        List<Student> maleList2 = totalList.stream()
                .filter(s->s.getSex().equals("남"))
                .toList();

        List<Student> topList = totalList.stream()
//                .sorted(Comparator.reverseOrder())
                .sorted((a,b) -> Integer.compare(b.getScore(),a.getScore()))
                .limit(2)
                .toList();
        topList.forEach(System.out::println);
    }

}
