package inheritance1;

import java.util.Scanner;

public class A {
    protected int x;
    public A(){
        System.out.println("Hello My A Class");
    }
    public void setX(){
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        x = sc.nextInt();
    }
    public void printX(){
        System.out.println("x= "+x);
    }
    public void xType(){
        String inf = (x%2==0)? "Even" : "Odd";
        System.out.println("x is  "+ inf);
    }
}
