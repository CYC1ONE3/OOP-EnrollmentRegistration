package org.example.Service;

import org.example.model.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseRegistrationImplTest {

    private CourseRegistrationImpl courseRegistration;

    @BeforeEach
    void setup(){

        courseRegistration = new CourseRegistrationImpl();
    }

    @Test
    void shouldAddCourseSuccessfully(){

        Course course = new Course("INTEPROG", "Integrative Programming", "BSIT");
        courseRegistration.addCourse(course);

        assertNotNull(course);
    }

    @Test
    void shouldDeleteCourseSuccessfully(){

        Course course = new Course("INFOMAN", "Information Management", "BSIT");

        courseRegistration.addCourse(course);

        String result = courseRegistration.deleteCourse(course);

        assertEquals("Successfully deleted", result);
    }
}