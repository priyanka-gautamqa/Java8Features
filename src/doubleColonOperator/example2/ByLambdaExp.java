package doubleColonOperator.example2;

public class ByLambdaExp {

    public static void main(String[] args){
        Runnable r = ()-> {
            for(int i=0;i<10;i++){
                System.out.println("Child Thread...."+i);
            }
        };
        Thread t = new Thread(r); //child thread called
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread..... "+i);
        }

    }

}
