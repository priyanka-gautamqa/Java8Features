package DefaultORStaticMethods.MultipleInheritanceExample;

public interface Right {
    default void m1(){
        System.out.println("Right interface method implementation..");
    }
}
