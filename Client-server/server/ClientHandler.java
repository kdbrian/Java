import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements  Runnable{

    public static ArrayList<ClientHandler> clientHandlers=new ArrayList<>();
    private Socket socket;

    //for reading user meassage
    private BufferedReader bufferedReader;
    //writting back to the users
    private BufferedWriter bufferedWriter;
    private String clientUsername;


    public ClientHandler(Socket socket) {

        try{
            this.socket=socket;
            this.bufferedWriter=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));

            this.clientUsername=bufferedReader.readLine();

            clientHandlers.add(this);

            broadcastMessage("Server : "+clientUsername+" has joined the chat");
        }catch (IOException e){
            closeEverything(socket,bufferedReader,bufferedWriter);
        }
    }

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        String msgClient;

        while(socket.isConnected()){
            try{
                msgClient = bufferedReader.readLine();
                broadcastMessage(msgClient);
                
            }catch(IOException e){
                closeEverything(socket,bufferedReader,bufferedWriter);
                break;
            }
        }
    }

    private void broadcastMessage(String msg) {

        for (ClientHandler clientHandler :clientHandlers){

            try{
                if(!clientHandler.clientUsername.equals(clientUsername)){

                    clientHandler.bufferedWriter.write(msg);
                    clientHandler.bufferedWriter.newLine();
                    clientHandler.bufferedWriter.flush();
                }
            }catch (IOException e){
                closeEverything(socket,bufferedReader,bufferedWriter);
            }
        }

    }

    private void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {

        removeClientHandler();

        try{

            if(bufferedReader != null){
                bufferedReader.close();
            }

            if(bufferedWriter != null){
                bufferedWriter.close();
            }

            if(socket != null){
                socket.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void removeClientHandler(){
        clientHandlers.remove(this);

        broadcastMessage("Server :"+ clientUsername +" Has left");
    }



}
