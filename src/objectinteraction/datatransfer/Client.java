package objectinteraction.datatransfer;

public class Client {
	public static void main(String[] args) {
		DataAccess dataAccess = new DataAccess();

		// Print all students via Data Access
		for (Student student : dataAccess.getAllStudents()) {
				System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}

		// Update student via Data Access
		Student student = dataAccess.getAllStudents().get(0);
		student.setName("Michael");
		dataAccess.updateStudent(student);

		// Get student via Data Access
		student = dataAccess.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	}
}
