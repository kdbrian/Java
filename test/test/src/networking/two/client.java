package networking.two;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class client {

    public static void main(String[] args) {

        Socket clientSocket=null;

        try{
            clientSocket=new Socket(server.host,server.PORT);

        }catch (IOException e){
            System.out.println("Unable to create connection to server");
        }

        accessServer(clientSocket);
    }

    private static void accessServer(Socket clientSocket) {

        try {

            //input from the connection
            Scanner scanner=new Scanner(clientSocket.getInputStream());

            PrintWriter writer=new PrintWriter(clientSocket.getOutputStream(),true);

            //keyboard input
            Scanner input= new Scanner(System.in);

            //message and response
            String msg,res;

            do {
                msg=input.nextLine();

                //writting the message to the server
                writer.println(msg);

                res=scanner.nextLine();

                System.out.println("Server : "+res);

            }while(!msg.equalsIgnoreCase("Q"));

        }catch (IOException e){

            System.out.println("An error occured");
        }

        //closing connection

        finally {
            try{

                System.out.println("Clossing connection to server");
                clientSocket.close();

            }catch (IOException e){

                System.out.println("Unable to disconnect client");
                System.exit(1);
            }
        }
    }
}
