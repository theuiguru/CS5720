package midtermserver;
import java.util.*;
import java.io.*;
import java.net.*;
public interface Buffer {
    //set the total packaged by the vendor
    public void set(String value) throws InterruptedException;
    
    //get the total packaged for the broadcaster to read out
    public String get() throws InterruptedException;
}