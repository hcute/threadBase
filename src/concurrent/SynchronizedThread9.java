package concurrent;

/**
 * synchronized 抛出异常会释放
 */
public class SynchronizedThread9 implements Runnable{
    static SynchronizedThread9 instance = new SynchronizedThread9();

    static int i = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(i);

    }

    @Override
    public void run() {
        for (int j = 0; j < 100000 ; j++) {
            i++;
        }
    }
}
