/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_9_Oct_27_2014;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javafx.geometry.Orientation;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/**
 *
 * @author Arnav
 */
public class Assign_9_Q2_b {

    private final JFrame jFrame;
    private final JCheckBox jcb_1;
    private final JCheckBox jcb_2;
    private final JCheckBox jcb_3;
    private final ButtonGroup bg;
    private final JRadioButton jrb_1;
    private final JRadioButton jrb_2;
    private final JRadioButton jrb_3;
    private final JCheckBox jcb_4;
    private final JTextArea jta_1;
    private final JTextArea jta_2;
    private final JTextArea jta_3;
    private final Choice ch;
    private final JLabel jl_1;
    private final JLabel jl_2;
    private final JButton jb_1;
    private final JButton jb_2;
    private final JButton jb_3;
    private final JButton jb_4;
    private final int dimX;
    private final int dimY;

    public Assign_9_Q2_b() {
        this.jFrame = new JFrame("Printer");
        this.jcb_1 = new JCheckBox("Image");
        this.jcb_2 = new JCheckBox("Text");
        this.jcb_3 = new JCheckBox("Code");
        this.bg = new ButtonGroup();
        this.jrb_1 = new JRadioButton("Selection");
        this.jrb_2 = new JRadioButton("All");
        this.jrb_3 = new JRadioButton("Applet");
        this.jcb_4 = new JCheckBox("Print to File");
        this.ch = new Choice();
        this.jl_2 = new JLabel("Print Quality:");
        this.jl_1 = new JLabel("Printer: MyPrinter");
        this.jb_1 = new JButton("OK");
        this.jb_2 = new JButton("Cancel");
        this.jb_3 = new JButton("Setup..");
        this.jb_4 = new JButton("Help");
        jta_1 = new JTextArea(3, 3);
        jta_2 = new JTextArea(3, 2);
        jta_3 = new JTextArea(3, 3);

        jta_1.setEditable(false);
        jta_2.setEditable(false);
        jta_3.setEditable(false);

        dimX = 375;
        dimY = 150;

        bg.add(jrb_1);
        bg.add(jrb_2);
        bg.add(jrb_3);

        ch.add("High");
        ch.add("Normal");
        ch.add("Low");
        ch.add("Greyscale");
        ch.add("B&W");
    }

    private JPanel createCenterPanel() {
        JPanel jPanel;

        jPanel = new JPanel(new FlowLayout());
        jPanel.setSize(dimX, dimY);

        jPanel.add(jta_1);
        jPanel.add(wrapComponents((new Component[]{jcb_1, jcb_2, jcb_3}), Orientation.VERTICAL));
        jPanel.add(jta_2);
        jPanel.add(wrapComponents((new Component[]{jrb_1, jrb_2, jrb_3}), Orientation.VERTICAL));
        jPanel.add(jta_3);

        return jPanel;
    }

    private JPanel wrapComponents(Component[] components, Orientation orientation) {
        int i;
        JPanel jp;

        if (orientation.equals(Orientation.VERTICAL)) {
            jp = new JPanel(new GridLayout(components.length, 1));
        } else {
            jp = new JPanel(new GridLayout(1, components.length));
        }

        for (i = 0; i < components.length; i++) {
            jp.add(components[i]);
        }

        return jp;
    }

    public static void main(String[] args) {
        Assign_9_Q2_b obj;
        JFrame jFrame;

        obj = new Assign_9_Q2_b();
        jFrame = new JFrame("Printer");

        jFrame.setLayout(new BorderLayout(0, 0));
        jFrame.setBounds(((1366 - obj.dimX) / 2), ((786 - obj.dimY) / 2), obj.dimX, obj.dimY);

        jFrame.add(obj.wrapComponents((new Component[]{obj.jb_1, obj.jb_2, obj.jb_3, obj.jb_4}), Orientation.VERTICAL), BorderLayout.EAST);
        jFrame.add(obj.jl_1, BorderLayout.NORTH);
        jFrame.add(obj.createCenterPanel(), BorderLayout.CENTER);
        jFrame.add(obj.wrapComponents((new Component[]{obj.jl_2, obj.ch, obj.jcb_4}), Orientation.HORIZONTAL), BorderLayout.SOUTH);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
