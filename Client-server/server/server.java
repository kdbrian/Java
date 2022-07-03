import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    private ServerSocket serverSocket;

    public server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }
    
    public void startServer(){
        try{
            while(! serverSocket.isClosed()){//listening while the server is open

                Socket socket=serverSocket.accept();
                System.out.println("A new Client Connected");

                ClientHandler clientHandler=new ClientHandler(socket);

                Thread thread=new Thread(clientHandler);

                thread.start();


            }

            System.out.println("Server closed");
        } catch (IOException e) {
//            e.printStackTrace();
        }
    }

    public void closeServerSocket(){

        try{
            if(serverSocket != null){
                serverSocket.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }


    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket=new ServerSocket(1234);

        server myServer=new server(serverSocket);

        myServer.startServer();
    }
}
