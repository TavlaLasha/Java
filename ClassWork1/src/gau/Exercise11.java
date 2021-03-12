package gau;

import java.util.Random;

public class Exercise11 {
    public Exercise11() {
        int[] m = new int[10];
        Random rand = new Random();

        for(int i = 0; i < 10; i++){
            m[i] = rand.nextInt(30);
        }
        for(int i = 0; i < 10; i++){
            System.out.println(i+1+": "+m[i]);
        }
    }
}
