
class student {

    void sum(int x) {
        System.out.println("The Square Value is " + x * x);
    }

    void sum(int x, int y) {
        System.out.println("The Sum Value is " + (x + y));
    }

    void sum(float x, float y) {
        System.out.println("The Sub Value is " + (x - y));
    }
}

class method_overloading {

    public static void main(String args[]) {
        student st = new student();
        st.sum(5);
        st.sum(30, 10);
        st.sum(50.00f, 30.00f);
    }
}
