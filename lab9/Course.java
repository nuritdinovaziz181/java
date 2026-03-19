class Course {


    class Student {
        String name;

        Student(String name) {
            this.name = name;
        }
    }

    String courseName = "Java";

    public static void main(String[] args) {
        Course c = new Course();
        Course.Student s = c.new Student("Ali");
        System.out.println(s.name + " studies " + c.courseName);
    }


}
