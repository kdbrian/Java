import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.function.BiFunction;

public class echoTcpClient {

    public static void main(String[] args) {
        Socket socket=null;
        try {
            socket=new Socket(InetAddress.getLocalHost(),12900);

            System.out.println("Client started at : "+socket.getLocalSocketAddress());

            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            BufferedReader consoleReader=new BufferedReader(new InputStreamReader(System.in));

            String outMsg=null;

//            System.out.println();
            String prompt="Please enter msg: ";
            System.out.println(prompt);
            while((outMsg=consoleReader.readLine()) != null){
                if (outMsg.equalsIgnoreCase("Q"))
                    break;

                bufferedWriter.write(outMsg);
                bufferedWriter.newLine();
                bufferedWriter.flush();

                //reading msg from the server
                String inComingMsg=bufferedReader.readLine();
                System.out.println("Server : "+inComingMsg);

                System.out.println("\n"+prompt);

            }

        }catch (IOException e){
            e.printStackTrace();
        }

        finally {
            try {
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
