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
class Student extends Person_bcd {
    String branch;

    public Student(String branch, String name) {
        super(name);
        this.branch = branch;
    }
    
    public static void main(String args[]) {
        String name;
        String branch;
        Scanner in;
        Student obj;
        
        in = new Scanner(System.in);
        
        System.out.println("Enter the details of the student:-");
        
        System.out.print("Name:\t");
        name = in.nextLine();
        
        System.out.print("Branch:\t");
        branch = in.nextLine();
        
        obj = new Student(branch, name);
        
        System.out.println("\nThe details of the Student are:-");
        System.out.println("Name:\t" + obj.name);
        System.out.println("Branch:\t" + obj.branch);
    }
}
