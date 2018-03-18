/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_3_Jul_2014_Re;

/**
 *
 * @author Arnav
 */
class MathUtil {
    public float cubedRoot(int num) {
        return (float) Math.cbrt(num);
    }
    
    public double circumference(double radius) {
        return (2 * Math.PI * radius);
    }
    
    public double area(double radius) {
        return (Math.PI * Math.pow(radius, 2));
    }
}

class MyProgram {
    public static void main(String args[]) {
        double circleArea;
        float cubeRoot;
        double circumference;
        MathUtil mat;
        
        mat = new MathUtil();
        circleArea = mat.area(4.2);
        cubeRoot = mat.cubedRoot(27);
        circumference = mat.circumference(1.6);
        
        System.out.println("Area:\t" + circleArea);
        System.out.println("cubeRoot:\t" + cubeRoot);
        System.out.println("circumference:\t" + circumference);
    }
}