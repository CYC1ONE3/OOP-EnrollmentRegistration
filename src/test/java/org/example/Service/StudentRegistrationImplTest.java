package org.example.Service;

import org.example.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentRegistrationImplTest {

    private StudentRegistrationImpl studentRegistration;

    @BeforeEach
    void setup(){

        studentRegistration = new StudentRegistrationImpl();
    }

    @Test
    void shouldAddStudentSuccessfully(){

        Student student =new Student(1, "Migs", "BSIT");

        studentRegistration.addStudent(student);

        assertEquals(1, studentRegistration.getAllStudents().size());
    }

    @Test
    void shouldNotAddDuplicateStudentID(){

        Student student1 = new Student(1, "Migs", "BSIT");

        Student student2 = new Student(1, "John", "BSCS");

        studentRegistration.addStudent(student1);
        studentRegistration.addStudent(student2);

        assertEquals(1, studentRegistration.getAllStudents().size());
    }
}
