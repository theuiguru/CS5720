package midtermserver;
import com.sun.cnpi.rss.elements.Item;
import com.sun.cnpi.rss.elements.Rss;
import com.sun.cnpi.rss.parser.RssParser;
import com.sun.cnpi.rss.parser.RssParserFactory;
import com.sun.corba.se.spi.activation.Server;
import java.io.*; 
import java.net.*; 
import java.security.*; 
import java.util.Collection;
import org.omg.CORBA.Context;
import org.omg.CORBA.ContextList;
import org.omg.CORBA.DomainManager;
import org.omg.CORBA.ExceptionList;
import org.omg.CORBA.NVList;
import org.omg.CORBA.NamedValue;
import org.omg.CORBA.Object;
import org.omg.CORBA.Request;
import org.omg.CORBA.SetOverrideType;
public class Vendor implements Runnable {   
    private Socket server; 
    private static String command,info,message; 
    BufferedReader infromclient =null; 
    InputStream infromclient2=null; 
    DataOutputStream outtoclient =null; 
    static BufferedReader infrommaster=null; 
    private static int port=5000;
    private Buffer b;
    private URL url;
    Vendor(NewsQueue b, URL url) {
        this.b = b;
        this.url = url;
    }
    public void run(){                  
        try {
            RssParser parser1 = RssParserFactory.createDefault();
            Rss rss = parser1.parse(url);
            Collection<Item> items = (Collection<Item>) rss.getChannel().getItems();
            for(Item i : items) {
                System.out.println("Test1");
                System.out.println(i.getTitle().toString());
                b.set(i.getTitle().toString());
            }
            command=infrommaster.readLine();   
            outtoclient.writeBytes(command+"\n"); 
            infromclient =new BufferedReader(new InputStreamReader(server.getInputStream())); 
            outtoclient =new DataOutputStream(server.getOutputStream()); 
            infrommaster=new BufferedReader(new InputStreamReader(System.in));
            if(command.equals("showinfo")) {         
                info=infromclient.readLine(); 
                System.out.println("\nClient information\n\n" +info+"\n");                     
            }
            server.close();                        
        }catch (Exception e) { 
            System.out.println("IOException on socket listen: " + e); 
            e.printStackTrace(); 
        }        
    } 
}
