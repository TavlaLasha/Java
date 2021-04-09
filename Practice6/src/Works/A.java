package Works;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A {
    protected String addr = "src/myFiles";
    public boolean creteFolder(){
        File f = new File(addr);
        return f.mkdir();
    }

    public void m1(){
        try {
            FileWriter wrt = new FileWriter(addr+"/data.txt");
            wrt.write("24, 39, -90");
            wrt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void m2(){
        try {
            FileWriter wrt = new FileWriter(addr+"/data1.txt");
            for (int i = 0; i<=100; i++){
                Integer ig = i;
                wrt.write(ig.toString()+" ");
                ig = null;
            }
            wrt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void m5(){
        int min, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("min: ");
        min = sc.nextInt();
        System.out.print("max: ");
        max = sc.nextInt();

        try {
            FileWriter wrt = new FileWriter(addr+"/data2.txt");
            for (int i = 0; i<100; i++){
                Integer ig = (int)Math.floor(Math.random()*(max-min+1)+min);
                wrt.write(ig.toString()+", ");
                ig = null;
            }
            wrt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void m6(){
        int min, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("min: ");
        min = sc.nextInt();
        System.out.print("max: ");
        max = sc.nextInt();

        try {
            FileWriter wrt = new FileWriter(addr+"/data3.txt", true);
            wrt.write("\nNew From Here\n");
            for (int i = 0; i<50; i++){
                Integer ig = (int)Math.floor(Math.random()*(max-min+1)+min);
                wrt.write(ig.toString()+", ");
                ig = null;
            }
            wrt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void m7(){
        try {
            FileWriter wrt = new FileWriter(addr+"/function.txt", true);
            wrt.write("\nFormula: y= x^3 + e^x\n");
            StringBuilder sb = new StringBuilder();
            double x = Math.random()*2;
            sb.append((Math.pow(x, 3)+Math.exp(x)));
            wrt.write("x= "+ x +"\ny= "+ sb);
            wrt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void m8(){
        try {
            FileWriter wrt = new FileWriter(addr+"/function.txt", true);
            wrt.write("\nFormula: y= sin(x) + e^x\n");
            StringBuilder sb = new StringBuilder();
            double x = Math.random()*2;
            sb.append((Math.sin(x)+Math.exp(x)));
            wrt.write("x= "+ x +"\ny= "+ sb);
            wrt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void m9(){
        try {
            for (int i = 1; i<=10000; i++){
                FileWriter wrt = new FileWriter(addr+"/"+i+".txt");
                Integer ig = i;
                wrt.write(ig.toString()+" ");
                ig = null;
                wrt.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void m10(int num){
        System.out.println("Binary of "+num+" is: "+Integer.toBinaryString(num));
    }
    public void m11(String bin){
        System.out.println("Decimal of "+bin+" is: "+Integer.parseInt(bin,2));
    }
}
