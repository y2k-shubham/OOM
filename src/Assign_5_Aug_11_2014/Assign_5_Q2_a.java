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
class Shape_a {
    void draw() {
        System.out.println("Drawing a Shape");
    }
}

class Rectangle_a extends Shape_a {
    int width;
    int height;

    public Rectangle_a(int width, int height) {
        width %= 16;
        height %= 16;
        
        width = (width == 0) ? (1) : (width);
        height = (height == 0) ? (1) : (height);
        
        this.height = height;
        this.width = width;
    }

    @Override
    void draw() {
        super.draw(); //To change body of generated methods, choose Tools | Templates.
        
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

class RightTriangle_a extends Shape_a {
    int base;
    int height;

    public RightTriangle_a(int base, int height) {
        base %= 21;
        height %= 21;
        
        base = (base == 0) ? (1) : (base);
        height = (height == 0) ? (1) : (height);
        
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        super.draw(); //To change body of generated methods, choose Tools | Templates.
        
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

class Artist_a {
    void drawShape(Shape_a shp) {
        shp.draw();
    }
}

class ArtistDemo_a {
    public static void main(String args[]) {
        Shape_a shp;
        Rectangle_a rct;
        RightTriangle_a rtr;
        Artist_a art;
        
        shp = new Shape_a();
        rct = new Rectangle_a(7, 3);
        rtr = new RightTriangle_a(8, 4);
        art = new Artist_a();
        
        art.drawShape(shp);
        System.out.println();
        art.drawShape(rct);
        art.drawShape(rtr);
    }
}