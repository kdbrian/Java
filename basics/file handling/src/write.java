import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class write {
    //reads data from one file and writes it into another

    public static void main(String[] args) {

        Scanner scanner=null;
        File outPutFile=null;
        File inPutFile=null;
        FileWriter fileWriter=null;
        FileReader fileReader=null;

        final String outPutPath="C:\\Users\\C0D3.iT\\Documents\\Java Files\\basics\\file handling\\files\\output.txt";
        final String inPutPath="C:\\Users\\C0D3.iT\\Documents\\Java Files\\basics\\file handling\\files\\input.txt";

        try{
            inPutFile=new File(inPutPath);
            outPutFile=new File(outPutPath);

            if(outPutFile.exists() && outPutFile.canWrite()){

                if(!(inPutFile.exists() && inPutFile.canRead())){
                    System.out.println("File cannot be read");
                    System.exit(1);
                }

                System.out.println("Reading.....");
                fileReader=new FileReader(inPutFile);
                fileWriter=new FileWriter(outPutFile);

                scanner=new Scanner(fileReader);

                System.out.println("Writting");

                while(scanner.hasNext()){
                    fileWriter.write(scanner.nextLine());
                    fileWriter.write("\n");
                    fileWriter.flush();
                }

                System.out.println("Writting complete");
                scanner.close();
                fileReader.close();
                fileWriter.close();
            }

        }catch (IOException e){

            System.out.println("An error occured..Exiting..");
            System.exit(1);
        }


    }
}
