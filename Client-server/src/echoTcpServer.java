import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class echoTcpServer {

    public static void main(String[] args) {

        try{
            ServerSocket serverSocket=new ServerSocket(12900,100,InetAddress.getLocalHost());

            System.out.println("Server started at "+serverSocket);

            while(true){
                // keep accepting multiple clients
                System.out.println("Waiting for a connection ..");

                final Socket activeSocket=serverSocket.accept();

                System.out.println("connected at "+activeSocket);


                // creating a new thread to handle the connection
                Runnable runnable=()->handleClientRequest(activeSocket);

                new Thread(runnable).start();

            }


        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void handleClientRequest(Socket activeSocket) {

        BufferedWriter socketWritter=null;
        BufferedReader socketReader=null;

        try {
            socketReader=new BufferedReader(new InputStreamReader(activeSocket.getInputStream()));
            socketWritter=new BufferedWriter(new OutputStreamWriter(activeSocket.getOutputStream()));

            String msg=null;

            while ((msg =socketReader.readLine()) != null){
                System.out.println("Message recieved : "+msg);

                // echoing the recieved message to the client

                String out=msg;
                socketWritter.write(out);
                socketWritter.newLine();
                socketWritter.flush();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        finally {
            try{
                activeSocket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
