/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_2_Jul_21_2014.p1;

/**
 *
 * @author Arnav
 */
public class Same_Example {
    public static void main(String args[]) {
        Example obj;
        
        obj = new Example();
        
        System.out.println("Accessed in the same package using object");
        System.out.println("n =\t" + obj.n);
        System.out.println("n_pro =\t" + obj.n_pro);
        System.out.println("n_pub =\t" + obj.n__pub);
    }
}
