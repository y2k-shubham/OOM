/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_0_Jul_10_2014;
import java.util.Scanner;
import java.io.PrintStream;

/**
 *
 * @author Arnav
 */

class Donor {
    String name;
    String rating;
    
    Donor() {
        name = null;
        rating = null;
    }
    
    void set() {
        Scanner in;
        char ch;
        
        in = new Scanner(System.in);
        
        System.out.println("Enter the details of Donor:-");
        
        System.out.print("Name:\t");
        name = in.nextLine();
        
        System.out.print("Rating:\t");
        ch = ((in.nextLine()).toLowerCase()).charAt(0);
        
        rating = (((ch == 'h') ? "high" : ((ch == 'm') ? "medium" : "none")));
    }
    
    void get() {
        System.out.println("\nThe details of donor are:-");
        System.out.println("Name:\t" + name);
        System.out.println("Rating:\t" + rating);
    }
    
    public static void main(String args[]) {
        Donor obj;
        
        obj = new Donor();
        
        obj.set();
        obj.get();
    }
}
