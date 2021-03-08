package gau.Project1;

import java.util.Scanner;

public class B {
    private int a, b, c;

    public void m1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();
        System.out.print("c: ");
        c = sc.nextInt();
    }
    public void m2(){
        System.out.println(Math.max(Math.max(a,b), c));
    }
    public int m3(){
        return Math.min(Math.min(a,b), c);
    }
}
