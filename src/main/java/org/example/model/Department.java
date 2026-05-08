package org.example.Service;

import org.example.model.*;
import org.example.exception.SectionFullException;

public class EnrollmentServiceImpl implements IEnrollmentService {

    @Override
    public void enrollStudentInSection(Student student, Section section)
            throws SectionFullException {

        // 🔥 CAPACITY VALIDATION (CRITICAL REQUIREMENT)
        if (section.getStudents().size() >= section.getMaxCapacity()) {
            throw new SectionFullException(
                    "Enrollment failed: " + section.getSectionName() + " is full."
            );
        }

        section.getStudents().add(student);
    }

    @Override
    public void viewDepartmentHierarchy(Department department) {

        System.out.println("Department: " + department.getName());

        for (Section section : department.getSections()) {

            System.out.println("\nSection: " + section.getSectionName());

            if (section.getInstructor() != null) {
                System.out.println("Instructor: " +
                        section.getInstructor().getName());
            }

            System.out.println("Students:");

            for (Student student : section.getStudents()) {
                System.out.println("- " + student.getName());
            }
        }
    }
}
