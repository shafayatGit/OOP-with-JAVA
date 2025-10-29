package Thread;

class sumOfEven extends Thread{
    int evenSum=0;
    public void run(){
        for(int i = 2; i<=50 ; i+=2){
            evenSum = evenSum + i;
        }
    }

    public int getEvenSum(){
        return evenSum;
    }
}
class sumOfOdd extends Thread{
    int oddSum = 0;
    public void run(){
        for(int i = 1; i<=50 ; i+=2){
            oddSum = oddSum + i;
        }
    }
    public int getOddSum(){
        return oddSum;
    }
}

public class Practice_2 {
    public static void main(String[] args) {
        sumOfEven even = new sumOfEven();
        sumOfOdd odd = new sumOfOdd();
        int total;
        try {
            even.start();
            odd.start();

            even.join();
            odd.join();

            total = odd.getOddSum() - even.getEvenSum();
            System.out.println(total);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
