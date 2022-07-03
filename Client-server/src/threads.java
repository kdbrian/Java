public class threads {

    public static void main(String[] args) {
        thrd1 r1=new thrd1("Thread 1");
        r1.start();

        thrd1 r2=new thrd1("Thread 2");
        r2.start();

    }
}
