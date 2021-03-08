package gau;

import java.util.Scanner;

public class Exercise5 {
    public Exercise5() {
        int x, c, s=0, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("ოთხნიშნა მთელი რიცხვი: ");
        x = sc.nextInt();
        c = x;

        while(c!=0){
            c = c/10;
            ++count;
        }

        if(count == 4){
            while(x!=0){
                s += x%10;
                x = x/10;
            }
            System.out.println("ციფრთა ჯამი: "+s);
        }
        else{
            System.out.println("Please enter 3 digit number.");
        }
    }
}
