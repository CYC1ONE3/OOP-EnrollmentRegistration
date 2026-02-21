package org.example.Service;

import org.example.model.Course;
import org.example.model.Student;
import java.util.ArrayList;

public class StudentRegistration {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAll() {
        System.out.println(students);
    }

    public void updateStudent(Student student) {

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID() == (student.getID())) {
                students.set(i, student);
                break;
            }
        }

    }

    //remove

    public String delete(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getID() == (student.getID())) {
                students.remove(i);
                return "Successfully deleted";
            }
        }
        return "Error";
    }
}