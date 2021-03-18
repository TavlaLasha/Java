package inheritance3;

public class C extends B {
    double z, r;

    public void setZ(double z) {
        this.z = z;
    }
    public void setR(double r) {
        this.r = r;
    }

    public double maxNum(){
        return Math.max(Math.max(x, y), Math.max(z,r));
    }
    public double m22(){
        return (Math.pow(x,2)+2*y)/(z-r);
    }
    public double m3(){
        return m1()+(r/(z+4));
    }
}
