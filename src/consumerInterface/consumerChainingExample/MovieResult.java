package consumerInterface.consumerChainingExample;

import java.util.function.Consumer;

public class MovieResult {

    public static void main(String[] args){
        Consumer<MovieInfo> c1 = m->System.out.println("Movie : "+m.name + " is ready  to release");
        Consumer<MovieInfo> c2 = m->System.out.println("Movie : "+m.name + " has been released and it is a "+ m.result);
        Consumer<MovieInfo> c3 = m->System.out.println("Movie : "+m.name + " Information is storing in the database.");

        MovieInfo m1= new MovieInfo("Bahubali","HIT");
        MovieInfo m2 = new MovieInfo("Spider","FLOP");

        Consumer<MovieInfo> chainedConsumer =  c1.andThen(c2).andThen(c3);
        chainedConsumer.accept(m1);
        System.out.println();
        chainedConsumer.accept(m2);
    }
}
