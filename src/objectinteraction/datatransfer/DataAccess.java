package objectinteraction.datatransfer;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
	
   //List as database
   List<Student> students;

   public DataAccess(){
      students = new ArrayList<Student>();
      Student student1 = new Student("Robert",0);
	  Student student2 = new Student("John",1);
	  students.add(student1);
	  students.add(student2);
   }
   
   public Student getStudent(int rollNo) {
	   return students.get(rollNo);
   }
   
   public List<Student> getAllStudents() {
	   return students;
   }

   public void updateStudent(Student student) {
	   students.get(student.getRollNo()).setName(student.getName());
	   System.out.println("Student: Roll No " + student.getRollNo() +", updated in the database");
   }
   
   public void deleteStudent(Student student) {
	   students.remove(student.getRollNo());
	   System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
   }
}
