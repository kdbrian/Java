import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class tcpSocket {

    public static void main(String[] args) {

        try{
            // creates an unbound server
            ServerSocket serverSocket=new ServerSocket();
            // create a socket adress object
            InetSocketAddress inetSocketAddress=new InetSocketAddress("localhost",12800);

            int waitSize=100;

            /*bounds the server to localhost:12800 with a wait queue size of 100*/
            serverSocket.bind(inetSocketAddress,waitSize);
            Socket activeSocket=serverSocket.accept();

            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(activeSocket.getInputStream()));

            BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(activeSocket.getOutputStream()));


            String msg=bufferedReader.readLine();
            bufferedWriter.write(msg);
            bufferedWriter.flush();

            activeSocket.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
