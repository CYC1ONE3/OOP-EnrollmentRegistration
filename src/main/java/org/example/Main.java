package org.example;

import org.example.Service.CourseRegistration;
import org.example.Service.StudentRegistration;
import org.example.model.Student;
import org.example.model.Course;
import org.example.model.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner cyc = new Scanner(System.in);
                ArrayList<Student> students = new ArrayList<>();
                CourseRegistration courses = new CourseRegistration();

                courses.addCourse(new Course(01, "BSIT", "Information Technology"));
                courses.addCourse(new Course(02, "BSIE", "Industrial Engineering"));
                courses.addCourse(new Course(03, "BSA", "Architecture"));

                courses.displayAll();


                courses.updateCourse(new Course(06));
                courses.displayAll();

                courses.deleteCourse(new Course(03));
                courses.displayAll();

                StudentRegistration enrollment = new StudentRegistration();

                enrollment.addStudent(new Student(2222, "Miguel", "BSIT"));
                enrollment.addStudent(new Student(6767, "Jaques", "BSIT"));
                enrollment.addStudent(new Student(2222, "Raphael", "BSIT"));


                enrollment.updateStudent(new Student(676767, "Yev", "BSIT"));
                enrollment.displayAll();



            }
        }

