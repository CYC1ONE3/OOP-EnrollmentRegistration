package org.example.Service;

import org.example.model.Student;

public interface StudentRegistration {
    void addStudent(Student student);
    void displayAllStudent();
    void updateStudent(Student student);
    String deleteStudent(Student student);
}
