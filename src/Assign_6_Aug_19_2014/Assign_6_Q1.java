/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_6_Aug_19_2014;

/**
 *
 * @author Arnav
 */
class Person {

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void writeOutput() {
            System.out.println("Name of the Person" + name);
    }

    boolean hasSameName(Person otherPerson) {
        if (name.equals(otherPerson.name)) {
            return true;
        } else {
            return false;
        }
    }
}

class Employee extends Person {

    double annualSalary;
    int yearHired;
    String identificationNumber;

    public Employee() {
        annualSalary = 0.0;
        yearHired = 0;
        identificationNumber = null;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearHired() {
        return yearHired;
    }

    public void setYearHired(int yearHired) {
        this.yearHired = yearHired;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }
    /*
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public boolean equals(java.lang.Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

public class Assign_6_Q1 {
    public static void main(String args[]) {
        Employee emp_1;
        Employee emp_2;
        Assign_6_Q1 as6;
        
        emp_1 = new Employee();
        emp_2 = new Employee();
        as6 = new Assign_6_Q1();
        
        as6.setData(emp_1, "Ashutosh Tewari", 326000, "BEI0244", 2011);
        as6.setData(emp_2, "Dhawal Kulkarni", 591000, "BER0915", 2012);
        
        System.out.println("The details of 1st Employee objext are:-");
        as6.getData(emp_1);
        
        System.out.println("The details of 2nd Employee object are:-");
        as6.getData(emp_2);
        
        if (emp_1.equals(emp_2)) {
            System.out.println("Both employee objects are equal");
        } else {
            System.out.println("Both employee objects are different");
        }
        
        if (emp_1.hasSameName(emp_2)) {
            System.out.println("\nBoth Persons have same name");
        } else {
            System.out.println("\nBoth Persons have different names");
        }
    }
    
    void setData(Employee emp, String name, double annualSalary, String identificationNumber, int yearHired) {
        emp.setName(name);
        emp.setAnnualSalary(annualSalary);
        emp.setIdentificationNumber(identificationNumber);
        emp.setYearHired(yearHired);
    }
    
    void getData(Employee emp) {
        System.out.println("Name:\t\t\t" + emp.getName());
        System.out.println("Annual Salary:\t\t" + emp.getAnnualSalary());
        System.out.println("Identification Number:\t" + emp.getIdentificationNumber());
        System.out.println("Year Hired:\t\t" + emp.getYearHired() + "\n");
    }
}