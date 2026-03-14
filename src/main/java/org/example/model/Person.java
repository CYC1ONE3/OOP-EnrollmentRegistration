package org.example.model;

public abstract class Person {

    private int ID;
    private String Name;

    public Person(){
        this(0);
    }
    public Person (int ID){

        this(ID, "Unknown");
    }
public Person (int ID, String Name){
        this.ID = ID;
        this.Name = Name;
}


    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public String getName(){
        return Name;
    }

    public void setName(){
        this.Name = Name;
    }

    public abstract void mainTask();

}
