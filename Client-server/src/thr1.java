
//implementing threading
public class thr1 implements Runnable {
    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("Thread one is running");
    }

    public static void main(String[] args) {

//        int num=0;

        thr2 thr2=new thr2();

        Thread thread=new Thread(thr2);
        Thread thread2=new Thread();
        thread.start();

        while(true){
            try {
                thread2.start();
            }catch(Error e){
                System.exit(1);
            }

            break;
        }

        System.out.println(thread);
        System.out.println(thread2);
    }
}

class thr2 implements Runnable {

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

        System.out.println("Thread two is running");

    }
}
