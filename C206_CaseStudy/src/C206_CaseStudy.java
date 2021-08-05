import java.util.ArrayList;
import java.util.Random;


public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Adding student to an ArrayList
		ArrayList<Student> studentList  = new ArrayList<Student>();
		Student James = new Student("James", "20012345", "P4", "Desmond Lee", "Tom", "Tom@gmail.com", 12345678);
		Student Molly = new Student("Molly", "20012344", "P3", "Desmond Lee", "Grace", "Grace@gmail.com", 23456780);
		studentList.add(James);
		studentList.add(Molly);
		
		ArrayList<CCA> ccaList = new ArrayList<CCA>();
		CCA scouts = new CCA("Scouts", "Learn survival skills!", 20, "Friday", "3pm-7pm", "Back of School", "Denzel");
		CCA football = new CCA("Football", "Do you think you are the next futbol star?", 20, "Monday", "2pm-5pm", "Football Field", "Jonathan");
		ccaList.add(scouts);
		ccaList.add(football);
		
		C206_CaseStudy.loginToSystem();
		System.out.println("Enter 1 to login");
		System.out.println("Enter 2 to register an account");
		int loginRegister = Helper.readInt("Enter: ");
		
		
		if(loginRegister == 1) { //To Login to the system
			
			
			
		} else if(loginRegister == 2) { //For registering to the system
			String studentName = Helper.readString("Enter Student Name: "); 
			String studentID = Helper.readString("Enter Student ID: ");
			String classGrade = Helper.readString("Enter Student's Class Grade: ");
			String teacherName = Helper.readString("Enter Teacher's Name: ");
			String parentName = Helper.readString("Enter Parent's Name: ");
			String parentEmail = Helper.readString("Enter Parent's Email: ");
			int parentNumber = Helper.readInt("Enter Parent's Contact Number: ");
			String registrationID = "";
			
			
			Student newStudent = new Student(studentName, studentID, classGrade, teacherName, parentName, parentEmail, parentNumber);
			studentList.add(newStudent);
		}
		
		
		
		
		System.out.println(studentList);
		
		C206_CaseStudy.loginToSystem();
	}
	
	
	//Just Part of the UI to say show the user
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
	
	//To let the user login (Not Completed Yet)
	public static boolean doStudentParentLogin(Student student, String studentID , String registrationID) {
		boolean access = false;
		if(studentID.equals(student.getStudentID()) && registrationID.equals(registrationID)) { //not done
			access = true;
		}
		return access;
	}
	
	public static Student randomID(Student student) {
		String choices = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890";
		String reset = "";
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			int outcome = rand.nextInt(62);
			char output = choices.charAt(outcome);
			reset += output;
		}
		
		reset = String.format("%s", reset);
		student.setStudentID(reset);

		return student;
	}

}
