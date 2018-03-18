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

public class DerivedExample extends Example {
    public static void main(String args[]) {
        DerivedExample obj;
        
        obj = new DerivedExample();
        
        System.out.println("Accessed in the same package using inheritance");
        System.out.println("n =\t" + obj.n);
        System.out.println("n_pro =\t" + obj.n_pro);
        System.out.println("n_pub =\t" + obj.n__pub);
    }
}
