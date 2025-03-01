package functionInterface.findStudentGrade;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class GradeTest {

    public static void populate(ArrayList<Student> l){

        l.add(new Student("Sunny",100));
        l.add(new Student("Bunny",65));
        l.add(new Student("Chinny",55));
        l.add(new Student("Vinny",45));
        l.add(new Student("Pinny",25));

    }

    public static void displayGrade(Function<Student,String> f,ArrayList<Student> al){
        for(Student s : al){
            System.out.println("-------------------INFORMATION ---------------");
            System.out.println("NAME : "+s.name);
            System.out.println("MARKS : "+s.marks);
            System.out.println("GRADE : "+f.apply(s));


        }
    }

    public static void main(String[] args){

        ArrayList<Student> students = new ArrayList<Student>();
        populate(students);
        Function<Student,String> grade = stu-> {
            int marks = stu.marks;
            if(marks>=80){
                return "A [Distinction] ";
            }
            else if(marks>=60){
                return "B [First Class] ";
            }
            else if (marks>=50) {
                return "C [Second class] ";
                
            }
            else if(marks>=35){
                return "D [Third class] ";
            }
    else return "E [Failed] ";
        };

displayGrade(grade,students);

/*
 Write a predicate to check information of students
having marks greater than 60
*/
        System.out.println("=================================== Information of students having marks greater than 60 =======================================");
        Predicate<Student> p = s->s.marks>=60;
        for(Student s : students){
            if(p.test(s)){
                System.out.println("-------------------INFORMATION ---------------");
                System.out.println("NAME : "+s.name);
                System.out.println("MARKS : "+s.marks);
                System.out.println("GRADE : "+grade.apply(s));
            }
        }


    }
}
