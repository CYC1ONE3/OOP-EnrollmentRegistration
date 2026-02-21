package org.example.model;


public class Student {
    private int ID;
    private String Name;
    private String program;

    public Student(int ID) {
        this.ID = ID;
    }

    public Student(int ID, String Name, String program) {
        this.ID = ID;
        this.Name = Name;
        this.program = program;

    }

    public int getID() {

        return ID;
    }

    public void setID(int ID) {

        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {

        this.Name = Name;
    }

    public String getprogram() {

        return program;
    }

    public void setprogram(String program) {
        this.program = program;
    }


    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
