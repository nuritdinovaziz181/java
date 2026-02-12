package app;

import model.Student;
import service.University;

public class Main {

    public static void main(String[] args) {

        // 4. Бір кластан бірнеше объект құру
        Student s1 = new Student("Aziz", 18, "IT");
        Student s2 = new Student("Aigerim", 19, "Math");
        Student s3 = new Student("Dias", 20, "Physics");

        // Әр объект тәуелсіз екенін көрсету
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        // 5. Объект күйін өзгерту
        s1.changeMajor("Cybersecurity");
        System.out.println("Мамандық өзгертілді:");
        s1.displayInfo();

        // 7. Бірнеше класстың әрекеті
        University university = new University();
        university.enrollStudent(s2);
    }
}
