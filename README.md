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

**AUTOMATED TESTING (JUnit)**

- Tuition Tests
- Enrollment Tests
- Validation Tests

![CourseRegistrarTest.png](src/main/resources/Images/CourseRegistrarTest.png)
![CourseRegistrationImpl.png](src/main/resources/Images/CourseRegistrationImpl.png)
![EnrollmentServiceTest.png](src/main/resources/Images/EnrollmentServiceTest.png)
![StudentRegistrationImpl.png](src/main/resources/Images/StudentRegistrationImpl.png)
![TuitionFeePaymentTest.png](src/main/resources/Images/TuitionFeePaymentTest.png)