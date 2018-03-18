/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOM_Mini_Project;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Arnav
 */
public class MyFrame extends JFrame {

    private Dimension size;
    private MyPanel panel;
    JLabel pointerLabel;
    private JLabel shapeLabel;
    private JLabel sizeLabel;
    private JLabel positionLabel;
    private JLabel axisOfRotationLabel;
    private JLabel posXLabel;
    private JLabel posYLabel;
    private JLabel rotXLabel;
    private JLabel rotYLabel;
    Choice shapeChoice;
    Choice sizeChoice;
    JButton drawButton;
    JButton clearButton;
    JTextField posXTextField;
    JTextField posYTextField;
    JTextField rotXTextField;
    JTextField rotYTextField;

    @Override
    public void setBounds(int x, int y, int width, int height) {
        size = new Dimension(width, height);
        super.setBounds(x, y, width, height); //To change body of generated methods, choose Tools | Templates.
    }

    public MyFrame(MyPanel panel, String title) throws HeadlessException {
        this.panel = panel;
        setTitle(title);
        setResizable(true);

        pointerLabel = new JLabel();
        shapeLabel = new JLabel("Shape");
        sizeLabel = new JLabel("Size");
        positionLabel = new JLabel("Position:");
        axisOfRotationLabel = new JLabel("Axis of Rotation:");
        posXLabel = new JLabel("X");
        posYLabel = new JLabel("Y");
        rotXLabel = new JLabel("X");
        rotYLabel = new JLabel("Y");

        shapeChoice = new Choice();
        sizeChoice = new Choice();

        drawButton = new JButton("Draw");
        clearButton = new JButton("Clear");

        posXTextField = new JTextField("250");
        posYTextField = new JTextField("120");
        rotXTextField = new JTextField("250");
        rotYTextField = new JTextField("120");

        shapeChoice.add("Rectangle");
        shapeChoice.add("Square");
        shapeChoice.add("Circle");
        shapeChoice.add("Triangle");
        shapeChoice.add("Star");
        shapeChoice.select("Circle");

        sizeChoice.add("1");
        sizeChoice.add("2");
        sizeChoice.add("3");
        sizeChoice.add("4");
        sizeChoice.add("5");
        sizeChoice.select("2");

        posXTextField.setMinimumSize(new Dimension(60, 20));
        posYTextField.setMinimumSize(new Dimension(60, 20));
        rotXTextField.setMinimumSize(new Dimension(60, 20));
        rotYTextField.setMinimumSize(new Dimension(60, 20));
        
        shapeChoice.setFocusable(false);
        sizeChoice.setFocusable(false);
        drawButton.setFocusable(false);
        clearButton.setFocusable(false);
    }

    public void addComponents() {
        JPanel dashboard;
        JPanel posX;
        JPanel posY;
        JPanel rotX;
        JPanel rotY;

        dashboard = new JPanel(new GridLayout(8, 2));
        posX = new JPanel();
        posY = new JPanel();
        rotX = new JPanel();
        rotY = new JPanel();

        posX.add(posXLabel);
        posX.add(posXTextField);

        posY.add(posYLabel);
        posY.add(posYTextField);

        rotX.add(rotXLabel);
        rotX.add(rotXTextField);

        rotY.add(rotYLabel);
        rotY.add(rotYTextField);

        dashboard.add(shapeLabel, -1);
        dashboard.add(shapeChoice, -1);
        dashboard.add(sizeLabel, -1);
        dashboard.add(sizeChoice, -1);
        dashboard.add(drawButton, -1);
        dashboard.add(clearButton, -1);
        dashboard.add(positionLabel, -1);
        dashboard.add(new JLabel(), -1);
        dashboard.add(posX, -1);
        dashboard.add(posY, -1);
        dashboard.add(axisOfRotationLabel, -1);
        dashboard.add(new JLabel(), -1);
        dashboard.add(rotX, -1);
        dashboard.add(rotY, -1);
        dashboard.add(pointerLabel, -1);
        dashboard.add(new JLabel(), -1);

        dashboard.setMaximumSize(new Dimension(120, 360));
        dashboard.setMinimumSize(new Dimension(120, 360));
        
        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        add(dashboard, BorderLayout.EAST);
    }
    
    public void showFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
