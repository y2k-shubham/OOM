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
public class Assign_4_Q4_VideoStore {

    public static void main(String args[]) {
        Assign_4_Q4_Candy candy;
        Assign_4_Q4_Popcorn popcorn;
        Assign_4_Q4_DVD dvd;
        Assign_4_Q4_VHS vhs;
        Assign_4_Q4_Customer customer;
        Assign_4_Q4_Employee employee;
        Assign_4_Q4_VideoStore vst;
        
        candy = new Assign_4_Q4_Candy(5);
        popcorn = new Assign_4_Q4_Popcorn(2);
        dvd = new Assign_4_Q4_DVD(659, "Jab We Met", true, null, -1);
        vhs = new Assign_4_Q4_VHS(732, "The Day After Tomorrow", false, "23-08-2014", 315755);
        customer = new Assign_4_Q4_Customer(315755, "Devang Sinha");
        employee = new Assign_4_Q4_Employee("Raghav Bhargava", 66519, 9200, 2, 0);
        
        
    }
}
