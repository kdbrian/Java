package networking.one;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/***
 * my first TCP server socket
 */
public class serverSocket {

    static final int port=6789;

    public static void main(String[] args) {

        //TODO:Steps in creating a server socket

        //Create a server socket object

        try{

            ServerSocket serverSocket=new ServerSocket(port);

            //awaits client connection on specified port
            System.out.println("Server started at "+serverSocket.getInetAddress());
            System.out.println("Awaiting for messages");

            while(true) {

                Socket link = serverSocket.accept();

                if (link != null) {

                    //set input and output stream

                    BufferedInputStream inputStream=new BufferedInputStream(link.getInputStream());

                    BufferedOutputStream outputStream=new BufferedOutputStream(link.getOutputStream());

                    int noMsg=0;

                    String msg= null;

                    while((msg= String.valueOf(inputStream.read())) != null){

                        if(msg.equalsIgnoreCase("Q") || msg.equalsIgnoreCase("Quit") || msg.equalsIgnoreCase("Q")){

                            System.out.println("Exitting...");
                            link.close();
                        }

                        System.out.println("Message recieved");
                        noMsg++;

                        outputStream.flush();
                        inputStream.reset();

                    }

                    System.out.println("Number of messages transmitted are "+noMsg);
                }

            }


        }catch (IOException e){
            System.out.println();
            System.err.println("An error occured my G");
        }


    }
}
