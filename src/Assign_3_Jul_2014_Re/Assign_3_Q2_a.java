/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_3_Jul_2014_Re;

/**
 *
 * @author Arnav
 */
class Person_Q2_a {
    String name;
    
    void SetData(String name) {
        this.name = name;
    }
    
    void GetData() {
        System.out.println("Name:\t" + this.name);
    }
}

class Employee_Q2_a extends Person_Q2_a {
    byte age;
    
    void SetData(byte age) {
        this.age = age;
    }
    
    void GetData() {
        super.GetData();
        System.out.println("Age:\t" + this.age);
    }
}
