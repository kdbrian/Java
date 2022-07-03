import java.io.IOException;
import java.net.InetSocketAddress;

public class inetSocket {

    public static void main(String[] args) {

        InetSocketAddress inetSocketAddress=new InetSocketAddress("[::1]",12889);
            printInetSocketDetails(inetSocketAddress);
            InetSocketAddress inetSocketAddress1=InetSocketAddress.createUnresolved("[::1]",12884);
            printInetSocketDetails(inetSocketAddress1);


    }


    public static void printInetSocketDetails(InetSocketAddress inetSocketAddress){
        System.out.println("Adress : "+inetSocketAddress.getAddress());
        System.out.println("Host : "+inetSocketAddress.getHostName());
        System.out.println("Port : "+inetSocketAddress.getPort());
        System.out.println("isUnResolved : "+inetSocketAddress.isUnresolved());
    }
}
