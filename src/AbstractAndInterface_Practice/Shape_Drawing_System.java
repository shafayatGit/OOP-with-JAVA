package AbstractAndInterface_Practice;

abstract class Shape {
    String name;
    double area;

    abstract public double area();

    public void printArea() {
        System.out.println("Name:" + name + " Area:" + area);
    }
}

class Circle extends Shape {
    double radius;

    public double area() {
        area = radius * radius;
        return area;
    }
}

class Rectangle extends Shape {
    double length, width;

    public double area() {
        area = length * width;
        return area;
    }
}

public class Shape_Drawing_System {
    public static void main(String[] args) {
        Shape c1 = new Circle();
        ((Circle) c1).radius = 10;
        Shape r1 = new Rectangle();
        ((Rectangle) r1).length = 5;
        ((Rectangle) r1).width = 5;

        Shape[] shape = {c1, r1};

        for (Shape s : shape) {
            System.out.println(s.area());
        }
    }
}
