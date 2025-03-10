package doubleColonOperator.constructorReferenceExample;

public class TestByLambdaExpresion {

    public static void main(String[] args){

        /*we want to use get() method of interface - we need to provide implementation for that.
            get() method return type is Sample -> tells that it should return Sample object
        */

        Interf i = ()->{
          Sample s = new Sample();
          return s;
        };

        Sample s1 = i.get();

    }
}
