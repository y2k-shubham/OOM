/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathWorks;

import java.util.Scanner;

/**
 *
 * @author y2k
 */
 class Shape {

    int getArea() {
        return -1;
    }
}

class Circle extends Shape {

    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    int getArea() {
        return ((int) Math.ceil(3.14159265 * radius * radius));
    }

}

class Rectangle extends Shape {

    float width;
    float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    int getArea() {
        return ((int) Math.ceil(width * height));
    }
}

class Square extends Shape {

    float width;

    public Square(float width) {
        this.width = width;
    }

    @Override
    int getArea() {
        return ((int) Math.ceil(width * width));
    }

}

/*
If you are required to use Interface instead of abstract class, then replace words "abstract class" with "interface" and replace "extends" with "implements"
If you are not required to use abstract class or interface then just remove the abstract class "Shape" and remove "extends Shape" words from other classes
 */
class MathWorks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println((new Circle(scanner.nextFloat())).getArea());
//        System.out.println((new Rectangle(scanner.nextFloat(), scanner.nextFloat())).getArea());
//        System.out.println((new Circle(scanner.nextFloat())).getArea());
//        System.out.println((new Square(scanner.nextFloat())).getArea());
//        System.out.println((new Rectangle(scanner.nextFloat(), scanner.nextFloat())).getArea());
        
        Shape s = new Square(5);
        System.out.println(((Shape) s).getArea());
    }

}
