package constructor;

public class Exercise2 {
    private int x;
    public Exercise2() {

    }
    public Exercise2(int x) {
        this.x = x;
    }
    public void m1() {
        if(x>5 & x < 24){
            System.out.println("It does!");
        }
        else{
            System.out.println("It does not.");
        }
    }
}
