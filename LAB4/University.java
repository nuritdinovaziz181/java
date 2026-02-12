package service;

import model.Student;

public class University {

    public void enrollStudent(Student student) {
        System.out.println("Университетке қабылданған студент:");
        student.displayInfo();
    }
}