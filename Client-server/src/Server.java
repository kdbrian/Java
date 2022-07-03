import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    public static void main(String[] args) {

        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;

        try{
            ServerSocket serverSocket=new ServerSocket(12900);

            System.out.println("Server started at "+serverSocket.getLocalSocketAddress());
//            serverSocket.bind(InetAddress.getLocalHost());

            String msgIn=null;
            String wait="Waiting....";
            System.out.println(wait);
            while (true){

                final Socket socket=serverSocket.accept();

                System.out.println("Client connected at " + socket);

                Runnable runnable=()->handleClientRequest(socket);


                System.out.println(wait);

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
