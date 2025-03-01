package functionInterface.functionalChainingExamples;

import java.util.Scanner;
import java.util.function.Function;

public class ExampleThree
{
    public static void main(String[] args) {

    /*username requirements : consider first 5 letters only
            case doesnt matter
                it should be "durga"

      password requirements : should always be java*/

      //function to convert the provided username into lowercase and take first 5 characters
    Function<String,String> f1= s->s.toLowerCase();
    Function<String,String> f2= s->s.substring(0,5);

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter User Name:");
    String username=sc.next();

    System.out.println("Enter Password:");
    String pwd=sc.next();

    if(f1.andThen(f2).apply(username).equals("durga") && pwd.equals("java"))
    {
        System.out.println("Valid User");
    }
    else
    {
        System.out.println("Invalid User");
    }
}
}