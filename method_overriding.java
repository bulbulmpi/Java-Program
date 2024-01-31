
class Parent {

    void display() {
        System.out.println("parent method is executed");
    }
}

class Child extends Parent {

    @Override
    void display() {
        System.out.println("child method is executed");
    }
}

public class method_overriding {

    public static void main(String args[]) {
        Parent p = new Parent();
        p.display();
        Parent c = new Child();
        c.display();
    }
}
