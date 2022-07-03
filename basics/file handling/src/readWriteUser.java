import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class readWriteUser {
    //reads data from the user and writes it to a file

    public static void main(String[] args) {

        Scanner scanner=null;
        FileWriter fileWriter=null;
        File file=null;
        String msg=null;

        final String path="C:\\Users\\C0D3.iT\\Documents\\Java Files\\basics\\file handling\\files\\userData.txt";
        //if file is not there it will be created
        try {
            file = new File(path);

            if(!file.exists()) System.out.println("File doesnt exist....Creating file");

            fileWriter=new FileWriter(file);//if file doesnt exist upto this stage it will be created automatically

            scanner=new Scanner(System.in);
            System.out.println("Start typing(Quit to exit):");
            while ((msg=scanner.nextLine()) != null){

                if(msg.equalsIgnoreCase("Quit")){
                    System.out.println("Exitting");
                    fileWriter.close();
                    scanner.close();
                    System.exit(0);
                }

                fileWriter.write(msg);
                fileWriter.write("\n");
                fileWriter.flush();
            }

        }catch (IOException e){
            System.out.println("An error occured");
            System.exit(1);
        }
    }
}
