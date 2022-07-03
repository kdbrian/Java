import java.util.InputMismatchException;
import java.util.Scanner;

public class variables {
    //:todo create a function that verifies a variable name
    public static void main(String[] args) {

        String example1="am";
        String example2="$_am";
        String example3="am12";
        String example4="_am";
        String example5="1_am";
        String example6="_2$me";

        System.out.println(example1+(verifyName(example1)?" is ok":" failed "));
        System.out.println(example2+(verifyName(example2)?" is ok":" failed "));
        System.out.println(example3+(verifyName(example3)?" is ok":" failed "));
        System.out.println(example4+(verifyName(example4)?" is ok":" failed "));
        System.out.println(example5+(verifyName(example5)?" is ok":" failed "));
        System.out.println(example6+(verifyName(example6)?" is ok":" failed "));

        String input;
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.print("Enter a name to check : ");
            input= scanner.nextLine();

            System.out.println(input+(verifyName(input)?" is ok":"failed "));
            scanner.close();

        }catch(InputMismatchException e){

            System.exit(1);
        }

    }

    /*
    * Function to verify a variable name
    * @return Boolean
    * @param String Variable name
    * */
    public static Boolean verifyName(String name){

        // 1. cannot start with a integer value
        if(((int)name.charAt(0))>=48 && ((int)name.charAt(0))<=57){
            System.out.println("A variable name cannot begin with a number");
            return false;
        }

        for(char c:name.toCharArray()){

            // 1.can only contain underscore(_),dollar sign($),0-9,A-Z,a-z
            // A-Z(65-90) // a-z(97-122) // 0-9(48-57) // _ 95 // $ 36
            int charValue=(int )c;

            if(!((c>=65 && c<=90) || (c>=97 && c<=122) || (c == 95) || (c==36) || (c>=48 && c<=57))){
                //System.out.printf("Invalid character <%c> detected",c);
                return false;
            }

            // 1. cannot start with a space
            if(c ==' '){
                //System.out.println("A variable name cannot begin/contain a space character");
                return false;
            }

        }
        return true;
    }
}
