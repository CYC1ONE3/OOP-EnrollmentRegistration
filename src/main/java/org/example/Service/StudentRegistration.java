package org.example.Service;

import org.example.model.Student;
import java.util.List;

public interface StudentRegistration {
    void addStudent(Student student);
    List<Student> getAllStudents();
    void updateStudent(Student student);
    String deleteStudent(Student student);
}
