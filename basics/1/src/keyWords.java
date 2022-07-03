import java.util.Objects;
import java.util.Scanner;

public class keyWords {

    //Todo: to be edditted
    public static String[] keyWords={
            "for","try","each","while","do","if","else",
            "catch","class","public","static","void","int",
            "boolean","String","Integer"
    };


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Word that cannot be used as variable names class or function names");

        String word=null;
        System.out.print("Enter a word to check : ");
        word= scanner.nextLine();

        scanner.close();
        System.out.println(check(word));

    }

    private static boolean check(String word) {
        for(String wd : keyWords){
            if(Objects.equals(word, wd)){
                System.out.println(word+" is a keyword.");
                return false;
            }
        }

        System.out.println(word+" is not a keyword.");
        return true;
    }
}
