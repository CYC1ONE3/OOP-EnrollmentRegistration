package org.example.Service;

import org.example.model.Instructor;

import java.util.List;

public interface IInstructorService {

    boolean addInstructor(Instructor instructor);

    List<Instructor> getAllInstructors();

    void updateInstructor(Instructor instructor);

    String deleteInstructor(Instructor instructor);

    void displayAllInstructors();
}
