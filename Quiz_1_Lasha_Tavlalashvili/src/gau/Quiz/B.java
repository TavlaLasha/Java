package gau.Quiz;

public class B extends A{
    protected int y;
    public B(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setY() {
        y = (int)(Math.random()*1001);
    }
    public int printXPlusY(){
        return x+y;
    }
}
