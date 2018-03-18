/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_6_Aug_19_2014;

/**
 *
 * @author Arnav
 */
class Animal {

    String sound;
    String type;

    public Animal(String sound, String type) {
        this.sound = sound;
        this.type = type;
    }

    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }
}

interface Vegetarian {

}

interface Object {

    String getBehaviour();

    String getThingType();
}

class Deer extends Animal implements Object {

    public Deer() {
        super("Moo", "Deer");
    }

    @Override
    public String getBehaviour() {
        return "Active";
    }

    @Override
    public String getThingType() {
        return getType();
    }
}

class Cat extends Animal implements Object {

    public Cat() {
        super("Mew", "Cat");
    }

    @Override
    public String getBehaviour() {
        return "Timid";
    }

    @Override
    public String getThingType() {
        return getType();
    }
}

class Chick extends Animal implements Object {

    public Chick() {
        super("Cluck", "Chick");
    }

    @Override
    public String getBehaviour() {
        return "Calm";
    }

    @Override
    public String getThingType() {
        return getType();
    }
}

class Farm extends Animal implements Object, Vegetarian {
    public static void main(String args[]) {
        Deer deer;
        Cat cat;
        Chick chick;
        
        deer = new Deer();
        cat = new Cat();
        chick = new Chick();
        
        System.out.println("1st Animal:-");
        System.out.println("Type:\t\t" + deer.getThingType());
        System.out.println("Sound:\t\t" + deer.getSound());
        System.out.println("Behaviour:\t" + deer.getBehaviour());
        
        System.out.println("\n2nd Animal:-");
        System.out.println("Type:\t\t" + cat.getThingType());
        System.out.println("Sound:\t\t" + cat.getSound());
        System.out.println("Behaviour:\t" + cat.getBehaviour());
        
        System.out.println("\n3rd Animal:-");
        System.out.println("Type:\t\t" + chick.getThingType());
        System.out.println("Sound:\t\t" + chick.getSound());
        System.out.println("Behaviour:\t" + chick.getBehaviour());
    }

    public Farm() {
        super(null, null);
    }
    
    @Override
    public String getBehaviour() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getThingType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}