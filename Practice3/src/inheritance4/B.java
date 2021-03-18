package inheritance4;

import inheritance4.A;

import java.util.Scanner;

public class B extends A {
    protected double a, b;

    public void setab(){
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        a = sc.nextDouble();
        System.out.print("b: ");
        b = sc.nextDouble();
    }
    public void setMaxFirst(){
        if(a>b){
            a+=b;
            b=a-b;
            a-=b;
        }
    }
    public void setabRand(){
        int max = 78;
        x = Math.random()*(max+1);
        y = Math.random()*(max+1);
    }
}
