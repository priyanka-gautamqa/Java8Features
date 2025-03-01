package AnonymousMultithreadingExample;

public class Test1 {
        //Without using MyRunnable implementation class
        public static void main(String[] args){
           Runnable r=()->{
               for (int i=0;i<10;i++){
                   System.out.println("Child thread..with lambda expression");
               }
           };
           Thread t = new Thread(r);
            t.start();
            for (int i=0;i<10;i++){
                System.out.println("Main thread..");
            }
        }

//        Thread t1= new Thread(()-> {
//            for (int i=0;i<10;i++){
//                System.out.println("Child thread..with lambda expression");
//            }
//        });


}
