/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_5_Aug_11_2014;

/**
 *
 * @author Arnav
 */
abstract class Shape_b {

    abstract void draw();
}

class Rectangle_b extends Shape_b {

    int width;
    int height;

    public Rectangle_b(int width, int height) {
        width %= 16;
        height %= 16;

        width = (width == 0) ? (1) : (width);
        height = (height == 0) ? (1) : (height);

        this.height = height;
        this.width = width;
    }

    @Override
    void draw() {
//        super.draw(); //To change body of generated methods, choose Tools | Templates.

        int i;
        int j;

        for (i = 1; i <= height; i++) {
            for (j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }
}

class RightTriangle_b extends Shape_b {

    int base;
    int height;

    public RightTriangle_b(int base, int height) {
        base %= 21;
        height %= 21;

        base = (base == 0) ? (1) : (base);
        height = (height == 0) ? (1) : (height);

        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        //super.draw(); //To change body of generated methods, choose Tools | Templates.

        int i;
        int j;

        for (i = height; i >= 1; i--) {
            for (j = 0; j <= ((base * (height - i)) / height); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }
}

class Artist_b {

    void drawShape(Shape_b shp) {
        shp.draw();
    }
}

class ArtistDemo_b {

    public static void main(String args[]) {
        //Shape_b shp;
        Rectangle_b rct;
        RightTriangle_b rtr;
        Artist_b art;
        Ladder lad;

        //shp = new Shape_b();
        rct = new Rectangle_b(7, 3);
        rtr = new RightTriangle_b(8, 4);
        art = new Artist_b();
        lad = new Ladder(5);

        //art.drawShape_b(shp);
        System.out.println();
        art.drawShape(rct);
        art.drawShape(rtr);
        lad.draw();
    }
}

class Ladder extends Shape_b {

    int rungs;

    public Ladder(int rungs) {
        this.rungs = rungs;
    }

    @Override
    void draw() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        System.out.println("*************************");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("*************************");
    }
}
