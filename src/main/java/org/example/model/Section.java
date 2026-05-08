package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Section {

    private String sectionName;
    private int maxCapacity;
    private List<Student> students;
    private Instructor instructor;

    public Section(String sectionName, int maxCapacity) {
        this.sectionName = sectionName;
        this.maxCapacity = maxCapacity;
        this.students = new ArrayList<>();
    }

    public String getSectionName() {
        return sectionName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
