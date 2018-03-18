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
class MyProgram {
    public static void main(String args[]) {
        int num;
        Scanner in;
        MathUtil obj;
        
        in = new Scanner(System.in);
        obj = new MathUtil();
        
        System.out.print("Enter a positive integer: ");
        num = in.nextInt();
        
        System.out.println("\nCubeRoot of " + num + " is:\t\t\t\t" + obj.cubedRoot(num));
        System.out.println("Area of circle with radius " + num + " is:\t\t" + obj.area(num));
        System.out.println("Circumference of circle with radius " + num + " is:\t" + obj.circumference(num));
    }
}
