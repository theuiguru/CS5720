package midtermserver;
import com.sun.cnpi.rss.elements.Generator;
import com.sun.cnpi.rss.elements.Item;
import com.sun.cnpi.rss.elements.Rss;
import com.sun.cnpi.rss.parser.RssParser;
import com.sun.cnpi.rss.parser.RssParserException;
import com.sun.cnpi.rss.parser.RssParserFactory;
import java.util.*;
import java.io.*;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * CS5720 Midterm Assignment
 * Description: Server.java is connected to the client to produce a RSS news feed.
 * 
 * @author Chris Thomas
 */
public class MidtermServer {
    private NewsQueue b;
    private Socket socket;
    private ServerSocket serverSocket;
    OutputStream out;
    public static void main(String[] args) throws RssParserException, IOException {
        URL cnn = new URL("http://rss.cnn.com/rss/cnn_topstories.rss");
        URL google = new URL("http://news.google.com/news?ned=us&topic=h&output=rss");
        
        ExecutorService application = Executors.newCachedThreadPool();
        NewsQueue b = new NewsQueue();
        Vendor v1 = new Vendor(b, cnn);
        Vendor v2 = new Vendor(b, google);
        Broadcaster bc = new Broadcaster(b);
        application.execute(v1);
        application.execute(v2);
        application.execute(bc);
        application.shutdown();
    }
}