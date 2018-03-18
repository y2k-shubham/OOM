/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOM_Mini_Project;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author Arnav
 */
public class Main {

    MyPanel panel;
    MyFrame frame;
    MyListener listener;

    public Main() {
        createPanel();
        createFrame();
        listener = new MyListener(frame, panel);
    }

    private void createPanel() {
        panel = new MyPanel();
        panel.setSize(new Dimension(1000, 768));
        panel.setBackground(Color.WHITE);
    }

    private void createFrame() {
        frame = new MyFrame(panel, "2D Shapes");
        frame.setBounds(0, 0, 1366, 768);
        frame.addComponents();
        frame.showFrame();
    }

    private void registerListeners() {
        panel.addMouseWheelListener(listener);
        panel.addMouseMotionListener(listener);
        panel.addMouseListener(listener);

        frame.drawButton.addActionListener(listener);
        frame.clearButton.addActionListener(listener);

        frame.sizeChoice.addItemListener(listener);
        frame.shapeChoice.addItemListener(listener);

        frame.posXTextField.addMouseListener(listener);
        frame.posYTextField.addMouseListener(listener);
        frame.rotXTextField.addMouseListener(listener);
        frame.rotYTextField.addMouseListener(listener);
    }

    public static void main(String[] args) {
        Main obj;

        obj = new Main();

        obj.registerListeners();
    }
}
