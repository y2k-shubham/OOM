/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_3_Jul_2014_Re;

/**
 *
 * @author Arnav
 */
class Person_Q2_b {
    String name;

    public Person_Q2_b(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Superclass finalized");
    }
}

class Employee_Q2_b extends Person_Q2_b {
    byte age;

    public Employee_Q2_b(byte age, String name) {
        super(name);
        this.age = age;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Subclass finalized");
    }
    
    public static void main(String args[]) {
        Person_Q2_b per;
        Employee_Q2_b emp;
        
        per = new Person_Q2_b(null);
        emp = new Employee_Q2_b(((byte) 30), "NO_NAME");
    }
}