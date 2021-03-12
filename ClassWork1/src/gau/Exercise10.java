package gau;

import java.util.Arrays;

public class Exercise10 {
    public Exercise10(){
        double[] m = {2.34, 1.33, 4.5, 2.15, 9.0, 1.67, 8.88, 5.56};
        Arrays.sort(m);

        double temp;
        for(int i=0; i<m.length/2; i++){
            temp = m[i];
            m[i]=m[m.length-1-i];
            m[m.length-1-i] = temp;
        }

        for(int i=0; i<m.length; i++){
            System.out.println((i+1)+" - "+m[i]);
        }
    }
}
