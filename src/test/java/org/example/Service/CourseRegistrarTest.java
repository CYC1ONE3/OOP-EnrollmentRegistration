package org.example.Service;

import org.example.model.Course;
import org.example.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseRegistrarTest {

    private CourseRegistrar courseRegistrar;

    private StudentRegistrationImpl studentRegistration;
    private CourseRegistrationImpl courseRegistration;
    private IEnrollmentService enrollmentService;

    @BeforeEach
    void setup(){

        studentRegistration = new StudentRegistrationImpl();

        courseRegistration = new CourseRegistrationImpl();

        enrollmentService = new EnrollmentServiceImpl();

        courseRegistrar = new CourseRegistrar(studentRegistration, courseRegistration, enrollmentService);
    }

    @Test
    void shouldAddStudentSuccessfully(){

        Student student = new Student(1, "Migs", "BSIT");

        boolean result = courseRegistrar.addStudent(student);

        assertTrue(result);
    }

    @Test
    void shouldAddCourseSuccessfully(){

        Course course = new Course("INTEPROG", "Integrative Programming", "BSIT");

        boolean result = courseRegistrar.addCourse(course);

        assertEquals("success", result);
    }
}
