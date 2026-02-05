class fclass1 {
    int a, b;

    public static void main(String[] args) {
        fclass2 obj = new fclass2();
        obj.input();
        obj.show();
    }
}

class fclass2 extends fclass1 {
    void input() {
        a = 10;
        b = 20;
    }

    void show() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
