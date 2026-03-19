class Student2 {
    String name;
    static String university = "KazNU";


    Student2(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(name + " studies at " + university);
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2("Ali");
        Student2 s2 = new Student2("Dana");
        s1.show();
        s2.show();
    }


}
