package consumerInterface.StudentInfoPFC;

public class StudentInfo {

 /* >= 80 - A
    >= 60 - B
    >= 50 - C
    >= 35 - D
    < 35 - E*/

    String name;
    int marks;

    StudentInfo(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
}
