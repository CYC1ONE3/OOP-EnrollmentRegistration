package org.example.Service;

import org.example.model.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentRegistrationImpl implements StudentRegistration {
    private ArrayList<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
    for (Student s : students) {
        if (s.getID() == student.getID()) {
            System.out.println("Error: Duplicate Student ID");
            return;
        }
    }

        students.add(student);
}
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public void updateStudent(Student student) {

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID() == (student.getID())) {
                students.set(i, student);
                break;
            }
        }

    }

    //remove
    @Override
    public String deleteStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID() == (student.getID())) {
                students.remove(i);
                return "Successfully deleted";
            }
        }
        return "Error: Student not found";
    }
}