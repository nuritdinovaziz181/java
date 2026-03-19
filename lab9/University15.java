class University15 {
    static int studentCount = 0;


    University15() {
        studentCount++;
    }

    public static void main(String[] args) {
        new University15();
        new University15();
        System.out.println(studentCount);
    }

}
