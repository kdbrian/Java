import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class testServer1 {

    public static void main(String[] args) {

        ServerSocket serverSocket=null;

        try{
            serverSocket=new ServerSocket(3000);
            System.out.println("server started\nWaiting for connections.....");

//            System.out.println(serverSocket);

            while(true){
                final Socket socket=serverSocket.accept();
                System.out.println("Client connected at :- "+socket.getLocalAddress()+":"+socket.getPort());

            }


        }catch (IOException e){

            System.out.println("Failed to connect");
            e.printStackTrace();

        }
    }
}
