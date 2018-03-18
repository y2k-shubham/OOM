/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_1_Jul_15_2014;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Arnav
 */

class Student {
    private String Rollno;
    private String name;
    private byte age;
    
    public String GetData(String id) {
        if (id.equals("Rollno")) {
            return (Rollno);
        } else if (id.equals("name")) {
            return (name);
        } else {
            return ("" + age);
        }
    }
    
    public void SetData() {
        Scanner in;
        PrintStream ps;
        
        in = new Scanner(System.in);
        ps = System.out;
        
        ps.println("Enter details of student:-");
        
        ps.print("Rollno:\t");
        Rollno = in.nextLine();
        
        ps.print("Name:\t");
        name = in.nextLine();
        
        ps.print("Age:\t");
        age = in.nextByte();
    }
    
    public static void main(String args[]) {
        Student obj_1;
        Student obj_2;
        PrintStream ps;
        
        obj_1 = new Student();
        obj_2 = new Student();
        ps = System.out;
        
        obj_2.SetData();
        
        obj_1.Rollno = "IIT2013XXX";
        obj_1.name = "NO_NAME";
        obj_1.age = (byte) (-1);
        
        ps.println("\nThe details of 1st student are:-\n(initialized during runtime)");
        obj_1.output();
        
        ps.println("\nThe details of 2nd student are:-\n(initialized by reading from console)");
        obj_2.output();
    }
    
    void output() {
        PrintStream ps;
        
        ps = System.out;
        
        ps.println(("Rollno:\t").concat(GetData("Rollno")));
        ps.println("Name:\t" + GetData("name"));
        ps.println("Age:\t" + GetData("age"));
    }
}