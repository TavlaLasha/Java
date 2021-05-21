package gau.Quiz;

import java.util.Arrays;

public class LastWork {
    protected int a, b, countOdd=0, countEven=0;
    protected int[] randNums = new int[40];
    public LastWork(int a, int b) {
        this.a = a;
        this.b = b;
        if(a>b){
            a+=b;
            b=a-b;
            a-=b;
        }
        for (int i=0; i<40; i++){
            randNums[i] = (int)(Math.random()*(b-a+1))+a;
        }
//        System.out.println(Arrays.toString(randNums));
        for (int i=0; i<randNums.length; i++){
            if(i==39){
                System.out.println(randNums[i]);
            }
            else{
                System.out.print(randNums[i]+", ");
            }
            if (randNums[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("ლუწები: "+countEven+" კენტები: "+countOdd);
    }
}
