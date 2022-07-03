
public class thrd1 implements Runnable{

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

    private Thread thread;
    private String threadName;

    public thrd1(String threadName) {
        this.threadName = threadName;
        System.out.println("creating thread "+threadName);
    }

    @Override
    public void run() {
        System.out.println("Running "+threadName);

        try{
            for (int i=4;i>0;i--){
                System.out.println("Thread "+threadName+", "+i);

                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread "+threadName+" interrupted");
        }

        System.out.println("Thread "+threadName+" Exiting...");

    }


    public  void start(){
        System.out.println("Starting "+threadName);

        if(thread == null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }
}

