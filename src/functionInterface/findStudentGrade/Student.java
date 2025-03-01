package functionInterface.findStudentGrade;

public class Student {

   /* >= 80 - A
    >= 60 - B
    >= 50 - C
    >= 35 - D
    < 35 - E*/

    String name;
    int marks;

    Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }

}
