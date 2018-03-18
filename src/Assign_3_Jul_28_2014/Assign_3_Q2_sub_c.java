/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_3_Jul_28_2014;

import java.util.Scanner;

/**
 *
 * @author Arnav
 */
class Manager_Q2 extends Employee_Q2_b {

    String department;

    public Manager_Q2(String department, byte age, String name) {
        super(age, name);
        this.department = department;
    }

    public static void main(String args[]) {
        String name;
        byte age;
        String department;
        Scanner in;
        Manager_Q2 obj;
        
        in = new Scanner(System.in);
        
        System.out.println("Enter the details of the Manager:-");
        
        System.out.print("Name:\t\t");
        name = in.nextLine();
        
        System.out.print("Age:\t\t");
        age = in.nextByte();
        in.nextLine();
        
        System.out.print("Department:\t");
        department = in.nextLine();
        
        obj = new Manager_Q2(department, age, name);
        
        System.out.println("\nThe details of the Manager are:-");
        System.out.println("Name:\t\t" + obj.name);
        System.out.println("Age:\t\t" + obj.age);
        System.out.println("Department:\t" + obj.department);
    }
}
