
class Sum {
    int x, y, z;

    {
        System.out.println(x + y + z);
    }

    {
        x = 11;
        y = 22;
        z = 33;
        System.out.println(x + y + z);
    }

    public Sum(int x) {
        this.x = x;
        System.out.println(x + y + z);
    }

    public Sum(int x, int y) {
        this(500);
        this.x = x;
        this.y = y;
        System.out.println(x + y + z);
    }

    public Sum(int x, int y, int z) {
        this(50, 20);
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println(x + y + z);

    }


    public void display() {
        this.display("The pen is stronger than the sword.");
    }

    public void display(String str) {
        System.out.println(str);
    }

}


public class OutputsMID {
    public static void main(String args[]) {
        Sum s = new Sum(100, 150, 300);
        s.display();
    }
}

