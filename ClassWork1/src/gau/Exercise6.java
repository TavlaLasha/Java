package gau;

import java.util.Scanner;

public class Exercise6 {
    public Exercise6(){
        System.out.println("Exercise 6");
        int x, s=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("X= ");
        x = sc.nextInt();
        while(x!=0){
            s += x%10;
            x = x/10;
        }
        System.out.println(s);
    }
}
