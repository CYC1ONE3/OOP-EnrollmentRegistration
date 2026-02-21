package org.example.model;

public class Course {
    private int courseID;
    private String courseName;
    private String program;

    public Course(){

    }
    public Course(int courseID) {
        this.courseID = courseID;
    }
    public Course(int courseID, String courseName, String program){
        this.courseID = courseID;
        this.courseName = courseName;
        this.program = program;
    }

    public int getcourseID(){
        return courseID;
    }
    public void setcourseID(int courseID){
        this.courseID = courseID;
    }
    public String getcourseName(){
        return courseName;
    }

    public void setcourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getprogram() {
        return program;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID='" + courseID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", program='" + program + '\'' +
                '}';
    }

    public void setprogram(String program) {
        this.program = program;



    }
}
