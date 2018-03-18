/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_4_Aug_4_2014;

/**
 *
 * @author iiita
 */
class Money {
    float basicFeePerYear;
}

class Person {
    String address;

    public Person(String address) {
        this.address = address;
    }
}

class Patient extends Person {
    short patientNumber;
    String hospital;
    short year;
    float medicalFees;

    public Patient(short patientNumber, String address) {
        super(address);
        this.patientNumber = patientNumber;
    }
    
    void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    void setYear(short year) {
        this.year = year;
    }
    
    void setAddress(String address) {
        this.address = address;
    }
    
    String getHospital() {
        return this.hospital;
    }
    
    short getYear() {
        return this.year;
    }
    
    String getAddress() {
        return this.address;
    }
    
    float calculateFee(Money mon) {
        return ((mon.basicFeePerYear) * (2014 - getYear()));
    }
    
    public static void main(String args[]) {
        Money mon;
        Patient pat;
        
        mon = new Money();
        pat = new Patient((short) 420, null);
        mon.basicFeePerYear = 125000;
        
        pat.setAddress("Arya Nagar, Kanpur");
        pat.setHospital("Escorts");
        pat.setYear((short) 2012);
        
        pat.medicalFees = pat.calculateFee(mon);
        
        System.out.println("\nThe details of the patient are:-");
        System.out.println("Patient Number:\t\t" + pat.patientNumber);
        System.out.println("Hospital:\t\t" + pat.getHospital());
        System.out.println("Year of Joining:\t" + pat.getYear());
        System.out.println("Patient's Address:\t" + pat.address);
        System.out.println("Medical Fees:\t\t" + pat.medicalFees);
    }
}