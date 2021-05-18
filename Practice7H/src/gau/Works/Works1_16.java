package gau.Works;

import gau.Lists.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Works1_16 extends A {
    public void m1(){
        System.out.println("-----Work 1-----");
        fillListWith5();
        printList();
    }
    public void m2(){
        System.out.println("-----Work 2-----");
        fillListWith5();
        printList();
        Collections.reverse(arr);
        printList();
    }
    public void m3(){
        System.out.println("-----Work 3-----");
        fillListWith5();
        sortASC();
        printList();
    }
    public void m4(){
        System.out.println("-----Work 4-----");
        fillListWith5();
        sortDESC();
        printList();
    }
    public void m5(){
        System.out.println("-----Work 5-----");
        fillListWith5();
        printList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        printList();
    }
    public void m6(){
        System.out.println("-----Work 6-----");
        fillListWith5();
        printList();
        for (int i = 0; i < arr.size(); i++) {
            if(i%2!=0){
                arr.add(i, (int)(Math.random()*101));
            }
        }
        printList();
    }
    public void m7(int n){
        System.out.println("-----Work 7-----");
        fillListWith5();
        printList();
        arr.add(n+1, (int)(Math.random()*101));
        printList();
    }
    public void m8(){
        System.out.println("-----Work 8-----");
        fillListWith5();
        printList();
        int i = 0;
        for (Iterator<Integer> iter = arr.iterator(); iter.hasNext();) {
            Integer el = iter.next();
            if(i<3){
                iter.remove();
            }else{break;}
            i++;
        }
        printList();
    }
    public void m9(int n){
        System.out.println("-----Work 9-----");
        fillListWith5();
        printList();
        arr.remove(n);
        printList();
    }
    public void m10(){
        System.out.println("-----Work 10-----");
        fillListWith5();
        printList();
        int i = 0;
        for (Iterator<Integer> iter = arr.iterator(); iter.hasNext();) {
            Integer el = iter.next();
            if(i%2==0){
                iter.remove();
            }
            i++;
        }
        printList();
    }
    public void m11(){
        System.out.println("-----Work 11-----");
        fillListWith5();
//        arr.add(30);
        printList();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 30){
                arr.remove(i);
            }
        }
        printList();
    }
    public void m12(){
        System.out.println("-----Work 12-----");
        fillListWith20();
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 7; i < arr.size(); i++) {
            newArr.add(arr.get(i));
            if(i==15){break;}
        }
        printList();
        printList(newArr);
    }
    public void m13(){
        System.out.println("-----Work 13-----");
        fillListWith20s();
        ArrayList<String> newArr = new ArrayList<>();
        for (String s : arrs) {
            if (s.contains("x")) {
                newArr.add(s);
            }
        }
        printList(arrs);
        printList(newArr);
    }
    public void m14(Integer num){
        System.out.println("-----Work 14-----");
        String str = num.toString();
        StringBuilder newStr= new StringBuilder();
        for (int i=str.length()-1; i>=0; i--) {
            newStr.append(str.charAt(i));
        }
        System.out.println("თავდაპირველი: " + str);
        System.out.println("შებრუნებული: " + newStr);
        if(str.equals(newStr.toString())){
            System.out.println("რიცხვი პოლიდრომია");
        }
        else{
            System.out.println("რიცხვი არ არის პოლიდრომი");
        }
    }
    public void m15(){
        System.out.println("-----Work 15-----");
        int[][] arr = new int[6][5];

        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr[0].length-1; j++){
                arr[i][j] = (int)(Math.random()*101);
            }
        }
        System.out.println("Before");
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr[0].length-1; j++){
                if(j!=arr[0].length-1){
                    System.out.print(arr[i][j] + ", ");
                }
                else{
                    System.out.println(arr[i][j]);
                }
            }
        }

        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr.length-1; j++){
                int tmp = 0;
                if (arr[i][0] > arr[j][0])
                {
                    for(int k=0; k<=arr[0].length-1; k++) {
                        tmp = arr[i][k];
                        arr[i][k] = arr[j][k];
                        arr[j][k] = tmp;
                    }
                }
            }
        }
        System.out.println("After");
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr[0].length-1; j++){
                if(j!=arr[0].length-1){
                    System.out.print(arr[i][j] + ", ");
                }
                else{
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
    public void m16(){
        int[] arry = new int[100];
        int count=0;
        for (int i=0; i<arry.length; i++) {
            arry[i] = (int)(Math.random()*100);
            if(arry[i] > i){count++;}
        }
        System.out.println(Arrays.toString(arry));
        System.out.println("There are " + count + " numbers that are higher than its index.");

    }
}
