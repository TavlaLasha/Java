package inheritance;

public class B extends A {
    public B(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int m1(){
        return y-x;
    }
    public int m2(){
        return x+2*y;
    }
}
