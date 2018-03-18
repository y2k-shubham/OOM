/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_3_Jul_28_2014;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Arnav
 */
class Employee_Q2_a extends Person_a {
    byte age;
    
    void setData(byte age) {
        this.age = age;
    }
    
    @Override
    String getData() {
        String name;
        
        name = new String("Name:\t");
        name = name.concat(super.getData());
        name += "\nAge:\t" + age;
        
        return name;
    }
    
    public static void main(String args[]) {
        String name;
        byte age;
        Scanner in;
        PrintStream ps;
        Employee_Q2_a obj;
        
        in = new Scanner(System.in);
        ps = System.out;
        obj = new Employee_Q2_a();
        
        ps.println("\nEnter the details of the Employee:-");
        
        ps.print("Name:\t");
        name = in.nextLine();
        
        ps.print("Age:\t");
        age = in.nextByte();
        
        obj.setData(name);
        obj.setData(age);
        
        ps.println("\nThe details of the Employee are:-");
        ps.println(obj.getData());
    }
}
