package com.mycompany.csc229_lab01_work;

public class HomeWork {
    public static void main(String[] args) {
        //testing creating Course objects 
        Course c = new Course();
        Course c1 = new Course("CSC211", 112233, 012345);
        
        //testign setter methods 
        c.setName("CSC229");
        c1.setCode(01233333);
        
        //test the get methods with print statement 
        System.out.println("Course Name is: " + c.getName() + " Course Code is: " + c.getCode() + " Course ID is: " + c.getID());
        
        
                
        
    }
}
