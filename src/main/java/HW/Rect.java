package HW;

public class Rect implements Figure{
    double a,b;
    public Rect(double a,double b) {
        this.a=a;
        this.b=b;
    }

    public double Ploshad() {
        return a*b;
    }

    public double Perimetr() {
        return 2*(a+b);
    }
}
