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
public class Assign_4_Q4_VHS extends Assign_4_Q4_Movies {
    final String type = "VHS";
    final float rate = 15;
    
    public Assign_4_Q4_VHS(long inventoryNum, String title, boolean available, String dueDate, long customerID) {
        super(inventoryNum, title, available, dueDate, customerID);
    }
}
