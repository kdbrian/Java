import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String username;

    public Client(Socket socket, String username) {
        try{
            this.socket = socket;
            this.username = username;

            this.bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.username=username;

        }catch (IOException e){
            closeEverything(socket,bufferedReader,bufferedWriter);
        }
    }

    public void sendMessage(){
        try{
            bufferedWriter.write(username);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            Scanner scan=new Scanner(System.in);

            while(socket.isConnected()){
                String msg=scan.nextLine();
                bufferedWriter.write(username+" : "+msg);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        }catch (IOException e){
            closeEverything(socket,bufferedReader,bufferedWriter);
        }
    }

    public void listenForMessage(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                String msgGroupChat;

                while(socket.isConnected()){

                    try{
                        msgGroupChat=bufferedReader.readLine();
                        System.out.println(msgGroupChat);
                    }catch (IOException e){

                        closeEverything(socket,bufferedReader,bufferedWriter);
                    }
                }
            }
        }).start();
    }

    private void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {

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


    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);


        System.out.print("Enter username to connect :");
        String userName=scan.nextLine();

        Socket socket = new Socket("localhost",1234);

        Client client=new Client(socket,userName);

        client.listenForMessage();
        client.sendMessage();

    }
}
