import java.util.ArrayList;
import java.util.Random;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Adding student to an ArrayList
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student James = new Student("James", "20012345", "P4", "Desmond Lee", "Tom", "Tom@gmail.com", 12345678);
		Student Molly = new Student("Molly", "20012344", "P3", "Desmond Lee", "Grace", "Grace@gmail.com", 23456780);
		studentList.add(James);
		studentList.add(Molly);
		
		
		//Adding CCA to CCALIST
		ArrayList<CCA> ccaList = new ArrayList<CCA>();
		CCA scouts = new CCA("Scouts", "Learn survival skills!", 20, "Friday", "3pm-7pm", "Back of School", "Denzel");
		CCA football = new CCA("Football", "Do you think you are the next futbol star?", 20, "Monday", "2pm-5pm",
				"Football Field", "Jonathan");
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
					studentMenu();
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

<<<<<<< HEAD
<<<<<<< HEAD
			if (option == 1) {
				// write code for student/parent login
				System.out.println("WHO ARE YOU?");
				int userOption = Helper.readInt("Enter choice > ");
				System.out.println("1. Parent");
				System.out.println("2. P4 and above Student");
				if(userOption == 1) {
					
				}else if(userOption == 2) {
					
				}
			} else if (option == 2) {
				// write code for CCA Coordinator login
			} else {
				System.out.println("Invalid option!");
			}

		}
		
		
		
	
		
		
=======
>>>>>>> branch 'master' of https://github.com/JiingHeng/C206_CaseStudy.git
=======
					}
				
				} else if(loginRegister == 2) { //For registering to the system
					
					String studentName = Helper.readString("Enter Student Name: ");
					String studentID = Helper.readString("Enter Student ID: ");
					String classGrade = Helper.readString("Enter Student's Class Grade: ");
					String teacherName = Helper.readString("Enter Teacher's Name: ");
					String parentName = Helper.readString("Enter Parent's Name: ");
					String parentEmail = Helper.readString("Enter Parent's Email: ");
					int parentNumber = Helper.readInt("Enter Parent's Contact Number: ");
					
					Student newStudent = new Student(studentName, studentID, classGrade, teacherName, parentName, parentEmail, parentNumber);
					studentList.add(newStudent);
				
				}
			}
						
		}
			
>>>>>>> branch 'master' of https://github.com/JiingHeng/C206_CaseStudy.git
	}
	

	private static void addStudent() {
		// For registering to the system
		String studentName = Helper.readString("Enter Student Name: ");
		String studentID = Helper.readString("Enter Student ID: ");
		String classGrade = Helper.readString("Enter Student's Class Grade: ");
		String teacherName = Helper.readString("Enter Teacher's Name: ");
		String parentName = Helper.readString("Enter Parent's Name: ");
		String parentEmail = Helper.readString("Enter Parent's Email: ");
		int parentNumber = Helper.readInt("Enter Parent's Contact Number: ");
		
		
		
	}

	// Just Part of the UI to say show the user
	public static void loginToSystem() {
		Helper.line(30, "=");
		System.out.println("LOGIN TO SYSTEM");
		Helper.line(30, "=");
		System.out.println("1. Student");
		System.out.println("2. Parent");
		System.out.println("3. Admin");
	}

<<<<<<< HEAD
	public static void Menu() {

		Helper.line(30, "=");
		System.out.println("WELCOME TO CCA REGISTRATION");
		Helper.line(30, "=");

		System.out.println("1. New user register for CCA");
		System.out.println("2. Parent/Student Login");
		System.out.println("3. CCA Coordinator Login");
	
	}
	
=======
>>>>>>> branch 'master' of https://github.com/JiingHeng/C206_CaseStudy.git
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

	public static void studentMenu() {

		Helper.line(30, "=");
		System.out.println("Student Profile");
		Helper.line(30, "=");

		System.out.println("1. Register ");
		System.out.println("2. Login");

//		int option = -1;
//
//		while (option != 3) {
//			studentMenu();
//			option = Helper.readInt("Enter choice > ");
//			if (option == 1) {
//				// write code here
//			} else if (option == 2) {
//				// write code here
//			} else {
//				System.out.println("Invalid option!");
//			}
//
//		}
	}

	public static void parentMenu() {

		Helper.line(30, "=");
		System.out.println("Parent Profile");
		Helper.line(30, "=");

		System.out.println("1. Register for Student");
		System.out.println("2. Register for Parent");
		System.out.println("3. Login to System");

		int option = -1;

		while (option != 3) {

			studentMenu();
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
	
	//To View all CCA
	public static void viewAllCCA(ArrayList<CCA> ccaList) {
		C206_CaseStudy.setHeader("CCA LIST");
		String output = String.format("%-10s %-30s %-10d %-10s %-20s %-10s %-20s\n", "CCA NAME", "DESCRIPTION",
				"CCA CAPACITY", "DAY", "TIME", "VENUE", "INSTRUCTOR");
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

	public static void adminMenu() {

		Helper.line(30, "=");
		System.out.println("Admin Profile");
		Helper.line(30, "=");

		System.out.println("1. Add Student to the System");
		System.out.println("2. View Students/Parents");
		System.out.println("3. Delete Students/Parents");
		System.out.println("4. Add CCA");
		System.out.println("5. Edit CCA");
		System.out.println("6. Add CCA Category");
		System.out.println("7. Delete CCA Category");
		System.out.println("8. View CCA Category");
		// add more options if needed

		int option = -1;

		while (option != 3) {

			adminMenu();
			option = Helper.readInt("Enter choice > ");
			if (option == 1) {
				// write code here
			} else if (option == 2) {
				// write code here
			} else if (option == 3) {
				// write code here
			} else if (option == 4) {
				// write code here
			} else if (option == 5) {
				// write code here
			} else if (option == 6) {
				// write code here
			} else if (option == 7) {
				// write code here
			} else if (option == 8) {
				// write code here
			} else {
				System.out.println("Invalid option!");
			}

		}
	}
}
