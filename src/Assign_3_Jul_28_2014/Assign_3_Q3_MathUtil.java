/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_3_Jul_28_2014;
//import java.lang.Math;

/**
 *
 * @author Arnav
 */
class MathUtil {

    public double cubedRoot(int num) {
        return Math.cbrt(num);
    }

    public double circumference(double radius) {
        return (2 * Math.PI * radius);
    }

    public double area(double radius) {
        return (Math.PI * Math.pow(radius, 2));
    }
}
