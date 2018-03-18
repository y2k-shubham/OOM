/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assign_4_Aug_4_2014;

import java.util.Random;

/**
 *
 * @author iiita
 */
class Powerball {

    byte whiteBall_1;
    byte whiteBall_2;
    byte whiteBall_3;
    byte whiteBall_4;
    byte whiteBall_5;
    byte redBall;

    void play() {
        Random rand;
        rand = new Random();

        whiteBall_1 = (byte) (1 + rand.nextInt(48));
        whiteBall_2 = (byte) (1 + rand.nextInt(48));
        whiteBall_3 = (byte) (1 + rand.nextInt(48));
        whiteBall_4 = (byte) (1 + rand.nextInt(48));
        whiteBall_5 = (byte) (1 + rand.nextInt(48));

        redBall = (byte) (1 + rand.nextInt(41));
    }

    void displayResults() {
        System.out.println("White Ball 1:\t" + whiteBall_1);
        System.out.println("White Ball 2:\t" + whiteBall_2);
        System.out.println("White Ball 3:\t" + whiteBall_3);
        System.out.println("White Ball 4:\t" + whiteBall_4);
        System.out.println("White Ball 5:\t" + whiteBall_5);

        System.out.println("Red   Ball  :\t" + redBall);
    }

}

class PlayLottery {
    public static void main(String args[]) {
        Powerball pow;
        
        pow = new Powerball();
        
        pow.play();
        pow.displayResults();
    }
}