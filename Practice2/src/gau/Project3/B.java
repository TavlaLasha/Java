package gau.Project3;

import java.util.Random;
import java.util.Scanner;

public class B {
    int[] m = new int[12];
    Random rand = new Random();

    public void m1(){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= m.length; i++){
            System.out.print("Number"+i+": ");
            m[i-1] = sc.nextInt();
        }
    }
    public void m2(){
        for(int i = 0; i < m.length; i++){
            m[i] = rand.nextInt(15);
            System.out.println(m[i]);
        }
    }
    public void m3(){
        int sum=0;
        for(int i = 0; i < m.length; i++){
            if(m[i] > 7){
                System.out.println(i+": "+m[i]);
            }
        }
    }
    public int m4(){
        int max=0, min=m[0];
        for (int j : m) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Max: "+max+" Min: "+min);
        return max-min;
    }
}
