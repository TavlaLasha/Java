package gau;

import java.util.Scanner;

public class Exercise2 {
    public Exercise2() {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("X= ");
        x = sc.nextInt();
        System.out.print("Y= ");
        y = sc.nextInt();

        System.out.println(x/y);
        System.out.println(y%x);
    }
}
