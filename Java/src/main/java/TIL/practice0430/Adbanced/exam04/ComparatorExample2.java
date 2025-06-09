package TIL.practice0430.Adbanced.exam04;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorExample2 {
    public static void main(String[] args) {
        TreeSet<Fruit> ts = new TreeSet<Fruit>(new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                if(o1.price < o2.price) return -1;
                else if(o1.price == o2.price) return 0;
                else return 1;
            }
        });

        ts.add(new Fruit("포도", 3000));
        ts.add(new Fruit("수박", 10000));
        ts.add(new Fruit("딸기", 6000));

        for (Fruit f : ts) {
            System.out.println(f.name + " : " + f.price);
        }
    }
}
