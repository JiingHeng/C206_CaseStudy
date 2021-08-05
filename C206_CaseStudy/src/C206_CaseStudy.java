import java.util.ArrayList;


public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> studentList  = new ArrayList<Student>();
		Student James = new Student("James", "20012345", "P4", "Desmond Lee", "Tom", "Tom@gmail.com", 12345678);
		Student Molly = new Student("Molly", "20012344", "P3", "Desmond Lee", "Grace", "Grace@gmail.com", 23456780);
		studentList.add(James);
		studentList.add(Molly);
		
		ArrayList<CCA> ccaList = new ArrayList<CCA>();
		CCA scouts = new CCA(01, "Scouts", "Learn survival skills!", 20, "Friday", "3pm-7pm", "Back of School", "Denzel");
		CCA football = new CCA(02, "Football", "Do you think you are the next futbol star?", 20, "Monday", "2pm-5pm", "Football Field", "Jonathan");
		ccaList.add(scouts);
		ccaList.add(football);
		
		C206_CaseStudy.loginToSystem();
		
		String studentName = Helper.readString("Enter Student Name: "); 
		String studentID = Helper.readString("Enter Student ID: ");
		String classGrade = Helper.readString("Enter Student's Class Grade: ");
		String teacherName = Helper.readString("Enter Teacher's Name: ");
		String parentName = Helper.readString("Enter Parent's Name: ");
		String parentEmail = Helper.readString("Enter Parent's Email: ");
		int parentNumber = Helper.readInt("Enter Parent's Contact Number: ");
		
		Student newStudent = new Student(studentName, studentID, classGrade, teacherName, parentName, parentEmail, parentNumber);
		
		System.out.println(studentList);
		
		C206_CaseStudy.loginToSystem();
	}

	public static void loginToSystem() {
		Helper.line(30, "=");
		System.out.println("LOGIN TO SYSTEM");
		Helper.line(30, "=");
	}

	public static void Menu() {

		Helper.line(30, "=");
		System.out.println("Student/Parents");
		Helper.line(30, "=");

		System.out.println("1. View all CCA");
		System.out.println("2. View Student's CCA");
		System.out.println("3. Delete Student's CCA");

		int option = -1;

		while (option != 5) {

			Menu();
			option = Helper.readInt("Enter choice > ");
			if (option == 1) {
				// write code here
			} else if (option == 2) {
				// write code here
			} else if (option == 3) {
				// write code here
			} else {
				System.out.println("Invalid option!");
			}

		}
	}

}
