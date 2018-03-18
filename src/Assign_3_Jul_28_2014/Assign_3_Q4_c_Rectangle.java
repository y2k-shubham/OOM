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
class Rectangle extends Shape {

    float length;
    float breadth;

    void area() {
        area = length * breadth;
    }

    public static void main(String args[]) {
        Scanner in;
        Rectangle obj;

        in = new Scanner(System.in);
        obj = new Rectangle();

        System.out.println("Enter the dimensions of the Rectangle:-");

        System.out.print("Length:\t\t");
        obj.length = in.nextFloat();

        System.out.print("Breadth:\t");
        obj.breadth = in.nextFloat();

        obj.area();

        System.out.println("\nThe area of Rectangle is:\t" + obj.area);
    }
}
