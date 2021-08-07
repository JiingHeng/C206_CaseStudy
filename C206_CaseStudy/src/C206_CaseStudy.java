import java.util.ArrayList;
import java.util.Random;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Adding student to an ArrayList
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<registeredUser> registeredUser = new ArrayList<registeredUser>();
		
		Student James = new Student("James", 20012345, "P4", "Desmond Lee", "Tom", "Tom@gmail.com", 12345678);
		Student Molly = new Student("Molly", 20012344, "P3", "Desmond Lee", "Grace", "Grace@gmail.com", 23456780);
		registeredUser James1 = new registeredUser("James", 20012345, "P4", "Desmond Lee", "Tom", "Tom@gmail.com",
				12345678, 00000000);
		registeredUser Molly1 = new registeredUser("Molly", 20012344, "P3", "Desmond Lee", "Grace", "Grace@gmail.com",
				23456780, 11111111);
		studentList.add(James);
		studentList.add(Molly);
		
		registeredUser.add(James1);
		registeredUser.add(Molly1);

		ArrayList<CCA> ccaList = new ArrayList<CCA>();
		CCA scouts = new CCA("Scouts", "Learn survival skills!", 20, "Friday", "3pm-7pm", "Back of School", "Denzel");
		CCA football = new CCA("Football", "Do you think you are the next futbol star?", 20, "Monday", "2pm-5pm",
				"Football Field", "Jonathan");
		ccaList.add(scouts);
		ccaList.add(football);
		
		// For user to login or register to the system


		Menu();

		// For user to choose which kind of login
		int option = Helper.readInt("Enter choice > ");
		while (option != 4) {

			if (option == 1) {
				// Add registered user
				String studentName = Helper.readString("Enter Student Name: ");
				int studentID = Helper.readInt("Enter Student ID: ");
				String classGrade = Helper.readString("Enter Student's Class Grade: ");
				String teacherName = Helper.readString("Enter Teacher's Name: ");
				String parentName = Helper.readString("Enter Parent's Name: ");
				String parentEmail = Helper.readString("Enter Parent's Email: ");
				int parentNumber = Helper.readInt("Enter Parent's Contact Number: ");
				
				for (int i = 0; i < studentList.size(); i++) {
					if (studentName.equalsIgnoreCase(studentList.get(i).getName())
							&& studentID == studentList.get(i).getStudentID()
							&& classGrade.equalsIgnoreCase(studentList.get(i).getGradeClass())
							&& teacherName.equalsIgnoreCase(studentList.get(i).getTeacher())
							&& parentName.equalsIgnoreCase(studentList.get(i).getParentName())
							&& parentEmail.equalsIgnoreCase(studentList.get(i).getParentEmail())
							&& parentNumber == studentList.get(i).getParentContactNo()) {
						
						Random rand = new Random();
						int intRandom = rand.nextInt(99999999);
						registeredUser user = new registeredUser(studentName, studentID, classGrade, teacherName, parentName,
								parentEmail, parentNumber, intRandom);
						registeredUser.add(user);
						System.out.println("Successfully Registered!");
						System.out.println("Your Student ID is: " + studentID);
						System.out.println("Your Registration ID is: " + intRandom);
					}
				}
				
				
	
			} else if (option == 2) {
				// write code for student/parent login
				boolean login = false;
				int studentID1 = Helper.readInt("Enter Student ID > ");
				int regID = Helper.readInt("Enter Registration ID > ");
				for (int i = 0; i < registeredUser.size(); i++) {
					if (studentID1 == registeredUser.get(i).getStudentID()
							&& regID == registeredUser.get(i).getRegID()) {
						login = true;
						System.out.println("Apply for CCA");
					}
				}
				if (login == false) {
					System.out.println("Wrong Student ID or Registration ID");
				}
			} else if (option == 3) {
				// CCA Coordinator Login
				String username = Helper.readString("Enter username > ");
				String password = Helper.readString("Enter password > ");
				if (username.equalsIgnoreCase("admin") && password.equals("admin")) {
					adminMenuList();
					int adminOption = Helper.readInt("Enter choice > ");
					if (adminOption == 1) {
						addStudent(studentList);
					} else if (adminOption == 2) {
						viewAllStudents(studentList);
					} else if (adminOption == 3) {
						deleteStudent(studentList);
					}
				} else {
					System.out.println("Wrong username or password");
				}

			} else if (option == 4){
				//Add CCA
				
			} else if (option == 5) {
				//View CCA
				
			} else if (option == 6) {
				//Add CCA category
				
			} else if (option == 7) {
				//To delete CCA
				String deleteTitle = Helper.readString("Enter the title of the CCA to be deleted: ");
				
				String ccaDetails = C206_CaseStudy.retrieveCCAList(ccaList);
				if(!ccaDetails.isEmpty()) { //if the string in ccaDetails is empty
					System.out.println(ccaDetails); //print the whole string
					char toDelete = Helper.readChar("Do you want to delete this CCA?(y/n) > ");
					
					if(toDelete == 'y' || toDelete == 'Y') {
						boolean deleted = C206_CaseStudy.deleteCCA(ccaList, deleteTitle); 
						
						if(deleted == true) {
							System.out.println(String.format("%s was deleted successfully", deleteTitle));
						} else {
							System.out.println("CCA was not deleted");
						}
					} 
				}
			} else if (option == 8) {
				//View CCA Category
				
			} else if (option == 9) {
				//Back
				
			} else {
				System.out.println("Invalid option");
			}
		
					
		}
		System.out.println("GoodBye!");

		}

	private static void viewAllStudents(ArrayList<Student> studentList) {
		// View All Student
		System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s", "Name", "Student ID",
				"Grade/Class", "Student ID", "Parent Name", "Parent email", "Parent Number"));
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s", studentList.get(i).getName(),
					studentList.get(i).getStudentID(), studentList.get(i).getGradeClass(),
					studentList.get(i).getTeacher(), studentList.get(i).getParentName(),
					studentList.get(i).getParentEmail(), studentList.get(i).getParentContactNo()));
		}
	}

	private static void deleteStudent(ArrayList<Student> studentList) {
		// Delete Student
		int studentID = Helper.readInt("Enter Student ID to delete > ");
		for (int i = 0; i < studentList.size(); i++) {
			if (studentID == studentList.get(i).getStudentID()) {
				studentList.remove(i);
				System.out.println("Student ID " + studentID + " is deleted from the system");
			} else if (i + 1 == studentList.size()) {
				System.out.println("No student found the system");
			}
		}
	}

	private static void addStudent(ArrayList<Student> studentList) {
		// Add Student
		String studentName = Helper.readString("Enter Student Name: ");
		int studentID = Helper.readInt("Enter Student ID: ");
		String classGrade = Helper.readString("Enter Student's Class Grade: ");
		String teacherName = Helper.readString("Enter Teacher's Name: ");
		String parentName = Helper.readString("Enter Parent's Name: ");
		String parentEmail = Helper.readString("Enter Parent's Email: ");
		int parentNumber = Helper.readInt("Enter Parent's Contact Number: ");

		Student student = new Student(studentName, studentID, classGrade, teacherName, parentName, parentEmail,
				parentNumber);
		studentList.add(student);
		System.out.println("Student has been added into the system");
	}

	private static void adminMenuList() {
		Helper.line(30, "=");
		System.out.println("CCA Coordinator Profile");
		Helper.line(30, "=");

		System.out.println("1. Add Student to the System");
		System.out.println("2. View All Students");
		System.out.println("3. Delete Students");
		System.out.println("4. Add CCA");
		System.out.println("5. View All CCA");
		System.out.println("6. Add CCA Category");
		System.out.println("7. Delete CCA Category");
		System.out.println("8. View CCA Category");
		System.out.println("9. Back");
	}

	public static void Menu() {

		Helper.line(30, "=");
		System.out.println("WELCOME TO CCA REGISTRATION");
		Helper.line(30, "=");

		System.out.println("1. New user register");
		System.out.println("2. Parent/Student Login");
		System.out.println("3. CCA Coordinator Login");
		System.out.println("4. Exit");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	// To retrieve the CCAList
	private static String retrieveCCAList(ArrayList<CCA> ccaList) {
		String output = "";

		for (int i = 0; i < ccaList.size(); i++) {

			output += String.format("%-10s %-30s %-10d %-10s %-20s %-10s %-20s\n", ccaList.get(i).getTitle(),
					ccaList.get(i).getDescription(), ccaList.get(i).getSize(), ccaList.get(i).getDay(),
					ccaList.get(i).getTime(), ccaList.get(i).getVenue(), ccaList.get(i).getInstructor());
		}
		return output;
	}

	// To View all CCA
	public static void viewAllCCA(ArrayList<CCA> ccaList) {
		C206_CaseStudy.setHeader("CCA LIST");
		String output = String.format("%-10s %-30s %-10d %-10s %-20s %-10s %-20s\n", "CCA NAME", "DESCRIPTION",
				"CCA CAPACITY", "DAY", "TIME", "VENUE", "INSTRUCTOR");
		output += retrieveCCAList(ccaList);
		System.out.println(output);
	}

	// To let the user login (Not Completed Yet)
	public static boolean doStudentParentLogin(Student student, String studentID, String registrationID) {
		boolean access = false;
		if (studentID.equals(student.getStudentID()) && registrationID.equals(registrationID)) { // not done
			access = true;
		}
		return access;
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
	
	//Delete the CCA
	public static boolean deleteCCA(ArrayList<CCA> ccaList, String title) {
		boolean delete = false;
		for (int i = 0; i < ccaList.size(); i++) {
			if(ccaList.get(i).getTitle() == title) {
				ccaList.remove(ccaList.get(i));
				delete = true;
			}
		}
		return delete;
	}
}


