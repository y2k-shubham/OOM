/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_4_Aug_4_2014;

/**
 *
 * @author Arnav
 */
public class Assign_4_Q4_Customer extends Assign_4_Q4_Person {
    long phoneNo;

    public Assign_4_Q4_Customer(long phoneNo, String name) {
        super(name);
        this.phoneNo = phoneNo;
    }
}
