import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class read {

    public static void main(String[] args) {


        try{
            final String path="C:\\Users\\C0D3.iT\\Documents\\Java Files\\basics\\file handling\\files\\input.txt";
            Scanner scanner=null;
            File file=new File(path);

            if(file.exists()){
                FileReader fileReader=new FileReader(file);
                scanner=new Scanner(fileReader);

                while(scanner.hasNext()){
                    String getText=scanner.nextLine();

                    System.out.println(getText);
                }

                System.out.println("Finished reading");

            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(1);
        }
    }
}
