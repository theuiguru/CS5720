package midtermserver;
import java.util.*;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Broadcaster implements Runnable {
    private NewsQueue b;
    private Socket socket;
    private ServerSocket serverSocket;
    Socket connection = null;
    //ObjectOutputStream out;
    PrintWriter out = null;
    ObjectInputStream in;
    String message;
    public Broadcaster(NewsQueue b) {
        this.b = b;
    }
    public void run() {
        try {
            //1. creating a server socket
            serverSocket = new ServerSocket(5000);
            //2. Wait for connection
            System.out.println("Waiting for connection");
            connection = serverSocket.accept();
            System.out.println("Connection received from " + connection.getInetAddress().getHostName());
            //3. get Input and Output streams
            //out = new ObjectOutputStream(connection.getOutputStream());
            out = new PrintWriter( connection.getOutputStream(), true);
            out.flush();
           
            //in = new ObjectInputStream(connection.getInputStream());
            //sendMessage("Connection successful");
            //4. The two parts communicate via the input and output streams
            do {
                try {
                    String t = b.get();
                    System.out.println("Here?");
                    sendMessage(t);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            } while(!message.equals("Bye"));
	} catch(IOException ioException){
            ioException.printStackTrace();
          }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            //4: Closing connection
            try {
                in.close();
                out.close();
                serverSocket.close();
            }
            catch(IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
    public void sendMessage(String msg) {
        try {
                out.println(msg);
                out.flush();
        System.out.println("Server: " + msg);
        }
        catch(Exception ioException) {
                ioException.printStackTrace();
        }
    }
}