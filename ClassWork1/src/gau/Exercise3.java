package gau;

import java.util.Scanner;

public class Exercise3 {
    public Exercise3(){
        System.out.println("Exercise 3");
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number1: ");
        n1 = sc.nextInt();
        System.out.print("Enter Number2: ");
        n2 = sc.nextInt();
        System.out.print("Enter Number3: ");
        n3 = sc.nextInt();

        System.out.println("Sum: "+(n1+n2+n3)+" Multiplication: "+(n1*n2*n3));
    }
}
