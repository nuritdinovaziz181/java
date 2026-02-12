package model;

public class Student {

    String name;
    int age;
    String major;

    // 2. Әдепкі конструктор
    public Student() {
        this.name = "Белгісіз";
        this.age = 0;
        this.major = "Таңдалмаған";
        System.out.println("Әдепкі конструктор орындалды");
    }

    // 2,3. Параметрлі конструктор + this қолдану
    public Student(String name, int age, String major) {
        this.name = name;     // this өрісті көрсетеді
        this.age = age;
        this.major = major;
        System.out.println("Параметрлі конструктор орындалды");
    }

    // 5. Ақпарат көрсету әдісі
    public void displayInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Жасы: " + age);
        System.out.println("Мамандығы: " + major);
        System.out.println("-------------------");
    }

    // 5. Күйін өзгерту әдісі
    public void changeMajor(String newMajor) {
        this.major = newMajor;
    }
}
