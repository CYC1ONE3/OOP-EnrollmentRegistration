package org.example;

import org.example.Service.*;
import org.example.model.Student;
import org.example.model.Course;
import org.example.model.Instructor;
import org.example.model.Section;
import org.example.exception.SectionFullException;
import org.example.Service.EnrollmentServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cyc = new Scanner(System.in);
        StudentRegistrationImpl studentRegistration = new StudentRegistrationImpl();

        CourseRegistrationImpl courseRegistration = new CourseRegistrationImpl();

        IEnrollmentService enrollmentService = new EnrollmentServiceImpl();

        CourseRegistrar courseRegistrar = new CourseRegistrar(studentRegistration, courseRegistration, enrollmentService);


        while (true) {

            System.out.println("\n>>>>>>>> ENROLLMENT SYSTEM <3 <<<<<<<");
            System.out.println("1. Student Management");
            System.out.println("2. Course Management");
            System.out.println("3. Enrollment");
            System.out.println("4. Tuition");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");

            int choice;

            try {
                choice = cyc.nextInt();
                cyc.nextLine();

            } catch (Exception e) {

                System.out.println("Invalid input.");
                cyc.nextLine();
                continue;
            }

            switch (choice) {

                case 1:
                    break;
                case 2:
                    System.out.println("Course Menu");
                    break;

                case 3:
                    System.out.println("Enrollment Menu");
                    break;

                case 4:
                    TuitionFeePayment tuitionFeePayment =
                            new TuitionFeePayment();

                    System.out.print("Enter number of units: ");
                    int units = cyc.nextInt();

                    System.out.print("Enter discount rate (0.10 for 10%): ");
                    double discount = cyc.nextDouble();

                    double total =
                            tuitionFeePayment.calculateTuitionFee(units, discount);

                    System.out.println("Total Tuition Fee: " + total);

                    System.out.print("Enter payment amount: ");
                    double payment = cyc.nextDouble();

                    tuitionFeePayment.makePayment(payment);

                    System.out.println("Remaining Balance: "
                            + tuitionFeePayment.getRemainingBalance());

                    System.out.println("Fully Paid: "
                            + tuitionFeePayment.isFullyPaid());
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }

/*
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






        Student s6 = new Student(1, "Migs", "BSIT");
        Student s7 = new Student(2, "John", "BSCS");

        courseRegistrar.addStudent(s6);
        courseRegistrar.addStudent(s7);


        System.out.println("=== Students ===");
        courseRegistrar.displayAllStudent();


        Student updated = new Student(1, "Miguel", "BSIT");
        courseRegistrar.updateStudent(updated);

        System.out.println("\n=== After Update ===");
        courseRegistrar.displayAllStudent();


        courseRegistrar.deleteStudent(s7);

        System.out.println("\n=== After Delete ===");
        courseRegistrar.displayAllStudent();



        Section section = new Section("BSIT-1A", 2);

        Student s8 = new Student(1, "Migs", "BSIT");
        Student s9 = new Student(2, "John", "BSIT");
        Student s10 = new Student(3, "Alex", "BSIT");

        try {
            enrollmentService.enrollStudentInSection(s8, section);
            enrollmentService.enrollStudentInSection(s9, section);


            enrollmentService.enrollStudentInSection(s10, section);

        } catch (SectionFullException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        */

    }

}






