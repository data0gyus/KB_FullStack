package TIL.practice0510.Adbanced.sec10;

import java.io.Serializable;

public class Member implements Serializable {
    private String id;
    private String name;

    @Override
    public String toString() {
        return id + ": " + name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
