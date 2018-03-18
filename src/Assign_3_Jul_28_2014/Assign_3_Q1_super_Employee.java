/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_3_Jul_28_2014;

/**
 *
 * @author Arnav
 */
class Employee_Q1 {

    String Emp_code;
    String Emp_name;
    String Address;
    String Ph_no;
    final byte DA = 10;
    final byte HRA = 20;

    public Employee_Q1(String Emp_code, String Emp_name, String Address, String Ph_no) {
        this.Emp_code = Emp_code;
        this.Emp_name = Emp_name;
        this.Address = Address;
        this.Ph_no = Ph_no;
    }

    float salary(float Basic_pay) {
        return (Basic_pay + (Basic_pay * DA / 100) + (Basic_pay * HRA / 100));
    }
}
