package networking.two;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {

    final static int PORT=6789;
    static InetAddress host=null;
    final  static  int limit=100;

    public static void main(String[] args) {


        ServerSocket serverSocket=null;

        Socket clientConnection=null;

        try{

            host=InetAddress.getLocalHost();

            serverSocket=new ServerSocket(PORT,limit,host);

            System.out.println("Server started at "+serverSocket.getInetAddress()+":"+serverSocket.getLocalPort());


            while(true){

                clientConnection=serverSocket.accept();

                if(clientConnection != null){

                    System.out.println("Client connected at "+clientConnection.getLocalPort());

                    handleClient(clientConnection);
                }
            }


        }catch (IOException e){

            System.err.println("An error occured");
            System.exit(1);
        }
    }

    private static void handleClient(Socket clientConnection) {

        try{

            //getting the input stream

            Scanner scan=new Scanner(clientConnection.getInputStream());

            PrintWriter writer=new PrintWriter(clientConnection.getOutputStream(),true);

            String msg=scan.nextLine();

            while(!msg.equalsIgnoreCase("Q")){

                System.out.println("Message recieved");

            }

            writer.println("Closing server...");

        }catch (IOException e){

            System.out.println("An error occured");

        }

        finally {
            try{
                System.out.println("Closing connection");
                clientConnection.close();
            }catch (IOException e){
                System.out.println("Unable to disconnect");
                System.exit(1);
            }
        }

    }
}
