package gau.Quiz;

import java.util.Scanner;

public class A {
    protected int x;
    public A() {
        System.out.println("Hello A");
    }
    public void setX(){
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        x = sc.nextInt();
    }
    public void printFormula(){
        System.out.println(x+12);
    }
    public void oddOrEven(){
        if (x % 2 == 0) {
            System.out.print("ლუწია");
        } else {
            System.out.print("კენტია");
        }
    }
}
