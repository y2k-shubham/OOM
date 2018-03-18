/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOM_Mini_Project;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Arnav
 */
public class MyPanel extends JPanel {

    private int numOfShapes;
    private Shape shapes[];
    private Dimension size;
    private Color color;

    public MyPanel() {
        numOfShapes = -1;
        shapes = new Shape[2000];
    }

    private class Shape {

        int posX;
        int posY;
        int dimX;
        int dimY;
        int rotX;
        int rotY;
        double angle;
        String shape;
        Color color;
    }

    @Override
    public void setSize(Dimension d) {
        super.setSize(d); //To change body of generated methods, choose Tools | Templates.
        setMinimumSize(d);
        setMaximumSize(d);
    }

    @Override
    public void setBackground(Color bg) {
        color = bg;
        super.setBackground(color); //To change body of generated methods, choose Tools | Templates.
    }

    public void addShape() {
        shapes[++numOfShapes] = new Shape();
    }

    public void setPosX(int posX) {
        shapes[numOfShapes].posX = posX;
    }

    public void setPosY(int posY) {
        shapes[numOfShapes].posY = posY;
    }

    public void setDimX(int dimX) {
        shapes[numOfShapes].dimX = dimX;
    }
    
    public int getDimX() {
        return shapes[numOfShapes].dimX;
    }

    public void setDimY(int dimY) {
        shapes[numOfShapes].dimY = dimY;
    }

    public void setRotX(int rotX) {
        shapes[numOfShapes].rotX = rotX;
    }

    public void setRotY(int rotY) {
        shapes[numOfShapes].rotY = rotY;
    }

    public void setAngle(double angle) {
        shapes[numOfShapes].angle = angle;
    }

    public void setColor(Color color) {
        shapes[numOfShapes].color = color;
    }

    public void setShape(String shape) {
        shapes[numOfShapes].shape = shape;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.

        int i;
        Graphics2D graphics2D;

        graphics2D = (Graphics2D) g;

        for (i = 0; i <= numOfShapes; i++) {
            graphics2D.rotate(shapes[i].angle, shapes[i].rotX, shapes[i].rotY);
            graphics2D.setColor(shapes[i].color);

            if ((shapes[i].shape.equalsIgnoreCase("Rectangle")) || (shapes[i].shape.equalsIgnoreCase("Square"))) {
                graphics2D.fillRect(shapes[i].posX, shapes[i].posY, shapes[i].dimX, shapes[i].dimY);
            } else if (shapes[i].shape.equalsIgnoreCase("Circle")) {
                graphics2D.fillOval(shapes[i].posX, shapes[i].posY, shapes[i].dimY, shapes[i].dimY);
            } else if (shapes[i].shape.equalsIgnoreCase("Triangle")) {
                graphics2D.fillPolygon((new int[]{shapes[i].posX, (shapes[i].posX - shapes[i].dimX / 2), (shapes[i].posX + shapes[i].dimX / 2)}), (new int[]{shapes[i].posY, (shapes[i].posY + shapes[i].dimY), (shapes[i].posY + shapes[i].dimY)}), 3);
            } else if (shapes[i].shape.equalsIgnoreCase("Star")) {
                int abscissae[] = {(shapes[i].posX),
                    (int) (shapes[i].posX + 10.0 / 55.0 * shapes[i].dimX / 2.0),
                    (int) (shapes[i].posX + shapes[i].dimX / 2.0),
                    (int) (shapes[i].posX + 23.0 / 55.0 * shapes[i].dimX / 2.0),
                    (int) (shapes[i].posX + 32.0 / 55.0 * shapes[i].dimX / 2.0),
                    (int) (shapes[i].posX),
                    (int) (shapes[i].posX - 32.0 / 55.0 * shapes[i].dimX / 2.0),
                    (int) (shapes[i].posX - 23.0 / 55.0 * shapes[i].dimX / 2.0),
                    (int) (shapes[i].posX - shapes[i].dimX / 2.0),
                    (int) (shapes[i].posX - 10.0 / 55.0 * shapes[i].dimX / 2.0)};

                //System.out.println("distance = " + 10.0 / 55.0 * shapes[i].dimX / 2.0);
                //System.out.println("posX = " + (int) (shapes[i].posX + 10.0 / 55.0 * shapes[i].dimX / 2.0));
                
                int oordinates[] = {(shapes[i].posY),
                    (int) (shapes[i].posY + 31.0 / 85.0 * shapes[i].dimY),
                    (int) (shapes[i].posY + 31.0 / 85.0 * shapes[i].dimY),
                    (int) (shapes[i].posY + 52.0 / 85.0 * shapes[i].dimY),
                    (int) (shapes[i].posY + shapes[i].dimY),
                    (int) (shapes[i].posY + 66.0 / 85.0 * shapes[i].dimY),
                    (int) (shapes[i].posY + shapes[i].dimY),
                    (int) (shapes[i].posY + 52.0 / 85.0 * shapes[i].dimY),
                    (int) (shapes[i].posY + 31.0 / 85.0 * shapes[i].dimY),
                    (int) (shapes[i].posY + 31.0 / 85.0 * shapes[i].dimY)};

                /*
                for (int j = 0; j < 10; j++) {
                    System.out.println("(" + abscissae[j] + ", " + oordinates[j] + ")");
                }
                System.out.println("------");
                */
                graphics2D.fillPolygon(abscissae, oordinates, 10);
            }

            graphics2D.rotate((-1 * shapes[i].angle), shapes[i].rotX, shapes[i].rotY);
        }
    }

    public void clearPanel() {
        super.repaint();
        shapes = new Shape[2000];
        numOfShapes = -1;
        removeAll();
    }

}
