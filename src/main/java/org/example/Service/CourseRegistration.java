package org.example.Service;

import org.example.model.Course;



    public interface CourseRegistration {
        void addCourse(Course course);
        void displayAllCourse();
        void updateCourse(Course course);
        String deleteCourse(Course course);
    }

