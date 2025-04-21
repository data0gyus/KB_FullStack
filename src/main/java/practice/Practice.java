package practice;

class Base{
    int x = 3;
    int getX(){
        return x * 2;
    }
    Base(){
        System.out.println("Base Constructor");
    }
}

class D extends Base{
    int x = 7;

    int getX(){
        return x * 3;
    }
    void display(){
        System.out.println("Child : " + x);
        System.out.println("Parent : " + super.x);
    }
    D(){
        System.out.println("D Constructor");
    }
}
class Person{
    String name;
    Person(String name){
        this.name = name;
    }
}
public class Practice {

    public void calculate(final int num){

        System.out.println("value : "+ num);
    }
    public static void main(String[] args) {
        Base a = new D();
        D b = new D();
//
//        System.out.println(a.getX() + a.x + b.getX() + b.x);
//        Base c = new Base();
//        System.out.println("c.getX() = " + c.getX());
//
//        final Person p = new Person("john");
//        System.out.println(p.name);
//        p.name = "Alice";
//        System.out.println(p.name);
//
//        Practice p1 = new Practice();
//        p1.calculate(50);
//
//        D ab = new D();
//        ab.display();
    }
}
