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
class Triangle extends Shape {
    float base;
    float height;
    
    void area() {
        area = (base * height) / 2;
    }
    
    public static void main(String args[]) {
        Scanner in;
        Triangle obj;
        
        in = new Scanner(System.in);
        obj = new Triangle();
        
        System.out.println("Enter the dimensions of the Triangle:-");

        System.out.print("Base:\t");
        obj.base = in.nextFloat();

        System.out.print("Height:\t");
        obj.height = in.nextFloat();

        obj.area();

        System.out.println("\nThe area of Triangle is:\t" + obj.area);
    }
}
