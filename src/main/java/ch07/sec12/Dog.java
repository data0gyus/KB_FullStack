package ch07.sec12;

public class Dog extends Animal {


    public Dog(){
        super.name = "초코";
    }

    @Override
    public void sound() {
        System.out.println(name + " : 왈왈, 멍멍, 깨갱");
    }
}

