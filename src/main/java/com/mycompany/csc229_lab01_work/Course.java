package com.mycompany.csc229_lab01_work;

public class Course {
   
    //data members
    private int ID;
    private String name;
    private int code;
    
    //default constructor to initialize objects with default values
    public Course(){
        this.name = "CSC";
        this.ID = 012345;
        this.code = 54321;
    }
    
    //overloaded constructor with custom values for data members
    public Course(String name, int ID, int code){
        this.name = name;
        this.ID = ID;
        this.code = code;
    }
    
    //lines 24-47 are getter and setter methods
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
}
