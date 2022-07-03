import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class testClient1 {

    public static void main(String[] args) {

        Socket socket=null;

        try {
            socket=new Socket(InetAddress.getLocalHost(),3000);

            System.out.println("=======Connected=======");

            while(true){

            }

        }catch (IOException e){
            System.out.println("Connection to server failed");
        }
    }
}
