package HW;

public class Circle implements Figure{
    double r;

    public Circle(double v) {
        this.r=v;
    }

    public double Ploshad() {
        return Math.PI*r*r;
    }
    public double Perimetr() {
        return 2*Math.PI*r;
    }

}
