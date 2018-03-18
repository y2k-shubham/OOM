/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assign_1_Jul_15_2014;

/**
 *
 * @author Arnav
 */

class CodeTimer {
   private long startTime;
   private long endTime;

    public CodeTimer() {
        startTime = System.currentTimeMillis();
    }
    
    long getStartTime() {
        return startTime;
    }
    
    long getEndTime() {
        return endTime;
    }
    
    void start() {
        startTime = System.currentTimeMillis();
    }
    
    void stop() {
        endTime = System.currentTimeMillis();
    }
    
    long getElapsedTime() {
        return (endTime - startTime);
    }
    
    public static void main(String args[]) {
        int i;
        CodeTimer obj;
        
        obj = new CodeTimer();
        
        obj.start();
        
        for (i = 1; i <= 1000000; i++) {
        }
        
        obj.stop();
        
        System.out.println("startTime:\t" + obj.getStartTime());
        System.out.println("endTime:\t" + obj.getEndTime());
        System.out.println("Elapsed Time:\t" + obj.getElapsedTime());
    }
}
