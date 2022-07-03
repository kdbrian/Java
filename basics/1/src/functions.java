import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class functions {


    public static void main(String[] args) {

        System.out.println("Functions ==> Pieces of code that can be reused");

        sayHi();

        System.out.println("2 + 3 = "+add(2,3));
        System.out.println("2.3 + 3.14 = "+add(2.3f,3.14f));

        subtract(5,1);

        System.out.println("\n5! = "+fact(5));

        System.out.print("Enter a name : ");
        sayHi(getName());
    }

    //function to get user input
    public static String getName(){
        Scanner scanner=new Scanner(System.in);

        try{

            return scanner.nextLine();

        }catch (InputMismatchException e){
            System.out.println("An error occured");
            System.exit(1);
        }

        scanner.close();
        return null;
    }

    //no parameters no return value
    public static void sayHi(){
        System.out.println("Hello world");
        System.out.println("Dont forget to call your functions 😂😂😂");
    }

    public static void sayHi(String name){
        System.out.println("Hello, "+name);
    }

    //has parameters and a return type/value
    public static int add(int x,int y){
        return x+y;
    }

    //overloaded function to return float
    public static float add(float x,float y){
        return x+y;
    }

    //parameters and no return type/value
    public static void subtract(int x,int y){
        System.out.printf("%d - %d = %d",x,y,(x-1));
    }

    //recursive function illustration using the factorial problem
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;

        }else {
            return  n * fact(n-1);
        }
    }


}
