package inheritance;

public class C extends B {
    double z=8;

    public C(int x, int y) {
        super(x, y);
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double m3(){
        return (x+y+z)/3;
    }
    public double m4(){
        return (x*y*z)/3;
    }
    public double m5(){
        return Math.max(Math.max(x,y),z);
    }
}
