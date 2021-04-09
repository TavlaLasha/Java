package gau;

import gau.Interfaces.InterfaceForB;

import java.util.Scanner;

public class B implements InterfaceForB {
    protected int a=33;
    double b=9.7;
    char s='#';

    @Override
    public void printS() {
        System.out.println("S: "+s);
    }

    @Override
    public void printA() {
        System.out.println("A: "+a);
    }

    @Override
    public void printB() {
        System.out.println("B: "+b);
    }

    @Override
    public void printAMinusB() {
        System.out.println("A-B: "+(a-b));
    }

    @Override
    public double retADivB() {
        return a/b;
    }

    @Override
    public void changeVars() {
        a=11;
        b=11.11;
        s='@';
    }

    @Override
    public void setA() {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        a=sc.nextInt();
    }

    @Override
    public void printBM10() {
        System.out.println(b+10);
    }
}
