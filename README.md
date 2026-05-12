OOP - Enrollment System

---
**Author**: Miguel Santos

**1. Description** - Encapsulation of Student ID and Course ID


![scan.png](src/main/resources/Images/scan.png)

**Inheritance**
![Course.png](src/main/resources/Images/Course.png)

![Students.png](src/main/resources/Images/Students.png)



**ABSTRACTION**

![Person-abstract.png](src/main/resources/Images/Person-abstract.png)

![Student_Abstract.png](src/main/resources/Images/Student_Abstract.png)

![Instructor_abstract.png](src/main/resources/Images/Instructor_abstract.png)


**POLYMORPHISM**

Interfaces Used:
- StudentRegistration
- CourseRegistration
- IEnrollmentService
- IInstructorService

![Polymorphism.png](src/main/resources/Images/Polymorphism.png)
![Polymorphism2.png](src/main/resources/Images/Polymorphism2.png)

**VALIDATION AND ERROR HANDLING**

The system prevents crashes by using:
- Try-Catch Blocks
- Duplicate Validation
- Invalid Numeric Input Handling

Examples:
- Prevent duplicate Student IDs
- Prevent duplicate Instructor IDs
- Prevent invalid payment input
- Prevent invalid menu selections

![Validation.png](src/main/resources/Images/Validation.png)

**CLI - STUDENT MANAGEMENT**

- Add Student
- View Student
- Update Student
- Delete Student

![student-cli.png](src/main/resources/Images/student-cli.png)


**CLI - INSTRUCTOR MANAGEMENT**

- Add Instructor
- View Instructor
- Update Instructor
- Delete Instructor

![Instructorcli.png](src/main/resources/Images/Instructorcli.png)

**CLI - COURSE MANAGEMENT**

- Add Course
- View Course
- Update Course
- Delete Course

![course-cli.png](src/main/resources/Images/course-cli.png)

**ENROLLMENT SYSTEM**

- Enroll Student
- View Department Hierarchy
- Section Capacity Validation

![enrollmentcli.png](src/main/resources/Images/enrollmentcli.png)

![EnrollmentHierarchy.png](src/main/resources/Images/EnrollmentHierarchy.png)

**CUSTOM EXCEPTION**

The system uses `SectionFullException and DuplicateEnrollmentException`
to prevent students from enrolling in full sections and to prevent students from enrolling in the same section

![SectionFullexception.png](src/main/resources/Images/SectionFullexception.png)
![Duplicateexception.png](src/main/resources/Images/Duplicateexception.png)


**TUITION MANAGEMENT**

Features:
- Tuition Fee Calculation
- Scholarship Discounts
- Payment Processing
- Remaining Balance Calculation
- Change Calculation

Scholarship Types:
- Academic Scholarship (50%)
- Athletic Scholarship (25%)

![Tuitioncli.png](src/main/resources/Images/Tuitioncli.png)


**AUTOMATED TESTING (JUnit)**

- Tuition Tests
- Enrollment Tests
- Validation Tests

Course Registrar Test
![CourseRegistrarTest.png](src/main/resources/Images/CourseRegistrarTest.png)

CourseRegistrationImpl Test
![CourseRegistrationImplTest.png](src/main/resources/Images/CourseRegistrationImplTest.png)

EnrollmentService Test
![EnrollmentServiceTest.png](src/main/resources/Images/EnrollmentServiceTest.png)

StudentRegistrationImpl Test
![StudentRegistrationImplTest.png](src/main/resources/Images/StudentRegistrationImplTest.png)

TuitionFeePayment Test
![TuitionFeePaymentTest.png](src/main/resources/Images/TuitionFeePaymentTest.png)