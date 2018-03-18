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
class Employee_Q2_b extends Person_bcd {
    byte age;

    public Employee_Q2_b(byte age, String name) {
        super(name);
        this.age = age;
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("class Employee: finalize()");
    }
    
    public static void main(String args[]) throws Throwable {
        String name;
        byte age;
        Scanner in;
        Employee_Q2_b obj_1;
        Person_bcd obj_2;
        
        in = new Scanner(System.in);
        
        System.out.println("Enter the details of the Employee:-");
        
        System.out.print("Name:\t");
        name = in.nextLine();
        
        System.out.print("Age:\t");
        age = in.nextByte();
        
        obj_1 = new Employee_Q2_b(age, name);
        obj_2 = new Person_bcd(name);
        
        System.out.println("\nThe details of the Employee are:-");
        System.out.println("Name:\t" + obj_1.name);
        System.out.println("Age:\t" + obj_1.age);
        
        obj_1.finalize();
    }
}
