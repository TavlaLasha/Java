package gau;

public class Main {

    public static void main(String[] args) {
        ThreadExample1 t1 = new ThreadExample1();
        t1.setPriority(1);
        t1.start();
        ThreadExample2 t2 = new ThreadExample2();
        Thread thd = new Thread(t2);
        thd.setPriority(10);
        thd.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("Main Method");
    }
}
