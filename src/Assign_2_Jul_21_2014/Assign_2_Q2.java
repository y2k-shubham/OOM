/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_2_Jul_21_2014;
import java.util.Scanner;
/**
 *
 * @author Arnav
 */
public class Assign_2_Q2 {
    public static void main(String args[]) {
        int lightspeed;
        long days;
        long seconds;
        long Distance;
        Scanner in;
        
        in = new Scanner(System.in);
        lightspeed = 671000000;
        
        System.out.print("Enter number of days:\t");
        days = in.nextLong();
        
        seconds = days * 24 * 60 * 60;
        Distance = lightspeed * seconds;
        
        System.out.println("The distance travelled by light is (miles):\t" + Distance );
    }
}
