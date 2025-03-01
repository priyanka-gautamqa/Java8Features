package CollectionWithLambda;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
//No need of this class while using lambda expressions
    public int compare(Integer n1,Integer n2){
        if(n1<n2)
            return -1;
        else if(n1>n2)
            return 1;
        else
            return 0;
    }
}
