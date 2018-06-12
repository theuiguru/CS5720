package assignment2;
import java.util.*;
import java.io.*;
import java.net.*;
import java.util.concurrent.ArrayBlockingQueue;
/**
 * CS5720 Assignment 2
 * Assignment2.java
 * Purpose: Warehouse Distribution System
 * 
 * @author Chris Thomas
 * Conveyer.java Class Description: To convey the packages of the customer items from worker to driver.
 */
public class Conveyer implements Buffer {
    private static final int maxCapacity = 20;
    private int currentCount = 0;
    private final ArrayBlockingQueue<Integer> conveyer;
    private int totalWorkers;
    private int totalDrivers;
    private int totalPut;
    private int totalTaken;
    public Conveyer() {
        conveyer = new ArrayBlockingQueue<Integer>(maxCapacity);
    }
    @Override
    public synchronized void set(int value, int id) throws InterruptedException {
        while(conveyer.size()==maxCapacity)
        {
            System.out.println("Conveyer is full. Worker" + id + " is waiting");
            wait();
        }
        conveyer.put(value);
        totalPut += value;
        System.out.println( "Worker" + id + " added package of " + value + " item(s).");
        currentCount = value;
        notifyAll();
    }
    @Override
    public synchronized int get(int id) throws InterruptedException {
        while(conveyer.isEmpty())
        {
            System.out.println("Conveyer is empty. Driver" + id + " waiting.");
            wait();
        }
        currentCount = conveyer.take();
        totalTaken += currentCount;
        notifyAll();
        return currentCount;
    }
    /*add package by packager
    public void addPackage() {
        System.out.println("Package added.");
    }
    //remove package by driver
    public void removePackage() {
        System.out.println("Package removed.");
    }*/
    //set the total packaged delivered
    public int getTotalTaken() {
        return totalTaken;
    }
    public int getTotalPut() {
        return totalPut;
    }
    public int getTotalWorkers() {
        return totalWorkers;
    }
    public void setTotalWorkers(int totalWorkers) {
        this.totalWorkers = totalWorkers;
    }
    public int getTotalDrivers() {
        return totalDrivers;
    }
    public void setTotalDrivers(int totalDrivers) {
        this.totalDrivers = totalDrivers;
    }
    //does total packaged = total delivered? public boolean isShipped()
    public boolean isShipped() {
        return false;
    }
}
