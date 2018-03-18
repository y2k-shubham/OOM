/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_3_Jul_2014_Re;
import Assign_3_Jul_28_2014.com.address.Assign_3_Q4_Address;
import Assign_3_Jul_28_2014.com.person.Assign_3_Q4_Person;
/**
 *
 * @author Arnav
 */
class Employee_Q4_b extends Assign_3_Q4_Person {
    Assign_3_Q4_Address add;
    float salary;
    String designation;

    public Employee_Q4_b(float salary, String designation, String name, String bloodGroup, String dateOfBirth) {
        super(name, bloodGroup, dateOfBirth);
        this.salary = salary;
        this.designation = designation;
    }
    
    public static void main(String args[]) {
        Employee_Q4_b emp;
        
        emp = new Employee_Q4_b(10000, "System Analyst", "V K Chaurasia", "B+", "16-Jul-1977");
        emp.add = new Assign_3_Q4_Address("K-Block, Arya Nagar", "Kanpur", 208002);
    }
}
