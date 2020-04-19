package concurrent;

/**
 * synchronized 可重入
 */
public class SynchronizedRecursion10 {

    int a = 0;

    public static void main(String[] args) {
        SynchronizedRecursion10 synchronizedRecursion10 = new SynchronizedRecursion10();

        synchronizedRecursion10.method1();

    }

    private synchronized void method1(){
        System.out.println("这是method1，a= " + a);

        if (a == 0) {
            a++;
            method1();
        }
    }
}
