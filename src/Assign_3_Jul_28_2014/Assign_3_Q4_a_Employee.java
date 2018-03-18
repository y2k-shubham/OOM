/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_3_Jul_28_2014;

import Assign_3_Jul_28_2014.com.person.Assign_3_Q4_Person;
import Assign_3_Jul_28_2014.com.address.Assign_3_Q4_Address;
import java.util.Scanner;
import java.io.PrintStream;
/**
 *
 * @author Arnav
 */
class Employee_Q4_a {

    Assign_3_Q4_Person person;
    Assign_3_Q4_Address address;
    long phoneNo;
    float salary;

    public Employee_Q4_a(String name, String bloodGroup, String dateOfBirth, String address, String city, int pinCode, long phoneNo, float salary) {
        this.person = new Assign_3_Q4_Person(name, bloodGroup, dateOfBirth);
        this.address = new Assign_3_Q4_Address(address, city, pinCode);
        this.phoneNo = phoneNo;
        this.salary = salary;
    }

    public static void main(String args[]) {
        String name;
        String bloodGroup;
        String dateOfBirth;
        String address;
        String city;
        int pinCode;
        long phoneNo;
        float salary;
        Scanner in;
        PrintStream ps;
        Employee_Q4_a obj;
        
        in = new Scanner(System.in);
        ps = System.out;
        
        ps.println("Enter the details of the Employee:-");
        
        ps.print("Name:\t\t");
        name = in.nextLine();
        
        ps.print("Blood Group:\t");
        bloodGroup = in.nextLine();
        
        ps.print("Date Of Birth:\t");
        dateOfBirth = in.nextLine();
        
        ps.print("Address:\t");
        address = in.nextLine();
        
        ps.print("City:\t\t");
        city = in.nextLine();
        
        ps.print("Pin Code:\t");
        pinCode = in.nextInt();
        
        ps.print("Phone No:\t");
        phoneNo = in.nextLong();
        
        ps.print("Salary:\t\t");
        salary = in.nextFloat();
        
        obj = new Employee_Q4_a(name, bloodGroup, dateOfBirth, address, city, pinCode, phoneNo, salary);
        
        ps.println("\nThe details of the Employee are:-");
        ps.println("Name:\t\t" + obj.person.name);
        ps.println("Blood Group:\t" + obj.person.bloodGroup);
        ps.println("Date Of Birth:\t" + obj.person.dateOfBirth);
        ps.println("Address:\t" + obj.address.address);
        ps.println("City:\t\t" + obj.address.city);
        ps.println("Pin Code:\t" + obj.address.pinCode);
        ps.println("Phone No:\t" + obj.phoneNo);
        ps.println("Salary:\t\t" + obj.salary);
    }
}
