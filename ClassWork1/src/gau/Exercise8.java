package gau;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
    public Exercise8() {
        int m, n, minN, maxN;
        Scanner sc = new Scanner(System.in);
        System.out.print("M: ");
        m = sc.nextInt();
        System.out.print("N: ");
        n = sc.nextInt();

        if(m>n){
            minN = n;
            maxN = m;
        }else{
            minN = m;
            maxN = n;
        }

        for(int i=minN+1; i<=maxN-1; i++){
            if(i == maxN-1){
                System.out.print(i);
            }
            else{
                System.out.print(i+",");
            }
        }
    }
}
