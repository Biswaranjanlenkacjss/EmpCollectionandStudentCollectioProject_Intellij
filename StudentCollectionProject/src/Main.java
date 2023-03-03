import com.models.FeeDetails;
import com.models.Student;
import com.models.SubjectMarks;
import com.models.Subjects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //========================================================================================================
        //For Subject marks

        //Subject Marks For  DSA
        SubjectMarks subDSAMark=new SubjectMarks(100,85);

        //Subject Marks For  DAA
        SubjectMarks subDAAMark=new SubjectMarks(100,65);

        //Subject Marks For  Java
        SubjectMarks subJAVAMark=new SubjectMarks(100,90);

        //Subject Marks For  SAP
        SubjectMarks subSAPMark=new SubjectMarks(100,55);



     //========================================================================================================
        //For Subjects

        //Subjects and Marks For student 1
        List<Subjects> subjectsList1=new ArrayList<>();
        subjectsList1.add(new Subjects("DSA01","Data Strucre And Algorithm",subDSAMark));
        subjectsList1.add(new Subjects("DSA02","Design And  Analysis Of Algorithm",subDAAMark));

        //Subjects and Marks For student 2
        List<Subjects> subjectsList2=new ArrayList<>();
        subjectsList2.add(new Subjects("JAVA03","Object Oriented JAVA Language ",subJAVAMark));
        subjectsList2.add(new Subjects("SAP04","System Application And Product",subSAPMark));

        //Subjects and Marks For student 3
        List<Subjects> subjectsList3=new ArrayList<>();
        subjectsList3.add(new Subjects("JAVA03","Object Oriented JAVA Language ",subJAVAMark));

        //Subjects and Marks For student 4
        List<Subjects> subjectsList4=new ArrayList<>();
        subjectsList4.add(new Subjects("JAVA03","Object Oriented JAVA LAnguage ",subJAVAMark));
        subjectsList4.add(new Subjects("DSA01","Data Strucre And Algorithm",subDSAMark));

        //==========================================================================================================
        //Fee Details

        //FeeDetails For Student 1
        List<FeeDetails> fee1=new ArrayList<>();
        fee1.add(new FeeDetails(250000.0, LocalDate.of(2019,8,21)));

        //FeeDetails For Student 2
        List<FeeDetails> fee2=new ArrayList<>();
        fee2.add(new FeeDetails(350000.0, LocalDate.of(2020,12,31)));

        //FeeDetails For Student 3
        List<FeeDetails> fee3=new ArrayList<>();
        fee3.add(new FeeDetails(450000.0, LocalDate.of(2010,9,8)));

        //FeeDetails For Student 4
        List<FeeDetails> fee4=new ArrayList<>();
        fee4.add(new FeeDetails(150000.0, LocalDate.of(2016,6,16)));

//=============================================================================================================
      //  Student Details

        List<Student> studentList=new ArrayList<>();
        //student 1
        studentList.add(new Student(100,"Biswa","MCA",1,fee1,subjectsList1));

        //student 2
        studentList.add(new Student(101,"Sai","ME",4,fee2,subjectsList2));

        //student 3
        studentList.add(new Student(102,"Manoj","Civil",3,fee3,subjectsList3));

        //student 4
        studentList.add(new Student(103,"Ranjit","EEE",2,fee4,subjectsList4));

       // System.out.println(studentList);
       //=============================================================================================================
        /*
       //Task 1: Print student rno, name, branch of 1st year students
 */
        System.out.println("Student Details Who Are in 1st Year");
        System.out.println("===============================");
        StringBuilder sb1=new StringBuilder();

        studentList.stream().filter(stu->  stu.getYear()==1 ).forEach(stu1->{
            sb1.append("\nStudent Name:").append(stu1.getName()).append("\nStudent RollNo:").append(stu1.getRollno()).append("\nStudent Branch:").
                    append(stu1.getBranch()).append("\nStudent Year:").append(stu1.getYear()+"\n");
        });

        System.out.println(sb1);


        //=============================================================================================================
        /*
        Task 2: Print all students rno, name, branch, amount, date
  */
        System.out.println("All Student RollNo,Name,Branch,Amount,Date");
        System.out.println("=======================================");
        StringBuilder sb2=new StringBuilder();

        studentList.stream().forEach(stu2->{
            stu2.getFeeDetails().stream().forEach(fee->{
                sb2.append("\nStudent Name:").append(stu2.getName()).append("\nStudent RollNo:").append(stu2.getRollno()).append("\nStudent Branch:").
                        append(stu2.getBranch()).append("\nStudent Fee Amount:").append(fee.getFeeAmount()).
                          append("\nFee Date:").append(fee.getDate()+"\n");
            });
        });
        System.out.println(sb2);

//===============================================================================================================
 /*
Task 3: Print all students rno, name, subjectName, marks
*/
        System.out.println("All Student RollNo,Name,SubjectName,Marks");
        System.out.println("=======================================");
        StringBuilder sb3=new StringBuilder();

        studentList.stream().forEach(stu->{
            stu.getSubjects().stream().forEach(sub->{
                sb3.append("\nStudent Name:").append(stu.getName()).append("\nStudent RollNo:").append(stu.getRollno()).
                        append("\nSubject Name:").append(sub.getSubjectName()).  append("\nSubject Total Mark:").append(sub.getSubjectMarks().getTotalMark()).
                    append("\nSubject Obtain Mark:").append(sub.getSubjectMarks().getObtainMark()+"\n")    ;
            });
        });
        System.out.println(sb3);

//================================================================================================================
        /*
        Task 4: Print all students rno, name, subjectName, marks order by year
     */
        System.out.println("All Student RollNo,Name,SubjectName,Marks Order by Year");
        System.out.println("================================================");
        StringBuilder sb4=new StringBuilder();

        studentList.stream().sorted(Comparator.comparing(stu->{
           return stu.getYear();
        })).forEach(stu->{
            sb4.append("\nStudent Name:").append(stu.getName()).append("\nStudent RollNo:").append(stu.getRollno()).append("\nStudent Year:").append(stu.getYear());
           stu.getSubjects().forEach(sub->{
                       sb4.append("\nSubject Name:").append(sub.getSubjectName()).  append("\nSubject Total Mark:").append(sub.getSubjectMarks().getTotalMark()).
                       append("\nSubject Obtain Mark:").append(sub.getSubjectMarks().getObtainMark()+"\n");
           });
           sb4.append("=====================================");
        });
        System.out.println(sb4);


        //================================================================================================================

    }//end of main
}