package Thread;

class tryThread implements Runnable{
    public void run(){
        for(int i =1; i<11; i++){
            System.out.println(i);
        }
    }
}

public class Practice {
    public static void main(String[] args) {
    tryThread thread = new tryThread();
    Thread th = new Thread(thread);
    try{
        th.start();
        th.join();
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    }
}
