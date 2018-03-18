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
class Restaraunt {

    private final float priceCoke;
    private final float priceFries;
    private final float priceBurger;
    private final float taxRate;
    byte numCokes;
    byte numFries;
    byte numBurgers;

    public Restaraunt(float priceCoke, float priceFries, float priceBurger, float taxRate) {
        this.priceCoke = priceCoke;
        this.priceFries = priceFries;
        this.priceBurger = priceBurger;
        this.taxRate = taxRate;
    }

    void greet() {
        System.out.println("Welcome to Mithaas Restaraunt");
    }

    void statePrices() {
        System.out.println("The prices are:-");
        System.out.println("Coke:\t" + this.priceCoke);
        System.out.println("Fries:\t" + this.priceFries);
        System.out.println("Burger:\t" + this.priceBurger);
    }

    void setCoke(byte numCokes) {
        this.numCokes = numCokes;
    }

    void setFries(byte numFries) {
        this.numFries = numFries;
    }

    void setBurger(byte numBurgers) {
        this.numBurgers = numBurgers;
    }

    float calculateTotalPrice() {
        return (((numBurgers * priceBurger) + (numFries * priceFries) + (numCokes * priceCoke)) * (100 + taxRate) / 100);
    }
    
    void announceTotalPrice() {
        System.out.println("\nTotal price is:\t" + calculateTotalPrice());
    }
    
    public static void main(String args[]) {
        Restaraunt res;
        
        res = new Restaraunt(45.00f, 25.00f, 35.00f, 7.5f);
        
        res.greet();
        res.statePrices();
        
        res.setCoke((byte) 3);
        res.setFries((byte) 2);
        res.setBurger((byte) 4);
        
        res.announceTotalPrice();
    }
}
