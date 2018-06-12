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
 * Buffer.java Class Description: Set and get the total packaged for the driver to send out to the customer.
 */
public interface Buffer {
    //set the total packaged by the packager
    public void set(int value, int id) throws InterruptedException;
    
    //get the total packaged for the driver to read out
    public int get(int id) throws InterruptedException;
}