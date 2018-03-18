/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_6_Aug_19_2014;

/**
 *
 * @author Arnav
 */
interface measurable {
    double getperimeter();
    public abstract double getarea();
}

class Reactangle implements measurable {
    double width;
    double height;

    public Reactangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getarea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (width * height);
    }

    @Override
    public double getperimeter() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (2 * (width + height));
    }
}

class Circle implements measurable {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getarea() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double getperimeter() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (2 * Math.PI * radius);
    }
    
    double getcircumference() {
        return getperimeter();
    }
}

public class Assign_6_Q2 {
    public static void main(String args[]) {
        Circle cir;
        measurable mes_rct;
        measurable mes_cir;
        Assign_6_Q2 obj;
        
        cir = new Circle(10.0);
        obj = new Assign_6_Q2();
        mes_cir = new measurable() {
            Circle cir = new Circle(10.0);
            
            @Override
            public double getperimeter() {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                return (cir.getperimeter());
            }

            @Override
            public double getarea() {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                return cir.getarea();
            }
        };
        mes_rct = new measurable() {
            Reactangle rct = new Reactangle(6.5, 4.2);
            
            @Override
            public double getperimeter() {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                return (rct.getperimeter());
            }

            @Override
            public double getarea() {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                return (rct.getarea());
            }
        };
        
        System.out.println("Reactangle:-");
        obj.display(mes_rct);
        
        System.out.println("\nCircle:-");
        System.out.println("Circumference:\t" + cir.getcircumference());
        obj.display(mes_cir);
    }
    
    void display(measurable mes) {
        System.out.println("Perimeter:\t" + mes.getperimeter());
        System.out.println("Area:\t\t" + mes.getarea());
    }
}