/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_2_Jul_21_2014.p2;

/**
 *
 * @author Arnav
 */
public class Example2 extends Assign_2_Jul_21_2014.p1.Example {
    public static void main(String args[]) {
        Example2 obj;
        
        obj = new Example2();
        
        System.out.println("Accessed in different package using inheritance");
        System.out.println("n_pro =\t" + obj.n_pro);
        System.out.println("n_pub =\t" + obj.n__pub);
    }
}