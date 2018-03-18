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
class Person_Q2_c {
    String name;

    public Person_Q2_c(String name) {
        this.name = name;
    }
}

class Employee_Q2_c extends Person_Q2_c {
    byte age;

    public Employee_Q2_c(byte age, String name) {
        super(name);
        this.age = age;
    }
}

class Manager_Q2_c extends Employee_Q2_c {
    String department;

    public Manager_Q2_c(String department, byte age, String name) {
        super(age, name);
        this.department = department;
    }
    
    public static void main(String args[]) {
        Person_Q2_c per;
        Employee_Q2_c emp;
        Manager_Q2_c man;
        
        per = new Person_Q2_c(null);
        emp = new Employee_Q2_c((byte) 0, null);
        man = new Manager_Q2_c("Sales", (byte) 42, "Dhimnesh Awasthi");
    }
}