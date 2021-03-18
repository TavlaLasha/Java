package inheritance3;

public class B extends A {
    public int m1(){
        return (y-x)/3;
    }
    public double m2(){
        return (Math.pow(x,2)+2*y)/5;
    }
    public void printX(){
        System.out.println("x= "+x);
    }
}
