package DefaultORStaticMethods;

public interface Interf {
    default void m1(){
        System.out.println("DEFAULT METHOD IN INTERFACE");
    }
}

class Test implements Interf{
    @Override
    public void m1() {
        System.out.println("MY OWN IMPLEMENTATION...");
    }
    public static void main(String[] args){
        DefaultORStaticMethods.MultipleInheritanceExample.Test t = new DefaultORStaticMethods.MultipleInheritanceExample.Test();
        t.m1();
        //if we will not override it then interface implementation will be used
    }
}
