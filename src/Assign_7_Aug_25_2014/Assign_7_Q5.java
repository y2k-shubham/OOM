/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_7_Aug_25_2014;

import java.io.PrintStream;

/**
 *
 * @author Arnav
 */
class Shape {

    String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

interface Area {

    double area();
}

interface Volume {

    double volume();
}

class Circle extends Shape implements Area {

    double radius;

    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (Math.PI * Math.pow(radius, 2));
    }

}

class Square extends Shape implements Area {

    double side;

    public Square(double side, String name) {
        super(name);
        this.side = side;
    }

    @Override
    public double area() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (Math.pow(side, 2));
    }

}

class Cylinder extends Circle implements Volume {

    double height;

    public Cylinder(double height, double radius, String name) {
        super(radius, name);
        this.height = height;
    }

    @Override
    public double volume() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (Math.PI * Math.pow(radius, 2) * height);
    }

    @Override
    public double area() {
        return (2 * Math.PI * radius * (radius + height)); //To change body of generated methods, choose Tools | Templates.
    }
}

class Sphere extends Circle implements Volume {

    public Sphere(double radius, String name) {
        super(radius, name);
    }

    @Override
    public double volume() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (area() * (radius) / 3);
    }

    @Override
    public double area() {
        return (4 * super.area()); //To change body of generated methods, choose Tools | Templates.
    }

}

class Cube extends Square implements Volume {

    public Cube(double radius, String name) {
        super(radius, name);
    }

    @Override
    public double volume() {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (Math.pow(side, 3));
    }

    @Override
    public double area() {
        return (6 * super.area()); //To change body of generated methods, choose Tools | Templates.
    }

}

class Glome extends Sphere implements Volume {

    public Glome(double radius, String name) {
        super(radius, name);
    }

    @Override
    public double volume() {
        return -999;
    }

    @Override
    public double area() {
        return -999; //To change body of generated methods, choose Tools | Templates.
    }

}

public class Assign_7_Q5 {

    public static void main(String args[]) {
        Circle cir;
        Square sqr;
        Cylinder cyl;
        Sphere sph;
        Cube cub;
        Glome glo;
        Assign_7_Q5 as7;

        cir = new Circle(1.5, "Circle");
        sqr = new Square(2.5, "Square");
        cyl = new Cylinder(10.0, 2.5, "Cylinder");
        sph = new Sphere(5.6, "Sphere");
        cub = new Cube(2.4, "Cube");
        glo = new Glome(20.0, "Glome");
        as7 = new Assign_7_Q5();

        as7.output(cir);
        as7.output(sqr);
        as7.output(cyl);
        as7.output(sph);
        as7.output(cub);
        as7.output(glo);
    }

    public void output(Shape shp) {
        PrintStream pst = System.out;

        pst.println();
        if (shp.getClass().toString().endsWith("Circle")) {
            Circle cir = (Circle) shp;
            pst.println(cir.getName());
            pst.println("Radius:\t" + cir.radius);
            pst.println("Area:\t" + cir.area());
        } else if (shp.getClass().toString().endsWith("Square")) {
            Square sqr = (Square) shp;
            pst.println(sqr.getName());
            pst.println("Side:\t" + sqr.side);
            pst.println("Area:\t" + sqr.area());
        } else if (shp.getClass().toString().endsWith("Cylinder")) {
            Cylinder cyl = (Cylinder) shp;
            pst.println(cyl.getName());
            pst.println("Radius:\t" + cyl.radius);
            pst.println("Height:\t" + cyl.height);
            pst.println("Area:\t" + cyl.area());
            pst.println("Volume:\t" + cyl.volume());
        } else if (shp.getClass().toString().endsWith("Sphere")) {
            Sphere sph = (Sphere) shp;
            pst.println(sph.getName());
            pst.println("Radius:\t" + sph.radius);
            pst.println("Area:\t" + sph.area());
            pst.println("Volume:\t" + sph.volume());
        } else if (shp.getClass().toString().endsWith("Cube")) {
            Cube cub = (Cube) shp;
            pst.println(cub.getName());
            pst.println("Side:\t" + cub.side);
            pst.println("Area:\t" + cub.area());
            pst.println("Volume:\t" + cub.volume());
        } else {
            Glome glo = (Glome) shp;
            pst.println(glo.getName());
            pst.println("Radius:\t" + glo.radius);
            pst.println("Area:\t<unknown>");
            pst.println("Volume:\t <Unknown>");
        }
        pst.println();
    }
}
