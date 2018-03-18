/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_6_Aug_19_2014;

import java.awt.Color;

/**
 *
 * @author Arnav
 */
class Position {
    int X;
    int Y;

    public Position(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
}

abstract class GraphicsObject {
    Position pos;
    Color fillColor;

    public GraphicsObject(Position pos, Color fillColor) {
        this.pos = pos;
        this.fillColor = fillColor;
    }
    
    void moveTo(int newX, int newY) {
        pos.X = newX;
        pos.Y = newY;
    }
    
    void showPosition() {
        System.out.println("Position X:\t" + pos.X);
        System.out.println("Position Y:\t" + pos.Y);
    }
    
    void showFillColor() {
        System.out.println("FillColor:\t" + fillColor.toString());
    }
    
    abstract void draw();
    abstract void resize();
    abstract void showDimensions();
}

class Rectangle extends GraphicsObject {
    int length;
    int breadth;

    public Rectangle(int length, int breadth, Position pos, Color fillColor) {
        super(pos, fillColor);
        this.length = length;
        this.breadth = breadth;
    }
    
    @Override
    void draw() {
        System.out.println("Rectangle Draw");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void resize() {
        System.out.println("Rectangle Resize");
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void showDimensions() {
        System.out.println("Rectangle showDimensions");
        System.out.println("Length:\t\t" + length);
        System.out.println("Breadth:\t" + breadth);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Line extends GraphicsObject {
    int length;
    float inclination;

    public Line(int length, float inclination, Position pos, Color fillColor) {
        super(pos, fillColor);
        this.length = length;
        this.inclination = inclination;
    }
    
    @Override
    void draw() {
        System.out.println("Line Draw");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void resize() {
        System.out.println("Line Resize");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void showDimensions() {
        System.out.println("Line showDimensions");
        System.out.println("Length:\t\t" + length);
        System.out.println("Inclination:\t" + inclination);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Bezier extends GraphicsObject {
    int length;
    int breadth;
    int numOfLoops;

    public Bezier(int length, int breadth, int numOfLoops, Position pos, Color fillColor) {
        super(pos, fillColor);
        this.length = length;
        this.breadth = breadth;
        this.numOfLoops = numOfLoops;
    }
    
    @Override
    void draw() {
        System.out.println("Bezier Draw");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void resize() {
        System.out.println("Bezier Resize");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void showDimensions() {
        System.out.println("Bezier showDimensions");
        System.out.println("Length:\t\t" + length);
        System.out.println("Breadth:\t" + breadth);
        System.out.println("NumOfLoops:\t" + numOfLoops);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Circle_Q3 extends GraphicsObject {
    int radius;

    public Circle_Q3(int radius, Position pos, Color fillColor) {
        super(pos, fillColor);
        this.radius = radius;
    }
    
    @Override
    void draw() {
        System.out.println("Circle Draw");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void resize() {
        System.out.println("Circle Resize");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void showDimensions() {
        System.out.println("Circle showDimensions");
        System.out.println("Radius:\t\t" + radius);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class Assign_6_Q3 {
    public static void main(String args[]) {
        Rectangle rct;
        Line lin;
        Bezier bez;
        Circle_Q3 cir;
        Position pos;
        Assign_6_Q3 obj;
        
        pos = new Position(5, 7);
        rct = new Rectangle(8, 3, pos, Color.yellow);
        lin = new Line(6, 1.51f, pos, Color.BLACK);
        bez = new Bezier(9, 5, 13, pos, Color.red);
        cir = new Circle_Q3(2, pos, Color.GREEN);
        obj = new Assign_6_Q3();
        
        System.out.println("The details of rectangle are:-");
        obj.showCommonTraits(rct);
        
        System.out.println("\nThe details of line are:-");
        lin.moveTo(18, 23);
        obj.showCommonTraits(lin);
        
        System.out.println("\nThe details of bezier are:-");
        obj.showCommonTraits(bez);
        
        System.out.println("\nThe details of circle are:-");
        cir.moveTo(11, 19);
        obj.showCommonTraits(cir);
    }
    
    void showCommonTraits(GraphicsObject obj) {
        obj.showPosition();
        obj.showFillColor();
        obj.showDimensions();
        obj.draw();
        obj.resize();
    }
}