package org.example.Service;

import org.example.model.Section;
import org.example.exception.SectionFullException;
import org.example.model.Course;
import org.example.model.Student;
import org.example.model.Department;

public class CourseRegistrar {
    private StudentRegistration studentRegistration;
    private CourseRegistration courseRegistration;
    private IEnrollmentService enrollmentService;

    public CourseRegistrar(StudentRegistration studentRegistration, CourseRegistration courseRegistration, IEnrollmentService enrollmentService){
        this.studentRegistration = studentRegistration;
        this.courseRegistration = courseRegistration;
        this.enrollmentService = enrollmentService;
    }

    public boolean addCourse(Course course){

        return courseRegistration.addCourse(course);
    }

    public boolean addStudent(Student student){

        return studentRegistration.addStudent(student);
    }

    public void displayAllStudent() {

        for (Student s : studentRegistration.getAllStudents()) {
            System.out.println("\n>>>>>>>> STUDENT LIST <<<<<<<<");
            System.out.println("Student ID : " + s.getID());
            System.out.println("Name       : " + s.getName());
            System.out.println("Program    : " + s.getProgram());
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

    public void enrollStudent(Student student, Section section){

        try {

            enrollmentService.enrollStudentInSection(student, section);

            System.out.println("Student successfully enrolled in " + section.getSectionName());

        } catch (SectionFullException e){

            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void viewDepartment(Department department){

        enrollmentService.viewDepartmentHierarchy(department);

    }
}



