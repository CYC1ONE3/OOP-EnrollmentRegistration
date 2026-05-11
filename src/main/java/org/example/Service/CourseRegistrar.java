package org.example.Service;

import org.example.model.Course;
import org.example.model.Student;

public class CourseRegistrar {
    private StudentRegistration studentRegistration;
    private CourseRegistration courseRegistration;

    public CourseRegistrar(StudentRegistration studentRegistration, CourseRegistration courseRegistration, IEnrollmentService enrollmentService){
        this.studentRegistration = studentRegistration;
        this.courseRegistration = courseRegistration;
    }

    public String addCourse(Course course){
        courseRegistration.addCourse(course);
        return "success";
    }

        public String addStudent(Student student){
        studentRegistration.addStudent(student);
            return "success";
        }

    public void displayAllStudent() {

        for (Student s : studentRegistration.getAllStudents()) {
            System.out.println(s);
        }
    }

    public void displayAllCourse(){
        courseRegistration.displayAllCourse();
    }


    public void updateStudent(Student student){
        studentRegistration.updateStudent(student);
    }

    public void updateCourse(Course course){
        courseRegistration.updateCourse(course);
    }


    public String deleteStudent(Student student){
        return studentRegistration.deleteStudent(student);
    }

    public String deleteCourse(Course course){
        return courseRegistration.deleteCourse(course);
    }
}



