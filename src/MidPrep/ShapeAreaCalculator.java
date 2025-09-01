package MidPrep;

class Shape {
    public double area() {
        return 0;
    }

    public String name() {
        return "Shape";
    }

}

class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle() {
        this.length = 0;
        this.length = 0;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area(int side) {
        return side * side;
    }

    public int area(int l, int w) {
        return l * w;
    }

    public double area() {
        return length * width;
    }

    public String name() {
        return "Rectangle";
    }
}

class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return (Math.PI * radius * radius);
    }

    public String name() {
        return "Circle";
    }
}

class Triangle extends Shape {
    public double base;
    public double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }

    public String name() {
        return "Triangle";
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Rectangle(4, 6);
        shape[1] = new Circle(3);
        shape[2] = new Triangle(3, 7);

        for (Shape sh : shape) {
            System.out.println(sh.name() + ": " + sh.area());
        }

        System.out.println(new Rectangle().area(5));
        System.out.println(new Rectangle().area(3,7));
    }
}
