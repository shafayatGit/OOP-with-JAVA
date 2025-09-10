package Mid_241;

class Point2D {
    int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Point2D constructor");
    }

    public String Display() {
        return "x= " + x + "," + " y= " + y;
    }
}

class Point3D extends Point2D {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.println("Point3D constructor");
    }

    public String Display() {
        return super.Display() + "," + " z= " + z;
    }
}

public class Qns_1 {
    public static void main(String args[]) {
        Point2D p2D = new Point2D(1, 2);
        System.out.println(p2D.Display());
        Point3D p3D = new Point3D(5, 4, 3);
        System.out.println(p3D.Display());
    }
}
