package constructor;

public class Exercise4 {
    private int x, y;
    public Exercise4() {
        System.out.println("Hello My Class");
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int m1(){
        if(x>0){
            return 4*x-y;
        }
        else{
            return 2*x+y;
        }
    }
    public int m2(){
        if(y>0){
            return 4*x+y;
        }
        else{
            return 2*x-y;
        }
    }
}
