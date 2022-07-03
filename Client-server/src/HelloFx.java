import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

//import javafx.application.Application;
public class HelloFx {

    public static void main(String[] args) {

        try{
            InetAddress myComputerAdress=InetAddress.getLocalHost();

            int timeOutInMillis=10000;
            System.out.println("Host IP adress "+myComputerAdress.getHostAddress());
            System.out.println("isReachable() : "+myComputerAdress.isReachable(timeOutInMillis));
            System.out.println("isLoopBack : "+myComputerAdress.isLoopbackAddress());

//            printHostDetails("www.google.com");
            printHostDetails("[::1]");

        }catch (IOException e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }

    }

    public static void printHostDetails(String host){
        try{
            InetAddress inetAddress=InetAddress.getByName(host);
            System.out.println("Host : "+inetAddress.getHostName());
            System.out.println("Adress : "+inetAddress.getHostAddress());
            System.out.println("isLoopBack : "+inetAddress.isLoopbackAddress());

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println();
    }

    public void printDetails(InetSocketAddress inetSocketAddress){
        System.out.println(inetSocketAddress);
        System.out.println(inetSocketAddress.getHostName());
        System.out.println(inetSocketAddress.getAddress());
        System.out.println(inetSocketAddress.getPort());
        System.out.println(inetSocketAddress.isUnresolved());
    }
}
