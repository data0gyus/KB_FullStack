package TIL.practice0429.Adbanced.ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1번 Board 객체를 저장할 ArrayList 생성
        List<Board> list = new ArrayList<>();

        // 2번 인스턴스 5개 생성하여 ArrayList에 추가
        list.add(new Board("제목A", "내용A", "글쓴이A" ));
        list.add(new Board("제목B", "내용B", "글쓴이B" ));
        list.add(new Board("제목C", "내용C", "글쓴이C" ));
        list.add(new Board("제목D", "내용D", "글쓴이D" ));
        list.add(new Board("제목E", "내용E", "글쓴이E" ));

        // 3번 저장된 요소의 개수 출력
        System.out.println("저장된 요소의 개수 : " + list.size());
        System.out.println();

        // 4번 3번째 데이터를 추출하여 출력
        System.out.println("3번째 데이터 : " + list.get(2));
        Board board = list.get(2);
        System.out.println(board.getSubject() + " \t" + board.getContent() + " \t" + board.getWriter());
        System.out.println();

        // 5번 for문으로 순회하면서 리스트의 각 요소 출력
        System.out.println("=== 일반 for문 순회 ===");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        for (int i=0; i<list.size(); i++){
            Board b = list.get(i);
            System.out.println(b.getSubject() + " \t" + b.getContent() + " \t" + b.getWriter());
        }
        System.out.println();

        // 6번 인덱스 2에 해당하는 요소 제거
        list.remove(2);

        // 7번 인덱스 2에 해당하는 요소 제거
        list.remove(2);

        // 8번 향상된 for문으로 순회하면서 리스트의 각 요소 출력
        System.out.println("=== 향상된 for문 순회 ===");
        for(Board b : list){
            System.out.println(b);
        }
        System.out.println();
        for (Board b : list){
            System.out.println(b.getSubject() + " \t" + b.getContent() + " \t" + b.getWriter());
        }

    }
}
