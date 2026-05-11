package org.example;

import org.example.Service.*;
import org.example.model.*;
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

        Student student1 = new Student(202301, "Wiljohn Lingao", "Information Technology");

        Student student2 = new Student(202302, "Mark Bagayao", "Information Technology");

        Student student3 = new Student(202303, "Yev Torres", "Computer Science");

        Student student4 = new Student(202304, "Raphael Aranez", "Computer Engineering");

        courseRegistrar.addStudent(student1);
        courseRegistrar.addStudent(student2);
        courseRegistrar.addStudent(student3);
        courseRegistrar.addStudent(student4);


        Department cite = new Department("College of Information Technology and Engineering");

        Section it2A = new Section("IT2A", 35);
        Section it2B = new Section("IT2B", 35);

        Section c1A = new Section("C1A", 35);
        Section cs2B = new Section("CS2B", 35);

        Instructor instructor1 = new Instructor(101, "Miguel Rosal", "Integrative Programming");

        Instructor instructor2 = new Instructor(102, "Jaques Cabillon", "Discrete Mathematics");

        it2A.setInstructor(instructor1);
        it2B.setInstructor(instructor1);

        c1A.setInstructor(instructor2);
        cs2B.setInstructor(instructor2);

        Course inteprog =
                new Course(
                        "INTEPROG",
                        "Integrative Programming",
                        "Information Technology"
                );

        Course infoman = new Course("INFOMAN", "Information Management", "Information Technology");

        Course dismath = new Course("DISMATH", "Discrete Mathematics", "Computer Science");

        Course itsysde = new Course("ITSYSDE", "IT Systems Design", "Information Technology");

        Course infasec2 = new Course("INFASEC2", "Information Assurance and Security 2", "Information Technology");

        Course pathfi4 = new Course("PATHFI4", "Physical Activities Towards Health and Fitness 4", "General Education");

        courseRegistrar.addCourse(inteprog);
        courseRegistrar.addCourse(infoman);
        courseRegistrar.addCourse(dismath);
        courseRegistrar.addCourse(itsysde);
        courseRegistrar.addCourse(infasec2);
        courseRegistrar.addCourse(pathfi4);

        cite.addSection(it2A);
        cite.addSection(it2B);

        cite.addSection(c1A);
        cite.addSection(cs2B);
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

                    while (true) {

                        System.out.println("\n===== STUDENT MENU =====");
                        System.out.println("1. Add Student");
                        System.out.println("2. View Students");
                        System.out.println("3. Back");

                        System.out.print("Choose option: ");

                        int studentChoice;

                        try {

                            studentChoice = cyc.nextInt();
                            cyc.nextLine();

                        } catch (Exception e) {

                            System.out.println("Invalid input.");
                            cyc.nextLine();
                            continue;
                        }

                        switch (studentChoice) {

                            case 1:

                                System.out.print("Enter ID: ");
                                int id = cyc.nextInt();
                                cyc.nextLine();

                                System.out.print("Enter Name: ");
                                String name = cyc.nextLine();

                                System.out.print("Enter Program: ");
                                String program = cyc.nextLine();

                                Student student =
                                        new Student(id, name, program);

                                courseRegistrar.addStudent(student);

                                System.out.println("Student added successfully.");
                                break;

                            case 2:

                                courseRegistrar.displayAllStudent();
                                break;

                            case 3:
                                break;

                            default:
                                System.out.println("Invalid option.");
                        }

                        if (studentChoice == 3) {
                            break;
                        }
                    }

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






