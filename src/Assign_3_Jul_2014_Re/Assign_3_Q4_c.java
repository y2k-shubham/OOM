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
abstract class Shape {

    abstract float area();
}

class rectange extends Shape {

    float length;
    float breadth;

    @Override
    float area() {
        return (length * breadth);
    }
}

class circle extends Shape {

    float radius;

    @Override
    float area() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }
}

class triangle extends Shape {
    
    float base;
    float height;
    Shape shape;
    
    @Override
    float area() {
        return ((1 / 2) * base * height);
    }    
}