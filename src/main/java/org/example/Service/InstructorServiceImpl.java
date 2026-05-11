package org.example.Service;

import org.example.model.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorServiceImpl implements IInstructorService {

    private ArrayList<Instructor> instructors =
            new ArrayList<>();

    @Override
    public boolean addInstructor(
            Instructor instructor
    ){

        for (Instructor i : instructors){

            if (i.getID() == instructor.getID()){

                return false;
            }
        }

        instructors.add(instructor);

        return true;
    }

    @Override
    public List<Instructor> getAllInstructors(){

        return instructors;
    }

    @Override
    public void updateInstructor(
            Instructor instructor
    ){

        for (int i = 0; i < instructors.size(); i++){

            if (instructors.get(i).getID()
                    == instructor.getID()){

                instructors.set(i, instructor);
                break;
            }
        }
    }

    @Override
    public String deleteInstructor(
            Instructor instructor
    ){

        for (int i = 0; i < instructors.size(); i++){

            if (instructors.get(i).getID()
                    == instructor.getID()){

                instructors.remove(i);

                return "Successfully deleted";
            }
        }

        return "Instructor not found";
    }

    @Override
    public void displayAllInstructors() {

    }
}