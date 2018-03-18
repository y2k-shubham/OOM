/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_3_Jul_2014_Re;
import Assign_3_Jul_28_2014.com.person.Assign_3_Q4_Person;
import Assign_3_Jul_28_2014.com.address.Assign_3_Q4_Address;

/**
 *
 * @author Arnav
 */
class Employee_Q4 {
    Assign_3_Q4_Person per;
    Assign_3_Q4_Address add;
    float salary;
    String designation;
    
    public static void main(String args[]) {
        Employee_Q4 emp;
        
        emp = new Employee_Q4();
        emp.per = new Assign_3_Q4_Person("Person", "O+", "24-Jun-1977");
        emp.add = new Assign_3_Q4_Address("K-Block, Arya Nagar", "Kanpur", 208002);
    }
}
