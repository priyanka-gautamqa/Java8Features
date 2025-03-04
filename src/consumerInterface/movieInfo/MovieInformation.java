package consumerInterface.movieInfo;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieInformation {

    public static void populate(ArrayList<Movie> l ){
        l.add(new Movie("Bahubali","Prabhas","Anushka"));
        l.add(new Movie("Rayees","Sharukh","Sunny"));
    l.add(new Movie("Dangal","Ameer","Ritu"));
    l.add(new Movie("Sultan","Salman","Anushka"));

    }


    public static void main(String[] args){

        ArrayList<Movie> movieList = new ArrayList<Movie>();
        populate(movieList);

        /*m is movie object, we are providing movie object as argument
        It is not returning anything. It is printing.*/
        Consumer<Movie> c = m->{
            System.out.println(" Movie name  "+ m.name);
            System.out.println("Hero name : "+ m.hero);
            System.out.println("Heroine name : "+ m.heroine);
            System.out.println("============================ ============================= ============");
        };

       /* Now movieList is an arraylist containing all movie objects.
                We will call accept method for each movie object present in the arraylist*/
        for(Movie m : movieList){
            c.accept(m);
        }


    }

}
