
class student1 {

    int roll;
    String name;

    void getdata() {
        roll = 101;
        name = "Karim";
    }
}

class display extends student1 {

    void display() {
        System.out.println("Roll is :" + roll);
        System.out.println("Name is :" + name);
    }
}

class single_inheritance {

    public static void main(String[] args) {
        display d = new display();
        d.getdata();
        d.display();
    }
}
