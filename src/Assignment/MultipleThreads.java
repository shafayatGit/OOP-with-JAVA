package Assignment;
import java.util.Random;
import java.util.Scanner;

class PartialSum implements Runnable{
    int first;
    int last;
    int[] arr;
    static int total = 0;
    int sum = 0;

    public PartialSum(int first, int last, int[] arr) {
        this.first = first;
        this.last = last;
        this.arr = arr;
    }

    public void run()
    {

        for (int i = first; i <= last; i++) {
            sum += arr[i];
        }
        System.out.println(Thread.currentThread().getName()+": "+first+"-"+last+" -> partial sum = "+ sum);
        total+=sum;
    }

}

public class MultipleThreads {
    public static void main(String[] args) throws InterruptedException {
        int n, k;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        int[] arr = new int[n];
        Thread[] threads = new Thread[k];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(20)+1;
        }
        sc.close();

        int av = n/k;

        for (int i = 0, j=0; j < k; i+=av, j++) {
            if(j == k-1)
            {
                threads[j] = new Thread(new PartialSum(i,n-1, arr), "Thread-"+(j+1));
            }
            else
            {
                threads[j] = new Thread(new PartialSum(i,i+av-1, arr), "Thread-"+(j+1));
            }

            threads[j].start();
            threads[j].join();
        }

        System.out.println("Total Sum = " + PartialSum.total);

    }
}