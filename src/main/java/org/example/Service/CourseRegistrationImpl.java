package org.example.Service;

import org.example.model.Course;

import java.util.ArrayList;

public class CourseRegistrationImpl implements CourseRegistration {
    private ArrayList<Course> courses = new ArrayList<>();

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }
    @Override
    public void displayAllCourse() {

        System.out.println("\n>>>>>>>>>> COURSE LIST <<<<<<<<<<<");

        for (Course c : courses){

            System.out.println("------------------------------");
            System.out.println("Course ID   : " + c.getcourseID());
            System.out.println("Course Name : " + c.getcourseName());
            System.out.println("Program     : " + c.getprogram());
        }

        System.out.println("------------------------------");
    }
    @Override
    public void updateCourse(Course course) {

        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getcourseID() == (course.getcourseID())) {
                courses.set(i, course);
                break;
            }
        }

    }


    @Override
    public String deleteCourse(Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getcourseID() == (course.getcourseID())) {
                courses.remove(i);
                return "Successfully deleted";
            }
        }
        return "Error";
    }
}
