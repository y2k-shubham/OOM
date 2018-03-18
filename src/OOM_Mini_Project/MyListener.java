/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOM_Mini_Project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Random;
import javax.swing.event.MouseInputListener;

/**
 *
 * @author Arnav
 */
public class MyListener implements ActionListener, MouseInputListener, MouseWheelListener, ItemListener {

    private final MyFrame frame;
    private final MyPanel panel;
    int posX;
    int posY;
    int dimX;
    int dimY;
    int rotX;
    int rotY;
    int size;
    Color color;
    String shape;
    double angle;
    Random r;

    public MyListener(MyFrame frame, MyPanel panel) {
        this.frame = frame;
        this.panel = panel;
        this.r = new Random();
        posX = 250;
        posY = 120;
        dimX = 60;
        dimY = 40;
        rotX = 250;
        rotY = 120;
        shape = "Circle";
        angle = 0;
    }

    private void drawShape() {
        panel.addShape();
        panel.setPosX(posX);
        panel.setPosY(posY);
        panel.setDimX(dimX);
        panel.setDimY(dimY);
        panel.setRotX(rotX);
        panel.setRotY(rotY);
        panel.setAngle(angle);
        panel.setColor(new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
        panel.setShape(shape);
        panel.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String component;

        component = e.getActionCommand();

        if (component.equalsIgnoreCase("Draw")) {
            try {
                posX = Integer.parseInt(frame.posXTextField.getText());
                posY = Integer.parseInt(frame.posYTextField.getText());
                rotX = Integer.parseInt(frame.rotXTextField.getText());
                rotY = Integer.parseInt(frame.rotYTextField.getText());
                size = Integer.parseInt(frame.sizeChoice.getSelectedItem());
                dimX = (int) (60.0 * (size / 3.0));
                dimY = (int) (40.0 * (size / 3.0));
                shape = frame.shapeChoice.getSelectedItem();
                angle = 0;

                if (!(shape.equalsIgnoreCase("Rectangle"))) {
                    dimY = dimX;
                }

                drawShape();
            } catch (NumberFormatException exp) {
                System.out.println("Invalid Arguments");
                posX = 250;
                posY = 120;
                dimX = 60;
                dimY = 40;
                rotX = 320;
                rotY = 180;
                shape = "Rectangle";
                angle = 0;
            }
        } else if ((component.equalsIgnoreCase("Clear"))) {
            panel.clearPanel();
            angle = 0;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource().equals(panel)) {
            if (e.getButton() == MouseEvent.BUTTON1) {
                frame.posXTextField.setText(e.getX() + "");
                frame.posYTextField.setText(e.getY() + "");

                try {
                    posX = Integer.parseInt(frame.posXTextField.getText());
                    posY = Integer.parseInt(frame.posYTextField.getText());
                    rotX = Integer.parseInt(frame.rotXTextField.getText());
                    rotY = Integer.parseInt(frame.rotYTextField.getText());
                    size = Integer.parseInt(frame.sizeChoice.getSelectedItem());
                    dimX = (int) (60 * (size / 3.0));
                    dimY = (int) (40 * (size / 3.0));
                    shape = frame.shapeChoice.getSelectedItem();
                    angle = 0;

                    if (!(shape.equalsIgnoreCase("Rectangle"))) {
                        dimY = dimX;
                    }

                    drawShape();
                } catch (NumberFormatException exp) {
                    System.out.println("Invalid Arguments");
                    posX = 250;
                    posY = 120;
                    dimX = 60;
                    dimY = 40;
                    rotX = 320;
                    rotY = 180;
                    shape = "Rectangle";
                    angle = 0;
                }
            } else if (e.getButton() == MouseEvent.BUTTON3) {
                frame.rotXTextField.setText(e.getX() + "");
                frame.rotYTextField.setText(e.getY() + "");
                angle = 0;

                rotX = Integer.parseInt(frame.rotXTextField.getText());
                rotY = Integer.parseInt(frame.rotYTextField.getText());
            }
        } else if (e.getSource().equals(frame.posXTextField)) {
            frame.posXTextField.selectAll();
        } else if (e.getSource().equals(frame.posYTextField)) {
            frame.posYTextField.selectAll();
        } else if (e.getSource().equals(frame.rotXTextField)) {
            frame.rotXTextField.selectAll();
        } else if (e.getSource().equals(frame.rotYTextField)) {
            frame.rotYTextField.selectAll();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        frame.pointerLabel.setText("(" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        frame.pointerLabel.setText("(" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getWheelRotation() < 0) {
            angle += Math.PI / 24;
        } else if (e.getWheelRotation() > 0) {
            angle -= Math.PI / 24;
        }

        // won't normalize angle when it is negative, condition should rather be angle == Math.PI || angle == -Math.PI
        if (angle == Math.PI) {
            angle = 0;
        }

        drawShape();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (e.getSource().equals(frame.shapeChoice)) {
            // item shape updated, like from circle to rectangle
            shape = frame.shapeChoice.getSelectedItem();
        } else if (e.getSource().equals(frame.sizeChoice)) {
            // item size updated, like from 5 to 2
            size = Integer.parseInt(frame.sizeChoice.getSelectedItem());
        }

        // recalculate dimensions based on updated size (should be put inside above else-if block)
        dimX = (int) (60.0 * (size / 3.0));
        dimY = (int) (40.0 * (size / 3.0));

        if (!shape.equalsIgnoreCase("Rectangle")) {
            dimY = dimX;
        }
    }

}
