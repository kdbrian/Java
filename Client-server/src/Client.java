import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Socket socket=null;

        Scanner scanner=null;

        try {
            socket=new Socket(InetAddress.getLocalHost(),12900);

            scanner=new Scanner(System.in);

            String msg=null;
            BufferedReader bufferedReader=null;
            BufferedWriter bufferedWriter=null;

            char prm='>';

            while(true){
                bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                bufferedWriter=new BufferedWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));

                msg=scanner.nextLine();

                bufferedWriter.write(msg);
                bufferedWriter.newLine();
                bufferedWriter.flush();

            }

        }catch (IOException e){
            System.out.println("Connection failed");
            e.printStackTrace();
        }

    }
}
