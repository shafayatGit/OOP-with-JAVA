package Mid_241;

class Myparent {
    private int p;

    public final int myfunction() {
        return p * p;
    }

    public Myparent(int p) {
        this.p = p;
    }

    public Myparent() {

    }

    public int getP() {
        return p;
    }


    public void set_p(int Q) {
        p = Q;
    }
}

class Mychild extends Myparent {
    public Mychild(int K) {
        super(K);
    }

    public Mychild() {

    }

    public double myroot() {
        return Math.sqrt(getP());
    }
}

public class Qns_2 {
    public static void main(String[] args) {
        Myparent c1, c2;
        c1 = new Mychild(2);
        c2 = new Mychild();
        c2.set_p(2);
        int x = c2.myfunction();
        double y = ((Mychild) c1).myroot();
        System.out.println("x = " + x + ", y = " + y);
    }
}
