package constructor;

public class Exercise1 {
    private int x;
    public Exercise1(int x) {
        this.x = x;
        System.out.println("Hello My Class");
    }
    public void m1() {
        if(x%2 != 0){
            System.out.println("x is odd");
        }else{
            System.out.println("x is even");
        }
    }
}
