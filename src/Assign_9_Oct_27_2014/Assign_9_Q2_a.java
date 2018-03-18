/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_9_Oct_27_2014;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Arnav
 */

public class Assign_9_Q2_a extends JFrame {
    private final Choice choice;
    private final JCheckBox cb_foreground;
    private final JCheckBox cb_background;
    private final JButton jb_ok;
    private final JButton jb_cancel;
    private final int dim_X;
    private final int dim_Y;
    private final int scrSize_X;
    private final int scrSize_Y;

    public Assign_9_Q2_a() throws HeadlessException {
        super();
        
        dim_X = 500;
        dim_Y = 200;
        scrSize_X = 1366;
        scrSize_Y = 786;
        
        this.choice = new Choice();
        this.cb_foreground = (new JCheckBox("Background"));
        this.cb_background = new JCheckBox("Foreground");
        this.jb_ok = new JButton("OK");
        this.jb_cancel = new JButton("Cancel");
    }
    
    private void setSize(Assign_9_Q2_a obj, JPanel jp_1, JPanel jp_2) {
        obj.setSize(new Dimension(dim_X, dim_Y));
        obj.setLocation(((scrSize_X - dim_X) / 2), ((scrSize_Y - dim_Y) / 2));
        
        jp_1.setSize(dim_X, (dim_Y / 3));
        jp_2.setSize(dim_X, (dim_Y / 3));
        
        choice.setSize(dim_X, (dim_Y / 3));
    }
    
    private void setLayout(Assign_9_Q2_a obj, JPanel jp_1, JPanel jp_2) {
        obj.setLayout(new BorderLayout(20, 30));
        obj.setTitle("ColorSelect");
        jp_1.setAlignmentX(CENTER_ALIGNMENT);
        jp_2.setAlignmentX(CENTER_ALIGNMENT);
    }
    
    private void setFontSize(JPanel jp_1, JPanel jp_2) {
        /*
        this.setFont(new Font("Courier", NORMAL, (dim_Y / 3)));
        jp_1.setFont(new Font("Courier", NORMAL, (dim_Y / 3)));
        jp_2.setFont(new Font("Courier", NORMAL, (dim_Y / 3)));
        */
        int dim_Y = 45;
        
        choice.setFont(new Font("Calibri", NORMAL, (dim_Y / 3)));
        cb_background.setFont(new Font("Calibri", NORMAL, (dim_Y / 3)));
        cb_foreground.setFont(new Font("Calibri", NORMAL, (dim_Y / 3)));
        jb_ok.setFont(new Font("Calibri", NORMAL, (dim_Y / 3)));
        jb_cancel.setFont(new Font("Calibri", NORMAL, (dim_Y / 3)));
    }
    
    private void createChoiceList() {
        choice.add("Red");
        choice.add("Orange");
        choice.add("Yellow");
        choice.add("Green");
        choice.add("Blue");
        choice.add("Indigo");
        choice.add("Violet");
        
        choice.setFocusable(false);
    }
    
    private void removeFocus() {
        choice.setFocusable(false);
        cb_foreground.setFocusable(false);
        cb_background.setFocusable(false);
        jb_ok.setFocusable(false);
        jb_cancel.setFocusable(false);
    }
    
    private void addComponents(Assign_9_Q2_a obj, JPanel jp_1, JPanel jp_2) {
        jp_1.add(cb_background);
        jp_1.add(cb_foreground);
        
        jp_2.add(jb_ok);
        jp_2.add(jb_cancel);
        
        (obj.getContentPane()).add(choice, BorderLayout.NORTH);
        (obj.getContentPane()).add(jp_1, BorderLayout.CENTER);
        obj.add(jp_2, BorderLayout.SOUTH);
    }
    
    private void makeVisible(Assign_9_Q2_a obj) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        Assign_9_Q2_a obj;
        JPanel jp_1;
        JPanel jp_2;
        
        obj = new Assign_9_Q2_a();
        jp_1 = new JPanel();
        jp_2 = new JPanel();
        
        obj.createChoiceList();
        obj.setSize(obj, jp_1, jp_2);
        obj.setFontSize(jp_1, jp_2);
        obj.setLayout(obj, jp_1, jp_2);
        obj.addComponents(obj, jp_1, jp_2);
        obj.removeFocus();
        obj.makeVisible(obj);
    }
}
