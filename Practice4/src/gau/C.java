package gau;

import gau.Interfaces.InterfaceForC;

import java.util.Scanner;

public class C implements InterfaceForC {
    private int a=10,b=9;
    private char s='#', h='@';
    private Scanner sc;

    @Override
    public void printAB(){
        System.out.println("a: "+a+" b: "+b);
    }
    @Override
    public void printSH(){
        System.out.println("c: "+s+" h: "+h);
    }

    @Override
    public void printABoperation() {
        System.out.println((a+b)+"\n"+(a*b)+"\n"+((a*1.0)/b)+"\n"+(a%b));
    }

    @Override
    public void setA() {
        sc = new Scanner(System.in);
        a = sc.nextInt();
    }

    @Override
    public void setB() {
        sc = new Scanner(System.in);
        b = sc.nextInt();
    }

    @Override
    public void setSH() {
        sc = new Scanner(System.in);
        s = sc.next().charAt(0);
        h = sc.next().charAt(0);
    }
}
