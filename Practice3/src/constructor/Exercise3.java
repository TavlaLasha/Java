package constructor;

public class Exercise3 {
    private int x, a, b;
    public Exercise3() { }
    public Exercise3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void m1() {
        if(a<b){
            System.out.println("It does!");
        }
        else{
            System.out.println("It does not.");
        }
    }
    public void m2() {
        if(x>a & x < b){
            System.out.println("It does!");
        }
        else{
            System.out.println("It does not.");
        }
    }
}
