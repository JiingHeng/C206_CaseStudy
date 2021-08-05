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
		//Login in to system
		System.out.println("Enter 1 to login");
		System.out.println("Enter 2 to register an account");
		
		//For user to login or register to the system
		int loginRegister = Helper.readInt("Enter: ");
		while(true) {
			
			while(loginRegister != 5) {
			
				if(loginRegister == 1) { //To Login to the system
					Menu();
					//For user to choose which kind of login 
					int option = Helper.readInt("Enter choice > ");
					while (option != 5) {
						
						if (option == 1) {
							// write code for student/parent login
						} else if (option == 2) {
							// write code for CCA Coordinator login
						} else {
							System.out.println("Invalid option!");
						}

					}
				
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
			}
						
		}
				
	}
	


	private static void addStudent() {
		//For registering to the system
		String studentName = Helper.readString("Enter Student Name: "); 
		String studentID = Helper.readString("Enter Student ID: ");
		String classGrade = Helper.readString("Enter Student's Class Grade: ");
		String teacherName = Helper.readString("Enter Teacher's Name: ");
		String parentName = Helper.readString("Enter Parent's Name: ");
		String parentEmail = Helper.readString("Enter Parent's Email: ");
		int parentNumber = Helper.readInt("Enter Parent's Contact Number: ");
	}
	
	
	//Just Part of the UI to say show the user
	public static void loginToSystem() {
		Helper.line(30, "=");
		System.out.println("LOGIN TO SYSTEM");
		Helper.line(30, "=");
	}

	public static void Menu() {

		Helper.line(30, "=");
		System.out.println("Login");
		Helper.line(30, "=");

		System.out.println("1. Student/Parent Login");
		System.out.println("2. CCA Coordinator Login");

	
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	//To retrieve the CCAList
	private static String retrieveCCAList(ArrayList<CCA> ccaList) {
		String output = "";

		for (int i = 0; i < ccaList.size(); i++) {

			output += String.format("%-10s %-30s %-10d %-10s %-20s %-10s %-20s\n", ccaList.get(i).getTitle(),
					ccaList.get(i).getDescription(), ccaList.get(i).getSize(), ccaList.get(i).getDay(), ccaList.get(i).getTime(), ccaList.get(i).getVenue(), ccaList.get(i).getInstructor());
		}
		return output;
	}
	
	//To View all CCA
	public static void viewAllCCA(ArrayList<CCA> ccaList) {
		C206_CaseStudy.setHeader("CCA LIST");
		String output = String.format("%-10s %-30s %-10d %-10s %-20s %-10s %-20s\n", "CCA NAME", "DESCRIPTION",
				"CCA CAPACITY", "DAY","TIME", "VENUE", "INSTRUCTOR");
		 output += retrieveCCAList(ccaList);	
		System.out.println(output);
	}
	
	//To let the user login (Not Completed Yet)
	public static boolean doStudentParentLogin(Student student, String studentID , String registrationID) {
		boolean access = false;
		if(studentID.equals(student.getStudentID()) && registrationID.equals(registrationID)) { //not done
			access = true;
		}
		return access;
	}
	
	//To get random registrationID
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
