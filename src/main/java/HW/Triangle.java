package HW;

public class Triangle implements Figure{
    double a,b,c;

    public Triangle(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double Perimetr() {
        return a+b+c;
    }

    public double Ploshad() {
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
