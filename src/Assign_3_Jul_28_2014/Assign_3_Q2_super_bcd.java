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
class Person_bcd {
    String name;

    public Person_bcd(String name) {
        this.name = name;
    }
    
    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("\nclass Person: finalize()");
    }
}