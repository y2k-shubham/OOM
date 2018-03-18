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

class Array_Sum {
    public static void main(String args[]) {
        int arr[];
        Array_Sum obj;
        
        obj = new Array_Sum();
        arr = new int[10];
        
        obj.input(arr);
        obj.output(arr);
    }
    
    int sum_of_array(int arr[], int start, int end) {
        int i;
        int sum;
        
        sum = 0;
        for (i = start; i < end; i++) {
            sum += arr[i];
        }
        
        return sum;
    }
    
    void input(int arr[]) {
        int i;
        Scanner in;
        
        in = new Scanner(System.in);
        
        System.out.println("Enter 10 integers into arrray:-");
        for (i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }
    }
    
    void output(int arr[]) {
        PrintStream ps;
        
        ps = System.out;
        
        ps.println("\nThe sum of all elements is: " + sum_of_array(arr, 0, 10));
        ps.println("The sum of first five elements is: " + sum_of_array(arr, 0, 5));
        ps.println("The sum of last five elements is: " + sum_of_array(arr, 5, 10));
    }
}
