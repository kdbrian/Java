public class conditions {

    public static void main(String[] args) {
    /**
     * @return always return a true/false(0/1) value
     * */

//    if

        if(true){
            System.out.println("I am truly working");
        }

//     if....else

        int x=10;

        if(x==10){
            // will be executed if condition evaluates to true
            System.out.println("Equals 10");
        }else {
            // evaluated if the condition in the if()block isnt true

            System.out.println("Not equals  10");
        }

//     if..else if or nested if
        x=30;
        if(x==10){
            System.out.println("Equals 10");
        }else if(x==20){
            System.out.println("Equals 20");
        }else{
            System.out.println("Non of the conditions evaluated to a true value");
        }

//        switch
        /**
         * @NOTE every case must have a break statement otherwise all the cases will be compared
         * */
        int choice=4;

        switch (choice){

            case 1:
                System.out.println("You chose 1");
                break;

            case 3:
                System.out.println("You chose 3");
                break;

            default:
                System.out.println("Your choice didnt match");
                break;
        }

        char quitStat='B';

        switch (quitStat){
            case 'Y','y':
                System.out.println("Exiting .....");
                System.exit(0);
                break;

            case 'N','n':
                System.out.println("welcome back");
                break;

            default:
                System.out.println("An illustration that we can switch multiple cases and different data types");
                break;
        }

    }
}
