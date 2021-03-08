package gau;

import java.util.Arrays;

public class Exercise9 {
    public Exercise9(){
        double m[] = {2.34, 1.33, 4.5, 2.15, 9.0, 1.67, 8.88, 5.56};
        for(int i=0; i<m.length; i++){
            System.out.println((i+1)+" - "+m[i]);
        }
        Arrays.sort(m);
        System.out.println("Max: "+m[0]);
        System.out.println("Min: "+m[m.length-1]);
    }
}
