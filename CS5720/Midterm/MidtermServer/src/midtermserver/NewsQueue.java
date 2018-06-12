package midtermserver;
import midtermserver.Buffer;
import java.util.*;
import java.io.*;
import java.net.*;
import java.util.concurrent.ArrayBlockingQueue;
public class NewsQueue implements Buffer {
    private static final int maxCapacity = 1;
    private final ArrayBlockingQueue<String> newsQueue;
    public NewsQueue() {
        newsQueue = new ArrayBlockingQueue<String>(maxCapacity);
    }
    @Override
    public synchronized void set(String value) throws InterruptedException {
        //while(newsQueue.size()==maxCapacity) wait();
        //notifyAll();
        System.out.println("setMethodCalled");
        newsQueue.put(value);
    }
    @Override
    public synchronized String get() throws InterruptedException {
        //while(newsQueue.isEmpty()) wait();
        //notifyAll();
        System.out.println("get() worked");
        return newsQueue.take();
    }
}
