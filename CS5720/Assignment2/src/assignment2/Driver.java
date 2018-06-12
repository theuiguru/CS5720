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
 * Driver.java Class Description: The driver picks up the items, delivers, and verifies the count given by the worker.
 */
public class Driver implements Runnable {
    private final static Random generator = new Random();
    private final Conveyer sharedLocation; //the conveyer
    private int id;
    public Driver(Conveyer shared, int id) {
        sharedLocation = shared;
        sharedLocation.setTotalDrivers(sharedLocation.getTotalDrivers()+1);
        this.id = id;
    }
    public void run() {
        int sum = 0;
        for(int count = 1; count<=20; count++)
        {
            try {
                Thread.sleep( generator.nextInt(1300) );
                int value = sharedLocation.get(id );
                sum += value;
                System.out.println( "\t\t\t\t\tDriver" + id + " delivered package with " + value + " item(s).");
            } catch(InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        System.out.printf("\n%s %d %s\n", "Driver" + id + " has delivered", sum, "items. Terminating Driver " + id);
        //System.out.println("Terminating Driver.");
        sharedLocation.setTotalDrivers(sharedLocation.getTotalDrivers()-1);
        if(sharedLocation.getTotalDrivers() == 0)
        {
            System.out.println("The total number of items delivered is " + sharedLocation.getTotalTaken());
        }
    }
}
