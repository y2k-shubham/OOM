/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_5_Aug_11_2014;

/**
 *
 * @author Arnav
 */
class Animal {

    void breathe(String animal) {
        System.out.println(animal + " breathes");
    }
}

interface Play {

    void playFetch();

    void playCatch();

    void playRun();

    void playWalk();
}

interface Swim {

    void playSwim();
}

class Dog extends Animal implements Play {

    public void playFetch() {
        System.out.println("Dog plays Fetch");
    }

    public void playCatch() {
        System.out.println("Dog plays Catch");
    }

    public void playRun() {
        System.out.println("Dog plays Run");
    }

    public void playWalk() {
        System.out.println("Dog plays Walk\n");
    }
}

class Deer extends Animal implements Play {

    public void playFetch() {
        System.out.println("Deer does not play Fetch");
    }

    public void playCatch() {
        System.out.println("Deer does not play Catch");
    }

    public void playRun() {
        System.out.println("Deer plays Run");
    }

    public void playWalk() {
        System.out.println("Deer plays Walk\n");
    }
}

class Fish extends Animal implements Swim {

    @Override
    public void playSwim() {
        System.out.println("Fish plays Swim");
    }
}

public class Assign_5_Q1 {
    Animal dog;
    Animal deer;
    Animal fish;

    public Assign_5_Q1() {
        dog = new Dog();
        deer = new Deer();
        fish = new Fish();
    }
    
    public static void main(String args[]) {
        Assign_5_Q1 as5;
        
        as5 = new Assign_5_Q1();
        
        as5.displayTraits(as5.dog);
        as5.displayTraits(as5.deer);
        as5.displayTraits(as5.fish);
    }
    
    void displayTraits(Animal anm) {
        switch (anm.getClass().toString()) {
            case "class Assign_5_Aug_11_2014.Dog":
                Dog dog = (Dog) anm;
                dog.breathe("Dog");
                dog.playCatch();
                dog.playFetch();
                dog.playRun();
                dog.playWalk();
                break;
                
            case "class Assign_5_Aug_11_2014.Deer":
                Deer deer = (Deer) anm;
                deer.breathe("Deer");
                deer.playCatch();
                deer.playFetch();
                deer.playRun();
                deer.playWalk();
                break;
                
            case "class Assign_5_Aug_11_2014.Fish":
                Fish fish = (Fish) anm;
                fish.breathe("Fish");
                fish.playSwim();
        }
    }
}