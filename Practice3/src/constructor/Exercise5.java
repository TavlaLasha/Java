package constructor;

public class Exercise5 {
    private float x, y, m;
    public Exercise5() {

    }
    public Exercise5(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public double m1(){
        if(y != 0){
            return x/y+x*y;
        }
        else if(x<=0){
            return Math.pow(x, 4)+y;
        }
        else{
            return 0;
        }
    }
    public float m2(){
        return Math.min(x, y);
    }
}
