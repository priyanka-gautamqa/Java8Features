package doubleColonOperator.example1;

public class MethodReferenceExample1 {

   /* For method reference -
            methods should have same argument type
            */
   public static void m2(){
       System.out.println("Method reference");
   }

    public static void main(String[] args){

      /* InterfaceMethodReferExPart1 i = here we have to provide m1 implementation
                                        one way is to use lambda expression
                                        = ()-> { System.out.println("Lambda expression");}
                                        */
        //Other way -
       /* We want to use m2 method as the implementation for m1.
         Then we call static method m2 using class name
         Operator is for method reference saying that
                - refer m2 for the implementation of m1 as we are not providing separately impl

         Condition For methods reference - argument type should be same
                */
        InterfaceMethodReferExPart1 i = MethodReferenceExample1::m2;
        i.m1();




    }

}
