package HW;

public class Motemotichka {
    public static void main(String[] args) {
        Circle circle = new Circle(10.0);
        System.out.println("Площадь круга"+circle.Ploshad()+" Периметр Круга: "+circle.Perimetr());
        Rect rect= new Rect(2,3);
        System.out.println("Площадь прямоугольника "+rect.Ploshad()+" Периметр прямоугольника: "+rect.Perimetr());
        Square pans = new Square(3);
        System.out.println("Площадь крадрата: "+pans.Ploshad()+" Периметр квадрата: "+pans.Perimetr());
        Triangle tri= new Triangle(4,5,6);
        System.out.println("Площадь треугольника: "+tri.Ploshad()+" Периметр треугольника: "+tri.Perimetr());
    }
}
