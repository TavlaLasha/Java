package gau;

public class A implements InterfaceForA{
    protected int a=10, b=29;
    @Override
    public void printHello() {
        System.out.println("Hello OOP");
    }

    @Override
    public void printA() {
        System.out.println("a: "+a);
    }

    @Override
    public void printB() {
        System.out.println("b: "+b);
    }

    @Override
    public void printABSum() {
        System.out.println("a+b= "+(a+b));
    }

    @Override
    public int retABSum() {
        return a+b;
    }

    @Override
    public int retABMult() {
        return a*b;
    }

    @Override
    public void printAB() {
        a=5;
        b=6;
    }
}
