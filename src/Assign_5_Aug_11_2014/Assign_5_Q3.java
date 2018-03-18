package Assign_5_Aug_11_2014;

abstract class Employee {

    String name;
    int emp_no;
    float base;

    Employee(String name, int emp_no, float base) {
        this.name = name;
        this.emp_no = emp_no;
        this.base = base;
    }

    abstract void money();
}

class HourlyEmployee extends Employee {

    float hours;

    public HourlyEmployee(float hours, String name, int emp_no, float base) {
        super(name, emp_no, base);
        this.hours = hours;
    }

    @Override
    void money() {
        System.out.println(name + " --- money for  " + hours + " hours :  " + hours * 100);
    }
}

class CommissionEmployee extends Employee {

    float commission;

    public CommissionEmployee(float commission, String name, int emp_no, float base) {
        super(name, emp_no, base);
        this.commission = commission;
    }

    @Override
    void money() {
        System.out.println(name + " --- money for  10 % commission on base salary : " + commission * base / 100);

    }
}

class SalariedEmployee extends Employee {

    public SalariedEmployee(String name, int emp_no, float base) {
        super(name, emp_no, base);
    }

    @Override
    void money() {
        System.out.println(name + " --- money for salaried employee : " + base);

    }
}

class BasePlusCommissionEmployee extends CommissionEmployee {

    public BasePlusCommissionEmployee(float commission, String name, int emp_no, float base) {
        super(commission, name, emp_no, base);
    }

    @Override
    void money() {
        System.out.println(name + " --- money for BasePlusCommissinEmloyee : " + (base + base * commission / 100));
    }
}

public class Assign_5_Q3 {

    public static void main(String args[]) {

        Employee e1 = new HourlyEmployee(3, "aaa", 123, 10000);
        HourlyEmployee h1 = (HourlyEmployee) e1;         // EXAMPLE OF DOWNCASTING
        h1.money();
        
        Employee e2 = new SalariedEmployee("bbb", 124, 10000);
        SalariedEmployee s1 = (SalariedEmployee) e2;         // EXAMPLE OF DOWNCASTING
        s1.money();

        Employee e3 = new CommissionEmployee(10, "ccc", 125, 10000);
        CommissionEmployee c1 = (CommissionEmployee) e3;         // EXAMPLE OF DOWNCASTING
        c1.money();

        Employee e4 = new BasePlusCommissionEmployee(5, "ddd", 126, 10000);
        BasePlusCommissionEmployee b1 = (BasePlusCommissionEmployee) e4;         // EXAMPLE OF DOWNCASTING
        b1.money();

        // EXAMPLE OF instanceof operator
        System.out.println("\nb1 is instanceof CommissionEmployee : " + (b1 instanceof CommissionEmployee));
        System.out.println("b1 is instanceof BasePlusCommissionEmployee : " + (b1 instanceof BasePlusCommissionEmployee));
        System.out.println("b1 is instanceof Employee : " + (b1 instanceof Employee));
        
        System.out.println("\ne1 is instanceof HourlyEmployee : " + (e1 instanceof HourlyEmployee));
        System.out.println("e1 is instanceof Employee : " + (e1 instanceof Employee));
        System.out.println("e1 is instanceof SalariedEmployee : " + (e1 instanceof SalariedEmployee));

        // EXAMPLE OF instanceof operator
    }
}
