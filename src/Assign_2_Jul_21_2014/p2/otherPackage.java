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
public class otherPackage {
    public static void main(String args[]) {
        Assign_2_Jul_21_2014.p1.Example obj;
        
        obj = new Assign_2_Jul_21_2014.p1.Example();
        
        System.out.println("Accessed in different package using object");
        System.out.println("n_pub =\t" + obj.n__pub);
    }
}