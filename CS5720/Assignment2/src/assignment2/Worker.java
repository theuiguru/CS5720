package assignment2;
import java.util.*;
import java.io.*;
import java.net.*;
/**
 * CS5720 Assignment 2
 * Assignment2.java
 * Purpose: Warehouse Distribution System
 * 
 * @author Chris Thomas
 * Worker.java Class Description: The worker places the package with customer's purchased items onto the conveyer.
 */
public class Worker implements Runnable {
    private final static Random generator = new Random();
    private final Conveyer sharedLocation;
    private int id;
    public Worker(Conveyer shared, int id) {
        sharedLocation = shared;
        sharedLocation.setTotalWorkers(sharedLocation.getTotalWorkers()+1);
        this.id = id;
    }
    public void run() {
        int sum = 0;
        for(int count = 1; count<=20; count++)
        {
            try {
                Thread.sleep( generator.nextInt(1000) );
                int num = generator.nextInt( 5 ) + 1;
                sharedLocation.set( num, id );
                sum += num;
                //sum += count;
                //System.out.printf("%2d\n", count);
            } catch(InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println("Worker" + id + " done working and has processed "+ sum +" items. Terminating Worker");
       
        sharedLocation.setTotalWorkers(sharedLocation.getTotalWorkers()-1);
        if(sharedLocation.getTotalWorkers() == 0)
        {
            System.out.println("The total number of items put on the conveyer is " + sharedLocation.getTotalPut());
        }
    }
}