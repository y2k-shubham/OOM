/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_3_Jul_28_2014;

import java.util.Scanner;
import java.io.PrintStream;

/**
 *
 * @author Arnav
 */
class Manager_Q1 extends Employee_Q1 {

    float Basic_pay;

    public Manager_Q1(float Basic_pay, String Emp_code, String Emp_name, String Address, String Ph_no) {
        super(Emp_code, Emp_name, Address, Ph_no);
        this.Basic_pay = Basic_pay;
    }

    float salary(float Basic_pay) {
        return ((Basic_pay * DA / 100) + (Basic_pay * HRA / 100));
    }

    public static void main(String args[]) {
        String Emp_code;
        String Emp_name;
        String Address;
        String Ph_no;
        float Basic_pay;
        Scanner in;
        PrintStream ps;
        Manager_Q1 obj;

        ps = System.out;
        in = new Scanner(System.in);

        ps.println("Enter the details of the Manager:-");

        ps.print("Emp_code:\t");
        Emp_code = in.nextLine();

        ps.print("Emp_name:\t");
        Emp_name = in.nextLine();

        ps.print("Address:\t");
        Address = in.nextLine();

        ps.print("Ph_no:\t\t");
        Ph_no = in.nextLine();

        ps.print("Basic_pay:\t");
        Basic_pay = in.nextFloat();

        obj = new Manager_Q1(Basic_pay, Emp_code, Emp_name, Address, Ph_no);

        ps.println("\nThe details of the Manager are:-");
        ps.println("Emp_code:\t" + obj.Emp_code);
        ps.println("Emp_name:\t" + obj.Emp_name);
        ps.println("Address:\t" + obj.Address);
        ps.println("Ph_no:\t\t" + obj.Ph_no);
        ps.println("DA:\t\t" + obj.DA + "%");
        ps.println("HRA:\t\t" + obj.HRA + "%");
        ps.println("Basic_pay:\t" + obj.Basic_pay);
        ps.println("Salary:\t\t" + obj.salary(Basic_pay));
    }
}
