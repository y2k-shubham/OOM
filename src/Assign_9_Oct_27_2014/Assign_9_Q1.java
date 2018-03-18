/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_9_Oct_27_2014;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Arnav
 */
class Calculator extends JFrame {

    private final int dimX;
    private final int dimY;
    private final int screenSize_X;
    private final int screenSize_Y;
    private final JTextField jTextField;
    private final JButton jButton_dig_0;
    private final JButton jButton_dig_1;
    private final JButton jButton_dig_2;
    private final JButton jButton_dig_3;
    private final JButton jButton_dig_4;
    private final JButton jButton_dig_5;
    private final JButton jButton_dig_6;
    private final JButton jButton_dig_7;
    private final JButton jButton_dig_8;
    private final JButton jButton_dig_9;
    private final JButton jButton_op_plus;
    private final JButton jButton_op_minus;
    private final JButton jButton_op_multiply;
    private final JButton jButton_op_divide;
    private final JButton jButton_sym_decimal;
    private final JButton jButton_sym_equal;

    public Calculator(String title) throws HeadlessException {
	super(title);

	screenSize_X = 1366;
	screenSize_Y = 786;
	dimX = 400;
	dimY = 400;

	jTextField = new JTextField("0.0");
	jButton_dig_0 = new JButton("0");
	jButton_dig_1 = new JButton("1");
	jButton_dig_2 = new JButton("2");
	jButton_dig_3 = new JButton("3");
	jButton_dig_4 = new JButton("4");
	jButton_dig_5 = new JButton("5");
	jButton_dig_6 = new JButton("6");
	jButton_dig_7 = new JButton("7");
	jButton_dig_8 = new JButton("8");
	jButton_dig_9 = new JButton("9");
	jButton_op_plus = new JButton("+");
	jButton_op_minus = new JButton("-");
	jButton_op_multiply = new JButton("×");
	jButton_op_divide = new JButton("÷");
	jButton_sym_decimal = new JButton(".");
	jButton_sym_equal = new JButton("=");
    }

    private void setJButtonFont(JButton jButton) {
	jButton.setFont(new Font("Courier", Font.PLAIN, 30));
    }

    private void setSize(Calculator c, JPanel jPanel) {
	setJButtonFont(jButton_dig_0);
	setJButtonFont(jButton_dig_1);
	setJButtonFont(jButton_dig_2);
	setJButtonFont(jButton_dig_3);
	setJButtonFont(jButton_dig_4);
	setJButtonFont(jButton_dig_5);
	setJButtonFont(jButton_dig_6);
	setJButtonFont(jButton_dig_7);
	setJButtonFont(jButton_dig_8);
	setJButtonFont(jButton_dig_9);
	setJButtonFont(jButton_op_plus);
	setJButtonFont(jButton_op_minus);
	setJButtonFont(jButton_op_multiply);
	setJButtonFont(jButton_op_divide);
	setJButtonFont(jButton_sym_decimal);
	setJButtonFont(jButton_sym_equal);

	c.setBounds(((c.screenSize_X - c.dimX) / 2), ((c.screenSize_Y - c.dimY) / 2), c.dimX, c.dimY);
	jPanel.setSize(new Dimension(dimX, dimX));

	jTextField.setFont(new Font("Courier", Font.BOLD, 40));
	jTextField.setSize(dimX, 20);
    }

    private void setLayout(Calculator c, JPanel jPanel) {
	c.setLayout(new BorderLayout(0, 0));
	jPanel.setLayout(new GridLayout(4, 4, 20, 20));

	jTextField.setAlignmentY(LEFT_ALIGNMENT);
	jTextField.setAlignmentX(LEFT_ALIGNMENT);
    }

    private void addRow(JPanel jPanel, JButton jButton_1, JButton jButton_2, JButton jButton_3, JButton jButton_4) {
	jPanel.add(jButton_1);
	jPanel.add(jButton_2);
	jPanel.add(jButton_3);
	jPanel.add(jButton_4);
    }

    private void addComponents(Calculator c, JPanel jPanel) {
	addRow(jPanel, jButton_dig_7, jButton_dig_8, jButton_dig_9, jButton_op_divide);
	addRow(jPanel, jButton_dig_4, jButton_dig_5, jButton_dig_6, jButton_op_multiply);
	addRow(jPanel, jButton_dig_1, jButton_dig_2, jButton_dig_3, jButton_op_minus);
	addRow(jPanel, jButton_dig_0, jButton_sym_decimal, jButton_sym_equal, jButton_op_plus);

	c.add(jTextField, BorderLayout.NORTH);
	c.add(jPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
	Calculator c;
	JPanel jPanel;

	c = new Calculator("Calculator");
	jPanel = new JPanel(new GridLayout(4, 4));

	c.setSize(c, jPanel);
	c.setLayout(c, jPanel);
	c.addComponents(c, jPanel);
	c.showCalculator(c);
    }

    private void showCalculator(Calculator c) {
	c.setDefaultCloseOperation(EXIT_ON_CLOSE);
	c.setVisible(true);
    }
}
