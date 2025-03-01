package predicateExamples.userAuthentication;

import java.util.Scanner;
import java.util.function.Predicate;

public class AuthenticationTest {

    public static void main(String[] args){
        //we can also pass vcalues from database instead of hard coding them here
        Predicate<User> p= u->u.username.equals("priya") && u.pwd.equals("gautam");

    // take username and password from the User - command line
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter User Name:");
        String username=sc.next();
        System.out.println("Enter Password:");
        String pwd=sc.next();
        //Pass the values to User class via constructor to store the values
        User user=new User(username,pwd);
        //Call test() method now
        if(p.test(user))
        {
            System.out.println("Valid user and can avail all services");
        }
        else
        {
            System.out.println("invalid user you cannot avail services");
        }
    }
}
