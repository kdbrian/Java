public class test {

    public static void main(String[] args) {

        dog curr=null;


        dog dog1=new dog("One",1);
        // point to first dog
        curr=dog1;
        System.out.println(curr);

        curr=null;
        dog1.child=new dog("two",2);

        // point to first dogs child
        curr=dog1.child;
        System.out.println(curr);

        curr=null;
        // point to first dogs child...child
        curr=new dog("three",3);
        System.out.println(curr);
    }

}
class dog{

    String name;
    int num;
    dog child;

    public dog(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.num);
    }
}