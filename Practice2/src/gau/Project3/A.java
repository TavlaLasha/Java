package gau.Project3;

import java.util.Scanner;
import java.util.Random;

public class A {
    int[] m = new int[10];
    Random rand = new Random();

    public void m1(){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= m.length; i++){
            System.out.print("Number"+i+": ");
            m[i-1] = sc.nextInt();
        }
    }
    public void m2(){
        for(int i = 0; i < 10; i++){
            m[i] = rand.nextInt(15);
        }
    }
    public int m3(){
        int sum=0;
        for(int i = 0; i < m.length; i++){
            if(m[i] < i){
                sum+=m[i];
            }
        }
        return sum;
    }
    public int m4(){
        int mult=1;
        for(int i = 0; i < m.length; i++){
            if(m[i] > i){
                mult*=m[i];
            }
        }
        return mult;
    }
}
