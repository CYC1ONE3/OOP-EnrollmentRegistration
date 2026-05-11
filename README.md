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

![polymorphism.png](src/main/resources/Images/polymorphism.png)


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

![instructor-cli.png](src/main/resources/Images/instructor-cli.png)

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

![enrollment-cli.png](src/main/resources/Images/enrollment-cli.png)

**CUSTOM EXCEPTION**

The system uses `SectionFullException`
to prevent students from enrolling in full sections.

![exception.png](src/main/resources/Images/exception.png)

**AUTOMATED TESTING (JUnit)**

- Tuition Tests
- Enrollment Tests
- Validation Tests

![junit-tests.png](src/main/resources/Images/junit-tests.png)
