/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_7_Aug_25_2014;

/**
 *
 * @author Arnav
 */
class DateAndTime {

    Date date;
    Time time;

    public DateAndTime() {
        date = new Date();
        time = new Time();
    }

    public void setDate(int days, int months, int years) {
        date.setYears(years);
        date.setMonths(months);
        date.setDays(days);
    }

    public void setTime(int hours, int minutes, int seconds) {
        time.setHours(hours);
        time.setMinutes(minutes);
        time.setSeconds(seconds);
    }
    
    public void tick() {
        int hoursCopy;
        
        hoursCopy = time.getHours();
        
        time.tick();
        
        if ((hoursCopy != time.getHours()) && (time.getHours() == 0)) {
            date.nextDay();
        }
    }
    
    public static void main(String args[]) {
        DateAndTime dat;
        Assign_7_Q3_a obj_1;
       // Assign_7_Q3_b obj_2;
        
        dat = new DateAndTime();
        obj_1 = new Assign_7_Q3_a();
       // obj_2 = new Assign_7_Q3_b();
        
        dat.setDate(20, 2, 2013);
        dat.setTime(23, 59, 59);
        
        System.out.println("\n=========\n\nBefore ticking:-");
        obj_1.output(dat.time);
      //  obj_2.output(dat.date);
        
        dat.tick();
        
        System.out.println("\n=========\n\nAfter ticking:-");
        obj_1.output(dat.time);
     //   obj_2.output(dat.date);
    }
}
