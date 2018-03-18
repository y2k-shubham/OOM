/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_1_Jul_15_2014;
import java.util.Scanner;
import java.io.PrintStream;
import Assign_1_Jul_15_2014.user.own.pack.Distance;

/**
 *
 * @author Arnav
 */

class Sum_Distances {
    void input(Distance d) {
        Scanner in;
        PrintStream ps;
        
        in = new Scanner(System.in);
        ps = System.out;
        
        ps.print("Feet:\t");
        d.Feet = in.nextInt();
        
        ps.print("Inches:\t");
        d.Inches = in.nextInt();
    }
    
    public static void main(String args[]) {
        Sum_Distances obj;
        Distance d_1;
        Distance d_2;
        Distance d_3;
        
        obj = new Sum_Distances();
        d_1 = new Distance();
        d_2 = new Distance();
        d_3 = null;
        
        System.out.println("Enter 1st distance:-");
        obj.input(d_1);
        
        System.out.println("\nEnter 2nd distance:-");
        obj.input(d_2);
        
        d_3 = d_1.add(d_1, d_2);
        
        obj.output(d_3);
    }
    
    void output(Distance d) {
        PrintStream ps;
        
        ps = System.out;
        
        ps.println("\nThe sum of distances is:-");
        ps.println("Feet:\t" + d.Feet);
        ps.println(("Inches:\t").concat(d.Inches + ""));
    }
}