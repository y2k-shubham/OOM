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
class Date {

    int years;
    int months;
    int days;

    public Date() {
        years = 2009;
        months = 1;
        days = 1;
    }

    public Date(int days, int months, int years) {
      //  super();

        setYears(years);
        setMonths(months);
        setDays(days);
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setMonths(int months) {
        if (months > 12) {
            months %= 12;
            months = (months == 0) ? 1 : months;
        }
        this.months = months;
    }

    public void setDays(int days) {
        if (((months == 1) || (months == 3) || (months == 5) || (months == 7) || (months == 8) || (months == 10) || (months == 12)) && (days > 31)) {
            days %= 31;
            //System.out.println("1st Condition");
        } else if (((months == 4) || (months == 6) || (months == 9) || (months == 11)) && (days > 30)) {
            days %= 30;
            //System.out.println("2nd Condition");
        } else if ((months == 2) && ((getYears() % 4) == 0) && (days > 29)) {
            days %= 29;
            //System.out.println("3rd Condition");
        } else if ((days > 28) && (months == 2) && ((getYears() % 4) != 0)) {
            //System.out.println("4th Condition");
            days %= 28;
        }
        days = (days == 0) ? 1 : days;
        this.days = days;
    }

    public int getYears() {
        return years;
    }

    public int getMonths() {
        return months;
    }

    public int getDays() {
        return days;
    }

    public void nextDay() {
        int daysCopy;
        int monthsCopy;
        int yearsCopy;

        daysCopy = getDays();
        monthsCopy = getMonths();
        yearsCopy = getYears();

        daysCopy = (daysCopy + 1);
        if (((monthsCopy == 1) || (monthsCopy == 3) || (monthsCopy == 5) || (monthsCopy == 7) || (monthsCopy == 8) || (monthsCopy == 10) || (monthsCopy == 12)) && (daysCopy > 31)) {
            daysCopy %= 31;
        } else if (((monthsCopy == 4) || (monthsCopy == 6) || (monthsCopy == 9) || (monthsCopy == 11)) && (daysCopy > 30)) {
            daysCopy %= 30;
        } else if (((getYears() % 4) == 0) && (monthsCopy == 2) && (daysCopy > 29)) {
            daysCopy %= 29;
        } else if (((getYears() % 4) != 0) && (monthsCopy == 2) && (daysCopy > 28)) {
            daysCopy %= 28;
        }
        daysCopy = (daysCopy == 0) ? 1 : daysCopy;

        monthsCopy = (monthsCopy + 1) % 12;
        monthsCopy = (monthsCopy == 0) ? 12 : monthsCopy;

        yearsCopy++;

        setDays(daysCopy);

        if (getDays() == 1) {
            setMonths(monthsCopy);

            if (getMonths() == 1) {
                setYears(yearsCopy);
            }
        }
    }
}

public class Assign_7_Q3_b {

    public static void main(String args[]) {
        Date dat_1;
        //Date dat_2;
        Assign_7_Q3_b obj;

        dat_1 = new Date();
        //dat_2 = new Date(31, 12, 2009);
        obj = new Assign_7_Q3_b();

        System.out.println("Enter values for 1st Date object:-");
        obj.input(dat_1);

        System.out.println("\n=========\n\nBefore Incrementing:-\n");

        System.out.println("1st Date object");
        obj.output(dat_1);

        //System.out.println("2nd Date object");
        //obj.output(dat_2);

        dat_1.nextDay();
        //dat_2.nextDay();

        System.out.println("=========\n\nAfter Incrementing:-\n");

        System.out.println("1st Date object");
        obj.output(dat_1);

        //System.out.println("2nd Date object");
        //obj.output(dat_2);
    }

    public void output(Date dat) {
        if (dat.getDays() < 10) {
            System.out.print("0");
        }
        System.out.print(dat.getDays());

        System.out.print(" / ");

        if (dat.getMonths() < 10) {
            System.out.print("0");
        }
        System.out.print(dat.getMonths());

        System.out.print(" / ");

        System.out.print(dat.getYears());

        System.out.println("\n");
    }

    public void input(Date dat) {
        Scanner in;
        int days;
        int months;
        int years;

        in = new Scanner(System.in);

        System.out.print("Days:\t");
        days = in.nextInt();

        System.out.print("Months:\t");
        months = in.nextInt();

        System.out.print("Years:\t");
        years = in.nextInt();
        
        dat.setYears(years);
        dat.setMonths(months);
        dat.setDays(days);
    }
}
