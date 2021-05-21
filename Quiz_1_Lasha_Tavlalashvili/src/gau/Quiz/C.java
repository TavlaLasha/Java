package gau.Quiz;

import java.util.Scanner;

public class C {
    protected int a, b;
    public void setAB(){
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();
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
    public void printM2M3Avg(){
        System.out.println((float)(m2()+m3())/2);
    }
}
