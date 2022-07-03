import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class mySocket1 {

    public static List<Socket> connected =new ArrayList<>();

    public static void main(String[] args) {

        try{
            int waitList=3;
            ServerSocket serverSocket=new ServerSocket();

            InetSocketAddress inetSocketAddress=new InetSocketAddress(InetAddress.getLocalHost(),12900);

            serverSocket.bind(inetSocketAddress,waitList);

            while (true){

                if (serverSocket.accept() != null){
                    connected.add(serverSocket.accept());
                    waitList--;
                }

                if (waitList==0){
                    serverSocket.close();
                    connected.forEach(System.out::println);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
