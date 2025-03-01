package Session1;

public class Test {
    public static void main(String[] args){
       /*Demo1 d=new Demo1();
       d.m1();*/
       Interf1 i = () ->  System.out.println("Without Creating implementation class for the  Interf1");
       i.m1();

        Interf2 i2 = ( a, b) ->  System.out.println("THE SUM IS : "+(a+b));
        i2.add(10,20);

        Interf3 i3 = n -> n*n;
        System.out.println(i3.squareIt(10));
    }
}
