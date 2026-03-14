package org.example;

import org.example.Service.CourseRegistration;
import org.example.Service.StudentRegistration;
import org.example.Service.TuitionFeePayment;
import org.example.model.Student;
import org.example.model.Course;
import org.example.model.Person;
import org.example.model.Instructor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    TuitionFeePayment tuitionFeePayment = new TuitionFeePayment();
        System.out.println(tuitionFeePayment.calculateTuitionFee(3, 0.10));
        tuitionFeePayment.makePayment(1000);
        System.out.println(tuitionFeePayment.getRemainingBalance());


       Student s1 = new Student(67, "Jaques Cabillon", "BSIT");
        System.out.println("Student ID: " + s1.getID());
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Program: " + s1.getProgram());
        System.out.println();

        s1.mainTask();

        System.out.println();

        Student s2 = new Student(69, "Yev Torres", "BSIT");
        System.out.println("Student ID: " + s2.getID());
        System.out.println("Student Name: " + s2.getName());
        System.out.println("Program: " + s2.getProgram());
        System.out.println();

        s2.mainTask();

        System.out.println();

        Instructor i1 = new Instructor (202, "Miguel Rosal", "Interrogative Programming");
        System.out.println("Instructor ID: " + i1.getID());
        System.out.println("Instructor Name: " + i1.getName());
        System.out.println("Course: " + i1.getCourses());

        i1.mainTask();

        Course c1 = new Course("INFOMAN", "Information Management", "BSIT");
        System.out.println("Course ID: " + c1.getcourseID());
        System.out.println("Course Name: " + c1.getcourseName());
        System.out.println("Program: " + c1.getprogram());
        System.out.println();


/*
                Scanner cyc = new Scanner(System.in);
                ArrayList<Student> students = new ArrayList<>();
                CourseRegistration courses = new CourseRegistration();

                courses.addCourse(new Course("INFOMAN", "Information Management", "Information Technology"));
                courses.addCourse(new Course("INFASEC", "Infrastructure and Security", "Industrial Engineering"));
                courses.addCourse(new Course("ITELECT1", "IT Elective 1", "Architecture"));

                courses.displayAll();


                courses.updateCourse(new Course("PATHFI"));
                courses.displayAll();

                courses.deleteCourse(new Course("ITSYSDE"));
                courses.displayAll();

                StudentRegistration enrollment = new StudentRegistration();

                enrollment.addStudent(new Student(2222, "Miguel", "BSIT"));
                enrollment.addStudent(new Student(6767, "Jaques", "BSIT"));
                enrollment.addStudent(new Student(2222, "Raphael", "BSIT"));


                enrollment.updateStudent(new Student(676767, "Yev", "BSIT"));
                enrollment.displayAll();

*/
    }
}





