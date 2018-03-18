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
class Person_Q2_d {

    String name;

    public Person_Q2_d(String name) {
        this.name = name;
    }
}

class Employee_Q2_d extends Person_Q2_d {

    byte age;

    public Employee_Q2_d(byte age, String name) {
        super(name);
        this.age = age;
    }
}

class Student_Q2_d extends Person_Q2_d {

    char grade;

    public Student_Q2_d(char grade, String name) {
        super(name);
        this.grade = grade;
    }
}

class Q2_d_Main {
    public static void main(String args[]) {
        Person_Q2_d per;
        Employee_Q2_d emp;
        Student_Q2_d std;
        
        per = new Person_Q2_d(null);
        emp = new Employee_Q2_d((byte) 32, "Emploee");
        std = new Student_Q2_d('B', "Student");
    }
}