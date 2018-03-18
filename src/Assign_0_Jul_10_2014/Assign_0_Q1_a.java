/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_0_Jul_10_2014;
import java.util.Scanner;
import java.io.PrintStream;

/**
 *
 * @author Arnav
 */

class Room {
    short roomno;
    String roomtype;
    float roomarea;
    boolean ACmachine;
    
    void setdata() {
        Scanner in;
        PrintStream ps;
        
        in = new Scanner(System.in);
        ps = System.out;
        
        ps.print("Room no:\t");
        roomno = in.nextShort();
        in.nextLine();
        
        ps.print("Room type:\t");
        roomtype = in.nextLine();
        
        ps.print("Room area:\t");
        roomarea = in.nextFloat();
        in.nextLine();
        
        ps.print("ACmachine:\t");
        ACmachine = ((((in.nextLine()).toLowerCase()).charAt(0)) == 'y') ? true : false;
    }
    
    void displaydata() {
        PrintStream ps;
        
        ps = System.out;
        
        ps.println("Room no:\t" + roomno);
        ps.println("Room type:\t" + roomtype);
        ps.println("Room area:\t" + roomarea);
        ps.println("ACMachine:\t" + ((ACmachine == true) ? ("yes") : ("no")));
    }
    
    public static void main(String args[]) {
        Room obj_1;
        Room obj_2;
        
        obj_1 = new Room();
        obj_2 = new Room();
        
        System.out.println("Enter the details of 1st room:-");
        obj_1.setdata();
        
        System.out.println("\nEnter the details of 2nd room:-");
        obj_2.setdata();
        
        System.out.println("\nThe details of 1st room are:-");
        obj_1.displaydata();
        
        System.out.println("\nThe details of 2nd room are:-");
        obj_2.displaydata();
    }
}
