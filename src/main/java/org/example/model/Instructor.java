package org.example.model;

public class Instructor extends Person{
    private String courses;
    public Instructor(){
        this(0, "Unknown", "None");
    }

    public Instructor(int ID, String Name, String courses){
        super(ID, Name);
        this.courses = courses;
    }

    public String getCourses(){
        return courses;
    }

    public void setCourses(String courses){
        this.courses = courses;
    }
}
