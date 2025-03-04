package consumerInterface.StudentInfoPFC;

import functionInterface.findStudentGrade.Student;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class GradeTest {

    public static void populate(ArrayList<StudentInfo> l){

        l.add(new StudentInfo("Sunny",100));
        l.add(new StudentInfo("Bunny",65));
        l.add(new StudentInfo("Chinny",55));
        l.add(new StudentInfo("Vinny",45));
        l.add(new StudentInfo("Pinny",25));

    }

    public static void main(String[] args){

        ArrayList<StudentInfo> students = new ArrayList<StudentInfo>();
        populate(students);

/*
        1.Find grade of the students - Function because we are accepting marks and returning grade
        2.Display info of each student - Consumer as we just have to display
        3.Display student information if grade is marks is greater than 60 - Predicate as condition is involved
*/

        //stu is the StudentInfo object
        Predicate<StudentInfo> p = stu->stu.marks>60;

      //  This function takes StudentInfo as argument and return String that is grade of the student, stu is StudentInfo object
        Function<StudentInfo, String> f = stu->{
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

       // Display info of each student ,
        Consumer<StudentInfo> c = stu->{
            System.out.println("Student name : "+stu.name);
            System.out.println("Student marks : "+stu.marks);
            System.out.println("Student grade : "+f.apply(stu));
            System.out.println("============ =================== =====================");

        };

        System.out.println("Display student information if grade is marks is greater than 60 ");
        for(StudentInfo studentInfo : students){
            if(p.test(studentInfo)){
                c.accept(studentInfo);
            }
        }

        System.out.println();
        System.out.println("Display all students information");
        for(StudentInfo studentInfo : students){
                c.accept(studentInfo);
        }

    }
}
