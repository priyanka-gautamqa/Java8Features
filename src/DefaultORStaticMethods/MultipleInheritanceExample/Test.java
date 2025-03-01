package DefaultORStaticMethods.MultipleInheritanceExample;

public class Test implements Left, Right {
    @Override
    public void m1() {
       /*
         Left.super.m1();
         Right.super.m1();
        */
        System.out.println("My own class implementation");
    }
    public static void main(String[] args){
        Test t = new Test();
        t.m1();
    }
}
