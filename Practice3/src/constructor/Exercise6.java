package constructor;

public class Exercise6 {
    private float x, y, m;
    public Exercise6() {

    }
    public Exercise6(int x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Exercise6(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public float m1(){
        while(x!=y){
            if(x>y) x = x-y;
            else y = y-x;
        }
        return x;
    }
    public float m2(){
        m = x*y;
        return m/m1();
    }
}
