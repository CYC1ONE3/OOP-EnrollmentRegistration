package org.example;

import org.example.Service.*;
import org.example.model.*;
import org.example.Service.EnrollmentServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cyc = new Scanner(System.in);
        StudentRegistrationImpl studentRegistration = new StudentRegistrationImpl();

        CourseRegistrationImpl courseRegistration = new CourseRegistrationImpl();

        IEnrollmentService enrollmentService = new EnrollmentServiceImpl();

        InstructorServiceImpl instructorService = new InstructorServiceImpl();

        CourseRegistrar courseRegistrar = new CourseRegistrar(studentRegistration, courseRegistration, enrollmentService);

        Student student1 = new Student(202301, "Wiljohn Lingao", "Information Technology");

        Student student2 = new Student(202302, "Mark Bagayao", "Information Technology");

        Student student3 = new Student(202303, "Yev Torres", "Computer Science");

        Student student4 = new Student(202304, "Raphael Aranez", "Computer Engineering");

        Student student5 = new Student(202456, "Ron Joseph Reyes", "Information Technology");

        courseRegistrar.addStudent(student1);
        courseRegistrar.addStudent(student2);
        courseRegistrar.addStudent(student3);
        courseRegistrar.addStudent(student4);
        courseRegistrar.addStudent(student5);


        Department cite = new Department("College of Information Technology and Engineering");

        Section it2A = new Section("IT2A", 35);
        Section it2B = new Section("IT2B", 1);

        Section c1A = new Section("C1A", 35);
        Section cs2B = new Section("CS2B", 35);

        Instructor instructor1 = new Instructor(101, "Miguel Rosal", "Integrative Programming");

        instructorService.addInstructor(instructor1);

        Instructor instructor2 = new Instructor(102, "Jaques Cabillon", "Discrete Mathematics");


        instructorService.addInstructor(instructor2);

        it2A.setInstructor(instructor1);
        it2B.setInstructor(instructor1);

        c1A.setInstructor(instructor2);
        cs2B.setInstructor(instructor2);

        Course inteprog = new Course("INTEPROG", "Integrative Programming", "Information Technology");

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

        courseRegistrar.enrollStudent(student1, it2A);
        courseRegistrar.enrollStudent(student2, it2B);

        courseRegistrar.enrollStudent(student3, c1A);

        courseRegistrar.enrollStudent(student4, cs2B);
        courseRegistrar.enrollStudent(student5, it2B);
        while (true) {

            System.out.println("\n>>>>>>>> ENROLLMENT SYSTEM <3 <<<<<<<");
            System.out.println("1. Student Management");
            System.out.println("2. Instructor Management");
            System.out.println("3. Course Management");
            System.out.println("4. Enrollment");
            System.out.println("5. Tuition");
            System.out.println("6. Exit");

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

                        System.out.println("\n>>>>> STUDENT MENU <<<<<");
                        System.out.println("1. Add Student");
                        System.out.println("2. View Students");
                        System.out.println("3. Update Student");
                        System.out.println("4. Delete Student");
                        System.out.println("5. Back");

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

                                while (true) {

                                    int id;

                                    try {

                                        System.out.print("Enter ID: ");
                                        id = cyc.nextInt();
                                        cyc.nextLine();

                                    } catch (Exception e) {

                                        System.out.println("Invalid ID input.");
                                        cyc.nextLine();
                                        break;
                                    }

                                    System.out.print("Enter Name: ");
                                    String name = cyc.nextLine();

                                    System.out.print("Enter Program: ");
                                    String program = cyc.nextLine();

                                    Student student = new Student(id, name, program);

                                    boolean added = courseRegistrar.addStudent(student);

                                    if (added) {

                                        System.out.println("Student added successfully.");
                                        break;

                                    } else {

                                        System.out.println("ERROR: Duplicate Student ID");
                                        System.out.println("Please try again.\n");
                                    }
                                }

                                break;
                            case 2:

                                courseRegistrar.displayAllStudent();
                                break;

                            case 3:

                                try {

                                    System.out.print("Enter Student ID to Update: ");
                                    int updateID = cyc.nextInt();
                                    cyc.nextLine();

                                    System.out.print("Enter New Name: ");
                                    String updatedName = cyc.nextLine();

                                    System.out.print("Enter New Program: ");
                                    String updatedProgram = cyc.nextLine();

                                    Student updatedStudent =
                                            new Student(
                                                    updateID,
                                                    updatedName,
                                                    updatedProgram
                                            );

                                    courseRegistrar.updateStudent(updatedStudent);

                                    System.out.println("Student updated successfully.");

                                } catch (Exception e) {

                                    System.out.println("Invalid input.");
                                    cyc.nextLine();
                                }

                                break;

                            default:
                                System.out.println("Invalid option.");
                        }

                        if (studentChoice == 5) {
                            break;
                        }
                    }

                    break;

                case 2:

                    while (true) {

                        System.out.println("\n>>>>> INSTRUCTOR MENU <<<<<");

                        System.out.println("1. Add Instructor");
                        System.out.println("2. View Instructors");
                        System.out.println("3. Update Instructor");
                        System.out.println("4. Delete Instructor");
                        System.out.println("5. Back");

                        System.out.print("Choose option: ");

                        int instructorChoice;

                        try {

                            instructorChoice = cyc.nextInt();
                            cyc.nextLine();

                        } catch (Exception e) {

                            System.out.println("Invalid input.");
                            cyc.nextLine();
                            continue;
                        }

                        switch (instructorChoice) {

                            case 1:

                                int instructorID;

                                try {

                                    System.out.print("Enter Instructor ID: ");
                                    instructorID = cyc.nextInt();
                                    cyc.nextLine();

                                } catch (Exception e) {

                                    System.out.println("Invalid input.");
                                    cyc.nextLine();
                                    break;
                                }

                                System.out.print("Enter Name: ");
                                String instructorName = cyc.nextLine();

                                System.out.print("Enter Course: ");
                                String instructorCourse = cyc.nextLine();

                                Instructor instructor = new Instructor(instructorID, instructorName, instructorCourse);

                                boolean instructorAdded = instructorService.addInstructor(instructor);

                                if (instructorAdded) {

                                    System.out.println("Instructor added successfully.");

                                } else {

                                    System.out.println("Duplicate Instructor ID.");
                                }

                                break;

                            case 2:

                                instructorService.displayAllInstructors();
                                break;

                            case 3:

                                try {

                                    System.out.print("Enter Instructor ID to Update: ");
                                    int updateInstructorID = cyc.nextInt();
                                    cyc.nextLine();

                                    System.out.print("Enter New Name: ");
                                    String updatedInstructorName =
                                            cyc.nextLine();

                                    System.out.print("Enter New Course: ");
                                    String updatedCourse =
                                            cyc.nextLine();

                                    Instructor updatedInstructor =
                                            new Instructor(
                                                    updateInstructorID,
                                                    updatedInstructorName,
                                                    updatedCourse
                                            );

                                    instructorService
                                            .updateInstructor(updatedInstructor);

                                    System.out.println(
                                            "Instructor updated successfully."
                                    );

                                } catch (Exception e) {

                                    System.out.println("Invalid input.");
                                    cyc.nextLine();
                                }

                                break;

                            case 4:

                                try {

                                    System.out.print("Enter Instructor ID to Delete: ");
                                    int deleteInstructorID = cyc.nextInt();
                                    cyc.nextLine();

                                    Instructor deleteInstructor = new Instructor(deleteInstructorID, "", "");

                                    String result = instructorService.deleteInstructor(deleteInstructor);

                                    System.out.println(result);

                                } catch (Exception e) {

                                    System.out.println("Invalid input.");
                                    cyc.nextLine();
                                }

                                break;

                            default:
                                System.out.println("Invalid option.");
                        }

                        if (instructorChoice == 5) {
                            break;
                        }
                    }

                    break;

                case 3:


                    while (true) {

                        System.out.println("\n>>>>> COURSE MENU <<<<<");
                        System.out.println("1. Add Course");
                        System.out.println("2. View Courses");
                        System.out.println("3. Update Course");
                        System.out.println("4. Delete Course");
                        System.out.println("5. Back");

                        System.out.print("Choose option: ");

                        int courseChoice;

                        try {

                            courseChoice = cyc.nextInt();
                            cyc.nextLine();

                        } catch (Exception e) {

                            System.out.println("Invalid input.");
                            cyc.nextLine();
                            continue;
                        }

                        switch (courseChoice) {

                            case 1:

                                System.out.print("Enter Course ID: ");
                                String courseID = cyc.nextLine();

                                System.out.print("Enter Course Name: ");
                                String courseName = cyc.nextLine();

                                System.out.print("Enter Program: ");
                                String program = cyc.nextLine();

                                Course course = new Course(courseID, courseName, program);

                                boolean addedCourse = courseRegistrar.addCourse(course);

                                if (addedCourse) {

                                    System.out.println("Course added successfully.");

                                } else {

                                    System.out.println("Duplicate Course ID.");
                                }
                                break;

                            case 2:

                                courseRegistrar.displayAllCourse();
                                break;

                            case 3:

                                System.out.print("Enter Course ID to Update: ");
                                String updateCourseID = cyc.nextLine();

                                System.out.print("Enter New Course Name: ");
                                String updatedCourseName = cyc.nextLine();

                                System.out.print("Enter New Program: ");
                                String updatedCourseProgram = cyc.nextLine();

                                Course updatedCourse = new Course(updateCourseID, updatedCourseName, updatedCourseProgram);

                                courseRegistrar.updateCourse(updatedCourse);

                                System.out.println("Course updated successfully.");

                                break;

                            case 4:

                                System.out.print("Enter Course ID to Delete: ");
                                String deleteCourseID = cyc.nextLine();

                                Course deleteCourse = new Course(deleteCourseID, "", "");

                                String result = courseRegistrar.deleteCourse(deleteCourse);

                                System.out.println(result);

                                break;

                            default:
                                System.out.println("Invalid option.");
                        }


                        if (courseChoice == 4) {
                            break;
                        }
                    }

                    break;


                case 4:


                    while (true) {

                        System.out.println("\n>>>>> ENROLLMENT MENU <<<<<");
                        System.out.println("1. Enroll Student");
                        System.out.println("2. View Department Hierarchy");
                        System.out.println("3. Back");

                        System.out.print("Choose option: ");

                        int enrollChoice;

                        try {

                            enrollChoice = cyc.nextInt();
                            cyc.nextLine();

                        } catch (Exception e) {

                            System.out.println("Invalid input.");
                            cyc.nextLine();
                            continue;
                        }

                        switch (enrollChoice) {

                            case 1:

                                int studentID;

                                try {

                                    System.out.print("Enter Student ID: ");
                                    studentID = cyc.nextInt();
                                    cyc.nextLine();

                                } catch (Exception e) {

                                    System.out.println("Invalid Student ID.");
                                    cyc.nextLine();
                                    break;
                                }

                                Student selectedStudent = null;

                                for (Student s :
                                        studentRegistration.getAllStudents()) {

                                    if (s.getID() == studentID) {
                                        selectedStudent = s;
                                        break;
                                    }
                                }

                                if (selectedStudent == null) {

                                    System.out.println("Student not found.");
                                    break;
                                }

                                System.out.println("Choose Section:");
                                System.out.println("1. IT2A");
                                System.out.println("2. IT2B");
                                System.out.println("3. C1A");
                                System.out.println("4. CS2B");

                                int sectionChoice;

                                try {

                                    sectionChoice = cyc.nextInt();
                                    cyc.nextLine();

                                } catch (Exception e) {

                                    System.out.println("Invalid section input.");
                                    cyc.nextLine();
                                    break;
                                }

                                Section selectedSection = null;

                                switch (sectionChoice) {

                                    case 1:
                                        selectedSection = it2A;
                                        break;

                                    case 2:
                                        selectedSection = it2B;
                                        break;

                                    case 3:
                                        selectedSection = c1A;
                                        break;

                                    case 4:
                                        selectedSection = cs2B;
                                        break;

                                    default:
                                        System.out.println("Invalid section.");
                                        break;
                                }

                                if (selectedSection != null) {

                                    courseRegistrar.enrollStudent(selectedStudent, selectedSection);
                                }

                                break;

                            case 2:

                                courseRegistrar.viewDepartment(cite);
                                break;

                            case 3:
                                break;

                            default:
                                System.out.println("Invalid option.");
                        }

                        if (enrollChoice == 3) {
                            break;
                        }
                    }

                    break;

                case 5:

                    TuitionFeePayment tuitionFeePayment =
                            new TuitionFeePayment();

                    System.out.println("\n>>>>>>>> TUITION MENU <<<<<<<<<<");

                    try {

                        System.out.print("Enter number of units: ");
                        int units = cyc.nextInt();

                        if (units <= 0) {

                            System.out.println("Invalid number of units.");
                            break;
                        }


                        System.out.print("Enter discount rate (0.10 for 10%): ");
                        double discount = cyc.nextDouble();
                        if (discount < 0 || discount > 1) {

                            System.out.println("Invalid discount rate.");
                            break;
                        }

                        cyc.nextLine();

                        System.out.print("Enter scholarship type (Academic/Athletic/None): ");
                        String scholarship = cyc.nextLine();

                        double total = tuitionFeePayment.calculateTuitionFee(units, discount);

                        if (!scholarship.equalsIgnoreCase("None")) {

                            total = tuitionFeePayment.applyScholarshipDiscount(scholarship);
                        }

                        System.out.println("\n>>>>>>>>>> TUITION DETAILS <<<<<<<<<<");
                        System.out.println("Total Tuition Fee : ₱" + total);

                        System.out.print("\nEnter payment amount: ₱");
                        double payment;

                        try {

                            payment = cyc.nextDouble();

                        } catch (Exception e) {

                            System.out.println("Invalid payment input.");
                            cyc.nextLine();
                            break;
                        }
                        tuitionFeePayment.makePayment(payment);

                        System.out.println("\n>>>>>>>>> PAYMENT DETAILS <<<<<<<<<<");
                        System.out.println("Remaining Balance : ₱" + tuitionFeePayment.getRemainingBalance());
                        double change =
                                tuitionFeePayment.getChange(payment);

                        if (change > 0){

                            System.out.println(
                                    "Change            : ₱"
                                            + change
                            );
                        }

                        if (tuitionFeePayment.isFullyPaid()) {

                            System.out.println("Payment Status    : Fully Paid");

                        } else {

                            System.out.println("Payment Status    : With Balance");
                        }

                    } catch (Exception e) {

                        System.out.println("Invalid input.");
                        cyc.nextLine();
                    }

                    break;

                case 6:
                    System.out.println("Exiting system...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}





