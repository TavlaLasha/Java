package inheritance;

import java.util.Scanner;

public class A {
    protected int x, y;

    public void setXY(){
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        x = sc.nextInt();
        System.out.print("y: ");
        y = sc.nextInt();
    }
    public void printX(){
        System.out.println("x= "+x);
    }
    public void printY(){
        System.out.println("y= "+y);
    }
}
