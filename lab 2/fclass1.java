class fclass1 {
    public void show1() {
        System.out.println("Бұл fclass1 класы");
    }

    public static void main(String[] args) {
        fclass2 obj = new fclass2();
        obj.show1();
        obj.show3();
        obj.show2();
    }
}

class fclass3 extends fclass1 {
    public void show3() {
        System.out.println("Бұл fclass3 класы");
    }
}

class fclass2 extends fclass3 {
    public void show2() {
        System.out.println("Бұл fclass2 класы");
    }
}
