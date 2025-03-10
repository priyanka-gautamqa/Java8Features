package doubleColonOperator.example2;

public class ByMethodReference {

    //we want to use m1 as the impl of run() method present in Runnable interface
    public void m1(){
        for(int i=0;i<10;i++){
            System.out.println("ByMethodReference Child Thread..... "+i);
        }
    }
    public static void main(String[] args){
        ByMethodReference b = new ByMethodReference();
        Runnable r = b::m1;
        Thread t = new Thread(r); //child thread called
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread..... "+i);
        }
    }
}
