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
class Circle extends Shape {
    float radius;
    
    void area() {
        area = (float) (Math.PI * Math.pow(radius, 2));
    }
    
    public static void main(String args[]) {
        Scanner in;
        Circle obj;
        
        in = new Scanner(System.in);
        obj = new Circle();
        
        System.out.print("Enter the radius:\t");
        obj.radius = in.nextFloat();
        
        obj.area();
        
        System.out.println("The area of Circle is:\t" + obj.area);
    }
}
