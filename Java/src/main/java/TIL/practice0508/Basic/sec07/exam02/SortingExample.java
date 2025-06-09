package TIL.practice0508.Basic.sec07.exam02;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동",30));
        studentList.add(new Student("신용권",10));
        studentList.add(new Student("유미선",20));

        // 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
        studentList.stream()
                .sorted((a,b) -> Integer.compare(a.getScore(), b.getScore()))
                .forEach(i -> System.out.println(i.getName() + " : " + i.getScore()));
        System.out.println();

        // 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
        studentList.stream()
                .sorted((a,b) -> Integer.compare(b.getScore(), a.getScore()))
                .forEach(i -> System.out.println(i.getName() + " : " + i.getScore()));
    }
}
