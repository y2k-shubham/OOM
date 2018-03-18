/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_7_Aug_25_2014;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author iiita
 */
abstract class Problem {

    int operand_1;
    int operand_2;
    String operator;

    abstract int getAnswer();

    abstract String getOperator();

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setOperand_1(int operand_1) {
        this.operand_1 = operand_1;
    }

    public void setOperand_2(int operand_2) {
        this.operand_2 = operand_2;
    }

    public int getOperand_1() {
        return operand_1;
    }

    public int getOperand_2() {
        return operand_2;
    }

}

class Addition extends Problem {

    @Override
    String getOperator() {
        //hrow new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return operator;
    }

    @Override
    int getAnswer() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (operand_1 + operand_2);
    }

}

class Subtraction extends Problem {

    @Override
    String getOperator() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return operator;
    }

    @Override
    int getAnswer() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (operand_1 - operand_2);
    }
    
}

public class Assign_7_Q2 {
    static int numberOfCorrectAnswers;
    static int numberOfIncorrectAnswers;
    static int points;
    
    public static void main(String[] args) {
        final int numberOfProblems = 5;
        int i;
        Problem pro[];
        Scanner scn;
        
        scn = new Scanner(System.in);
        pro = new Problem[numberOfProblems];
        
        for (i = 0; i < numberOfProblems; i++) {
            pro[i] = createRandomProblem();
            displayProblem(pro[i]);
            
            System.out.print("Your answer:\t");
            evaluate(pro[i], scn.nextInt());
        }
        
        System.out.println("\n==================\n");
        System.out.println("Your result is:-");
        System.out.println("Total number of questions:\t" + numberOfProblems);
        System.out.println("Number of correct answers:\t" + numberOfCorrectAnswers);
        System.out.println("Number of incorrect answers:\t" + numberOfIncorrectAnswers);
        System.out.println("Your total points:\t\t" + points);
    }
    
    static Problem createRandomProblem() {
        Problem pro;
        int operator;
        Random ran;
        int operand_1;
        int operand_2;
        final int max = 500;
        
        ran = new Random();
        operator = ran.nextInt(2);
        
        operand_1 = ran.nextInt(max);
        operand_2 = (operator == 1) ? (ran.nextInt(operand_1)) : (ran.nextInt(max));
        
        if (operator == 0) {
            pro = new Addition();
            pro.setOperator("+");
        } else {
            pro = new Subtraction();
            pro.setOperator("-");
        }
        
        pro.setOperand_1(operand_1);
        pro.setOperand_2(operand_2);
        
        return pro;
    }
    
    static void displayProblem(Problem pro) {
        System.out.println();
        System.out.print(pro.getOperand_1());
        System.out.print(" ");
        System.out.print(pro.getOperator());
        System.out.print(" ");
        System.out.print(pro.getOperand_2());
        System.out.println(" = ?");
    }
    
    static void evaluate(Problem pro, int answer) {
        if (answer == pro.getAnswer()) {
            ++numberOfCorrectAnswers;
            points += 2;
        } else {
            ++numberOfIncorrectAnswers;
            --points;
        }
    }
}