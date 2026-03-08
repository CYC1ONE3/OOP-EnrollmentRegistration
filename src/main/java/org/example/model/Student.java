package org.example.model;


public class Student extends Person{

    private String program;
    public Student(){
        this(0, "Unknown", "None");
    }

    public Student(int ID, String Name, String program){
        super(ID, Name);
        this.program = program;
    }

    public String getProgram(){
        return program;
    }

    public void setProgram(String program){
        this.program = program;
    }
}
