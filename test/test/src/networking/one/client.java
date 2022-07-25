package networking.one;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class client {

    public static void main(String[] args) {

        Socket tempClient=null;

        try{
            //Todo:a client socket that creates a connection to the server

            // bind socket with the same ip adress and port as the server
            tempClient=new Socket(InetAddress.getLocalHost(),serverSocket.port);

            Scanner scan=new Scanner(System.in);

            BufferedInputStream inputStream=new BufferedInputStream(tempClient.getInputStream());
            BufferedOutputStream outputStream=new BufferedOutputStream(tempClient.getOutputStream());

            String msg=null;

            while(true){
                msg=scan.nextLine();

                if(msg.equalsIgnoreCase("Q")){
                    System.out.println("Exitting");
                    System.exit(1);
                }

                outputStream.write(Integer.parseInt(msg));

            }

        }catch (IOException e){
            System.out.println("Unresolved error occured");
            System.exit(1);
        }
    }
}
