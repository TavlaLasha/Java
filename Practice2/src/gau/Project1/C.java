package gau.Project1;

import java.util.Scanner;

public class C {
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
    public int m2(){
        return a%10;
    }
    public int m3(){
        int m=0;
        while(b!=0){
            m = b%10;
            b = b/10;
        }
        return m;
    }
    public int m4(){
        int sum=0;
        while(b!=0){
            sum += b%10;
            b = b/10;
        }
        return sum;
    }
    public int m5(){
        return m2()*m3();
    }
    public int m6(){
        return m4()+m5();
    }
}
