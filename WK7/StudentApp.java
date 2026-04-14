import javax.swing.JOptionPane;

public class StudentApp{

	//main method
	public static void main(String args[]){

		int id;
		String name,programme;

		Student myStudent = new Student(123,"Julie","BSHC1");

		Student myStudent1 = new Student();
		myStudent1.setName("ALP");
		myStudent1.setId(13223);
		myStudent1.setProgramme("BSHC1");

		System.out.println("Student name is " + myStudent.getName());
		System.out.println("Student ID is " + myStudent.getId());
		System.out.println("Student programme is " + myStudent.getProgramme());
		System.out.println("Student name is " + myStudent1.getName());
		System.out.println("Student ID is " + myStudent1.getId());
		System.out.println("Student programme is " + myStudent1.getProgramme());

	}
}