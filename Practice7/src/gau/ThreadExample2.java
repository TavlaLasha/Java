package gau;

public class ThreadExample2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread 2 Running");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }

}
