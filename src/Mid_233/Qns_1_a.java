package Mid_233;

class Logarithm{
    int b,x;

    public Logarithm(int b, int x){
        this.b = b;
        this.x= x;
    }

    public Logarithm(Logarithm log1){
        this.x = log1.x;
        this.b= log1.b;
    }

    public Logarithm(){

    }



    public double myfun(){
        if(b > 0 && x>0){
            return (Math.log(x)/Math.log(b));
        }
        else {
            return 0;
        }
    }
}

public class Qns_1_a {
    public static void main(String[] args) {
        {
            Logarithm log1 = new Logarithm(2, 9);
            Logarithm log2 = new Logarithm(log1);
            Logarithm log3 = new Logarithm();
            System.out.println(log1.b +" "+log1.x+" "+(int)log1.myfun());
            System.out.println(log2.b +" "+log2.x+" "+(int) log2. myfun());
            System.out.println(log3.b +" "+log3.x+" "+(int)log3. myfun());
        }
    }
}
