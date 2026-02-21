package org.example.Service;

import org.example.model.Course;
import org.example.model.Student;
import java.util.ArrayList;

public class CourseRegistration {
    private ArrayList<Course> courses = new ArrayList<>();

    public void addCourse(Student student) {
        courses.add(courses);
    }

    public void displayAll() {
        System.out.println(courses);
    }

    public void updateCourse(Course course) {

        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getcourseID() == (course.getcourseID())) {
                courses.set(i, course);
                break;
            }
        }

    }

    //remove

    public String delete(Student student) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getcourseID() == (course.getcourseID())) {
                courses.remove(i);
                return "Successfully deleted";
            }
        }
        return "Error";
    }
}
