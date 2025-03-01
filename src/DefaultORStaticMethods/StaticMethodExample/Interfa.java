package DefaultORStaticMethods.StaticMethodExample;

import DefaultORStaticMethods.Interf;

public interface Interfa {
    public static void m1(){
        System.out.println("Static method..");
    }
}

class Test{
    public static void main(String[] args){
        //m1(); // Compile time error
        //Test t = new Test();
        //t.m1(); // compile time error
       // Test.m1();//Compile time error
        Interfa .m1();
    }
}
