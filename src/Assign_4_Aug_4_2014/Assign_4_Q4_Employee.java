/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_4_Aug_4_2014;

/**
 *
 * @author Arnav
 */
public class Assign_4_Q4_Employee extends Assign_4_Q4_Person {
    long employeeID;
    float commission;
    float salary;
    Assign_4_Q4_Candy Candy;
    Assign_4_Q4_Popcorn Popcorn;

    public Assign_4_Q4_Employee(String name, long employeeID, float salary, int quantCandy, int quantPopcorn) {
        super(name);
        this.employeeID = employeeID;
        this.salary = salary;
        this.Candy = new Assign_4_Q4_Candy(quantCandy);
        this.Popcorn = new Assign_4_Q4_Popcorn(quantPopcorn);
    }
    
    void calculateCommission() {
        this.commission = (Candy.commission * Candy.quantity) + (Popcorn.commission * Popcorn.quantity);
        System.out.println("Class Employee\nMethod calculateCommission");
    }
}
