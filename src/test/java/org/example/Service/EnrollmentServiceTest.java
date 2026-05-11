package org.example.Service;

import org.example.Service.EnrollmentServiceImpl;
import org.example.Service.IEnrollmentService;
import org.example.exception.SectionFullException;
import org.example.model.Section;
import org.example.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EnrollmentServiceTest {

    @Test
    void shouldNotAllowEnrollmentWhenSectionIsFull(){

        Section section = new Section("IT2A", 1);

        Student s1 = new Student(1, "Migs", "IT");
        Student s2 = new Student(2, "John", "IT");

        IEnrollmentService enrollmentService =
                new EnrollmentServiceImpl();

        try {

            enrollmentService.enrollStudentInSection(s1, section);

            enrollmentService.enrollStudentInSection(s2, section);


            fail("Expected SectionFullException was not thrown");

        } catch (SectionFullException e){

            assertEquals(
                    "Enrollment failed: IT2A is full.",
                    e.getMessage()
            );
        }
    }
}