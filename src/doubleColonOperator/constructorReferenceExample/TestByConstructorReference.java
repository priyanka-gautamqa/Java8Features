package doubleColonOperator.constructorReferenceExample;

public class TestByConstructorReference {

    public static void main(String[] args){
        /*
        We want to use get() method without lambda expression. We want to create sample object using constructor reference
                Also another way to create object is by using new keyword
                */

        Interf i = Sample :: new; //get method is referring internally sample() constructor  to create object
        Sample s = i.get();

    }
}
