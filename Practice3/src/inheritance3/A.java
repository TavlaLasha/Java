package inheritance3;

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
    public void setXYRand(){
        int min = 12;
        int max = 78;
        x = (int)(Math.random()*(max-min+1)+min);
        y = (int)(Math.random()*(max-min+1)+min);
    }
    public void printY(){
        System.out.println("y= "+y);
    }
}
