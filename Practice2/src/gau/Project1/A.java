package gau.Project1;

import java.util.Scanner;

public class A {
    private int a, b;

    public void m1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();
    }
    public void m2(){
        System.out.println("a+b: "+(a+b));
    }
    public int m3(){
        return a*b;
    }
}
