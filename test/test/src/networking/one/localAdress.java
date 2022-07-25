package networking.one;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class localAdress {

    public static void main(String[] args) {

        try {

            InetAddress inetAddress = InetAddress.getLocalHost();

            System.out.println(inetAddress);

        }catch(UnknownHostException e){

            System.out.println("An error occured");
        }
        
        
    }
}
