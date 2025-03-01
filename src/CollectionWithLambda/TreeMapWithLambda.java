package CollectionWithLambda;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapWithLambda {

    public static void main(String[] args){
        TreeMap<Integer,String> m = new TreeMap<Integer,String>();
        m.put(100,"Ball");
        m.put(50,"Bat");
        m.put(200,"Stump");
        m.put(105,"Gloves");
        m.put(40,"Pitch");
        System.out.println("TREE MAP - DNSO : "+m);

        System.out.println("TREE MAP - CUSTOMIZED SORTING WITH LAMBDA : ");
        TreeMap<Integer,String> m1 = new TreeMap<Integer,String>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
        m1.put(100,"Ball");
        m1.put(50,"Bat");
        m1.put(200,"Stump");
        m1.put(105,"Gloves");
        m1.put(40,"Pitch");
        System.out.println(m1);


    }
}
