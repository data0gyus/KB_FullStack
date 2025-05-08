package ch17.exam01;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Student implements Comparable<Student> {
    private String name;
    private String sex;
    private int score;

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.score, o.score);
    }

    @Override
    public String toString() {
        return name + " (" + sex + ", " + score + ")";
    }
}
