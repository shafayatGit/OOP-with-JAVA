package Final;

interface Computable {
int compute(int a, int b);
}

interface AdvancedComputable extends Computable{
    int max(int a, int b);
}


abstract class Processor {
    protected String id;
    public Processor(String id) {
        this.id = id;
    }
    public abstract void process();
    public void printId() {
        System.out.println("Processor ID: " + id);
    }
}

class Adder extends Processor implements AdvancedComputable{

    public Adder(String id) {
        super(id);
    }

    public void process(){
        System.out.println("Processing Addition");
    }

    public int max(int a , int b){
    if(a>b) return a;
    return b;
    }

    public int compute(int a , int b){
        return a+b;
    }

}

public class Final_251_3 {
    public static void main(String[] args) {

    }
}
