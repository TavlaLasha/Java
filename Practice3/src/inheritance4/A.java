package inheritance4;

import java.util.Scanner;

public class A {
    protected double x, y;

    public void setXY(){
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        x = sc.nextDouble();
        System.out.print("y: ");
        y = sc.nextDouble();
    }
    public void setXYRand(){
        int max = 78;
        x = Math.random()*(max+1);
        y = Math.random()*(max+1);
    }
    public void printFormula(){
        System.out.println((y-3*x)/3);
    }
}
