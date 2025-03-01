package CollectionWithLambda.SortingOurOwnObject;

public class Employee {
    String name;
    int eno;
    Employee( int eno,String name){
        this.name=name;
        this.eno = eno;
    }

    public String toString(){
        return eno+ " "+name;
    }
}

