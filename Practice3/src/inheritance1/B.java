package inheritance1;

import java.util.Scanner;

public class B extends A {
    protected int y;
    public void setY(){
        Scanner sc = new Scanner(System.in);
        System.out.print("y: ");
        y = sc.nextInt();
    }
    public int m2(){
        return x+y;
    }
}
