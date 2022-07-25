package networking.one;

import java.io.IOException;
import java.net.InetAddress;

public class test {

    public static void main(String[] args) {

        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            printDetails(inetAddress);

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    /***
     * Function to print details of a inetadress
     * @param inetAddress
     */
    public static void printDetails(InetAddress inetAddress){
        System.out.println("Host : "+inetAddress.getHostName());
        System.out.println("Adress : "+inetAddress.getHostAddress());
        System.out.println("isLoopback : "+inetAddress.isLoopbackAddress());
        System.out.println();
    }
}
