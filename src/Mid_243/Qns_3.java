package Mid_243;

class Operations {
    static int total = 20;

    static {
        System.out.println("Global Tech Academy");
    }

    static int square(int y) {
        return y * y;
    }

    public static void Increment() {
        total++;
        System.out.println(total);
    }
}

public class Qns_3 {
    public static void main(String[] args) {

        Operations.Increment();
        Operations obj1 = new Operations();
        obj1.Increment();
        Operations obj2 = new Operations();
        obj2.Increment();
        System.out.println(obj1.total);
        int result = Operations.square(Operations.total);
        System.out.println(result);
    }
    }

