package midtermclient;
import java.util.*;
import java.io.*;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * CS5720 Midterm Assignment
 * Description: Client.java is connected to the server to produce a RSS news feed.
 * 
 * @author Chris Thomas
 */
public class MidtermClient implements Runnable {
	Socket requestSocket;
	ObjectOutputStream out;
 	//ObjectInputStream in;
        BufferedReader in = null;
 	String message;
	MidtermClient(){}
	public void run() {
		try {
                    //1. creating a socket to connect to the server
                    requestSocket = new Socket("localhost", 5000);
                    System.out.println("Connected to localhost in port 5000");
                    //2. get Input and Output streams
                    out = new ObjectOutputStream(requestSocket.getOutputStream());
                    out.flush();
                    //in = new ObjectInputStream(requestSocket.getInputStream());
                    in = new BufferedReader( new InputStreamReader( requestSocket.getInputStream( ) ));
                    //3: Communicating with the server
                    //do {
                    try {
                        System.out.print("Waiting for Message" );
                            message = (String)in.readLine();
                        System.out.print("Message recieved" );    
                            //System.out.print(in.toString( ) );
                            System.out.println("Server: " + message);
                            //sendMessage("Hi from my server");
                            //message = "bye";
                            //sendMessage(message);
                    }
                    catch( Exception classNot){
                            System.err.println("data received in unknown format");
                    }
                    //} while(!message.equals("Bye"));
		}
		catch(UnknownHostException unknownHost){
			System.err.println("You are trying to connect to an unknown host!");
		}
		catch(IOException ioException){
			ioException.printStackTrace();
		}
		finally {
			//4: Closing connection
			try{
				in.close();
				out.close();
				requestSocket.close();
			}
			catch(IOException ioException){
				ioException.printStackTrace();
			}
		}
	}
	public static void main(String args[]) throws IOException {
		MidtermClient client = new MidtermClient();
		client.run();
                String command2; 
                String info; 
                Socket clientSocket=null; 
                Socket scket=null;     
                BufferedReader inFromUser=null; 
                DataOutputStream outToServer=null; 
                BufferedReader inFromServer=null; 
                BufferedWriter tosite=null;
	}
}