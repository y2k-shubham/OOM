/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_7_Aug_25_2014;

import java.util.Scanner;

/**
 *
 * @author Arnav
 */
class Time {

    int hours;
    int minutes;
    int seconds;

    public Time() {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }

    public Time(int hours, int minutes, int seconds) {
//        super();
        
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours) {
        hours %= 24;
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        minutes %= 60;
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        seconds %= 60;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void tick() {
        int secondsCopy;
        int minutesCopy;
        int hoursCopy;

        secondsCopy = getSeconds();
        minutesCopy = getMinutes();
        hoursCopy = getHours();

        secondsCopy = (secondsCopy + 1) % 60;
        minutesCopy = (minutesCopy + 1) % 60;
        hoursCopy = (hoursCopy + 1) % 24;

        setSeconds(secondsCopy);

        if (getSeconds() == 0) {
            setMinutes(minutesCopy);

            if (getMinutes() == 0) {
                setHours(hoursCopy);
            }
        }
    }
}

public class Assign_7_Q3_a {

    public static void main(String args[]) {
        Time tim_1;
        Time tim_2;
        Assign_7_Q3_a obj;

        tim_1 = new Time();
  //      tim_2 = new Time(23, 59, 59);
        obj = new Assign_7_Q3_a();
        
        System.out.println("Enter values for 1st Time object:-");
        obj.input(tim_1);
        
        System.out.println("\n=========\n\nBefore Ticking:-\n");
        
        System.out.println("1st Time object");
        obj.output(tim_1);
        
      //  System.out.println("2nd Time object");
    //    obj.output(tim_2);
        
        tim_1.tick();
        //tim_2.tick();
        
        System.out.println("=========\n\nAfter Ticking:-\n");
        
        System.out.println("1st Time object");
        obj.output(tim_1);
        
        //System.out.println("2nd Time object");
        //obj.output(tim_2);
    }
    
    public void output(Time tim) {
        if (tim.getHours() < 10) {
            System.out.print("0");
        }
        System.out.print(tim.getHours());
        
        System.out.print(" : ");
        
        if (tim.getMinutes()< 10) {
            System.out.print("0");
        }
        System.out.print(tim.getMinutes());
        
        System.out.print(" : ");
        
        if (tim.getSeconds()< 10) {
            System.out.print("0");
        }
        System.out.print(tim.getSeconds());
        
        System.out.println("\n");
    }
    
    public void input(Time tim) {
        Scanner in;
        
        in = new Scanner(System.in);
        
        System.out.print("Hours:\t\t");
        tim.setHours(in.nextInt());
        
        System.out.print("Minutes:\t");
        tim.setMinutes(in.nextInt());
        
        System.out.print("Seconds:\t");
        tim.setSeconds(in.nextInt());
    }
}
