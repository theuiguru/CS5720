package assignment2;
import java.util.*;
import java.io.*;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * CS5720 Assignment 2
 * Assignment2.java
 * Purpose: Warehouse Distribution System
 * 
 * @author Chris Thomas
 * DOCUMENTATION:
 * The worker places the package with random items onto the conveyer (buffer).
 * Then the driver picks up the items, delivers, and verifies the count given by the worker.
 * The worker placing the item and the driver picking up the item. But 2 checks need to be in place.
 * 1. You can't put more than 20 items on the Conveyer, so worker needs to check that before placing another item on the conveyer.
 *    If 20 items on conveyer, then sleep for 10 seconds until the driver has time to take more items off.
 * 2. Driver needs to verify that he delivers what he picks up. The total count for driver should equal total count by worker.
 */
public class Assignment2 {
    public static void main(String[] args) {
        // TODO code application logic here
    	ExecutorService application = Executors.newCachedThreadPool();
        Conveyer c = new Conveyer();
        Worker w1 = new Worker(c, 1);
        Worker w2 = new Worker(c, 2);
        Driver d1 = new Driver(c, 1); 
        Driver d2 = new Driver(c, 2);
        
        application.execute(w1);
        application.execute(w2);
        application.execute(d1);
        application.execute(d2);
        application.shutdown(); 
    }
}