/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_1_Jul_15_2014.user.own.pack;

/**
 *
 * @author Arnav
 */
public class Distance {
    public int Feet;
    public int Inches;
    
    public Distance add(Distance d1, Distance d2) {
        Distance d3;
        
        d3 = new Distance();
        
        d3.Inches = d1.Inches + d2.Inches;
        d3.Feet = d1.Feet + d2.Feet + (d3.Inches / 12);
        d3.Inches %= 12;
        
        return d3;
    }
}