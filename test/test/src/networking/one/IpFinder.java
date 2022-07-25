package networking.one;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/***
 * Looks up the ip from a host name
 */
public class IpFinder {

    public static void main(String[] args) {

        InetAddress address=null;

        Scanner scanner=new Scanner(System.in);

        try{
            System.out.print("Enter host : ");
            String host=scanner.nextLine();

            address=InetAddress.getByName(host);

            System.out.println(address);

            scanner.close();

        }catch (UnknownHostException e){
            System.out.println("An error occured");
        }
    }
}
