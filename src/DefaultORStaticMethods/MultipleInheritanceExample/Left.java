package DefaultORStaticMethods.MultipleInheritanceExample;

public interface Left {
    default void m1(){
        System.out.println("Left interface method implementation..");
    }
}

