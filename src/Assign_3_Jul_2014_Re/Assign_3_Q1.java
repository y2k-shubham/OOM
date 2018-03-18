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
class Employee_Q1 {

    String Emp_code;
    String Emp_name;
    String Address;
    long Phone_no;
    final byte DA = 10;
    final byte HRA = 20;

    float salary(float Basic_pay) {
        return ((Basic_pay) + (Basic_pay * DA / 100) + (Basic_pay * HRA / 100));
    }
}

class Manager extends Employee_Q1 {

    float Basic_pay;

    public Manager(float Basic_pay) {
        this.Basic_pay = Basic_pay;
    }

    float salary(float Basic_pay) {
        return ((Basic_pay * DA / 100) + (Basic_pay * HRA / 100));
    }
}

class Typist extends Employee_Q1 {

    float Basic_pay;

    public Typist(float Basic_pay) {
        this.Basic_pay = Basic_pay;
    }
}

class Officer extends Employee_Q1 {

    float Basic_pay;

    public Officer(float Basic_pay) {
        this.Basic_pay = Basic_pay;
    }
}

class Q1_Main {

    public static void main(String args[]) {
        Manager man;
        Typist typ;
        Officer off;
        
        man = new Manager(50000);
        typ = new Typist(10000);
        off = new Officer(35000);
        
        System.out.println("Manager's Salary:\t" + man.salary(man.Basic_pay));
        System.out.println("Typist's Salary:\t" + typ.salary(typ.Basic_pay));
        System.out.println("Officer's Salary:\t" + off.salary(off.Basic_pay));
    }
}
