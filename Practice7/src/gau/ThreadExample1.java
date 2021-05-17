package gau;

public class ThreadExample1 extends Thread {
    public void run() {
        System.out.println("Thread 1 running");
        System.out.println(this.getName());
        System.out.println(this.getPriority());
    }
    public void m1(){
        System.out.println("Hello Thread 1");
    }
}
