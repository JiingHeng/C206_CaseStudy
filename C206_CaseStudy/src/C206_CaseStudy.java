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
		Student dog = new Student("a", 1, "a", "a", "a", "a", 1);
		registeredUser James1 = new registeredUser("James", 20012345, "P4", "Desmond Lee", "Tom", "Tom@gmail.com",
				12345678, 00000000);
		registeredUser Molly1 = new registeredUser("Molly", 20012344, "P3", "Desmond Lee", "Grace", "Grace@gmail.com",
				23456780, 11111111);
		studentList.add(James);
		studentList.add(Molly);

		studentList.add(dog);
		registeredUser.add(James1);
		registeredUser.add(Molly1);

		ArrayList<CCA> ccaList = new ArrayList<CCA>();
		CCA scouts = new CCA("Scouts", "Learn survival skills!", 20, "Friday", "3pm-7pm", "Back of School", "Denzel",
				"Lifeskills");
		CCA football = new CCA("Football", "Do you think you are the next futbol star?", 20, "Monday", "2pm-5pm",
				"Football Field", "Jonathan", "Sports");
		CCA football1 = new CCA("Football", "Do you think you are the next futbol star?", 20, "Monday", "2pm-5pm",
				"Football Field", "Jonathan", "Sports");
		ccaList.add(scouts);
		ccaList.add(football);
		ccaList.add(football1);

		ArrayList<CCA> ccaCategory = new ArrayList<CCA>();
		String msg = "";
		CCA cat = new CCA(ccaList.get(0).getCategory());
		ccaCategory.add(cat);
		for (int i = 0; i < ccaList.size(); i++) {
			String category = ccaList.get(i).getCategory();
			for (int j = 1; j < ccaList.size(); j++) {
				if (category.equalsIgnoreCase(ccaList.get(j).getCategory())) {
					break;
				} else {
					cat = new CCA(ccaList.get(j).getCategory());
					ccaCategory.add(cat);
					break;
				}

			}

		}

		// For user to login or register to the system

		Menu();

		// ----------------------------For user to choose which kind of login
		// ---------------------------------- //

		int option = Helper.readInt("Enter choice > ");
		while (option != 4) {

			// ---------------------------- New User Register
			// -----------------------------------------------//
			if (option == 1) {
				// Add registered user
				boolean registered = false;
				System.out.println("NOTE: Only P4 student can register as student");
				char askOption = Helper.readChar("Are you a parent or student? (p/s) > ");
				if (askOption == 'p' || askOption == 'P') {
					// Register Parent
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
								&& teacherName.equalsIgnoreCase(studentList.get(i).getTeacher())) {
							
							Random rand = new Random();
							int intRandom = rand.nextInt(99999999);
							registeredUser user = new registeredUser(studentName, studentID, classGrade, teacherName,
									parentName, parentEmail, parentNumber, intRandom);
							registeredUser.add(user);
							System.out.println("Successfully Registered!");
							System.out.println("Your Student ID is: " + studentID);
							System.out.println("Your Registration ID is: " + intRandom);
							registered = true;
							break;
						}

					}

				} else if (askOption == 's' || askOption == 'S') {
					// Register Student
					String studentName = Helper.readString("Enter Student Name: ");
					int studentID = Helper.readInt("Enter Student ID: ");
					String classGrade = Helper.readString("Enter Student's Class Grade: ");
					String teacherName = Helper.readString("Enter Teacher's Name: ");
					for (int i = 0; i < studentList.size(); i++) {

						if (studentName.equalsIgnoreCase(studentList.get(i).getName())
								&& studentID == studentList.get(i).getStudentID()
								&& classGrade.equalsIgnoreCase(studentList.get(i).getGradeClass())
								&& teacherName.equalsIgnoreCase(studentList.get(i).getTeacher())) {

							Random rand = new Random();
							int intRandom = rand.nextInt(99999999);
							registeredUser user = new registeredUser(studentName, studentID, classGrade, teacherName,
									intRandom);
							registeredUser.add(user);
							System.out.println("Successfully Registered as Student!");
							System.out.println("Your Student ID is: " + studentID);
							System.out.println("Your Registration ID is: " + intRandom);
							registered = true;
							break;
						}
					}
				}

				if (registered == false) {
					System.out.println("Your details does not match our database.");
				}

			} else if (option == 2) {
				// ---------------------------- Parent/Student Login
				// -----------------------------------------------//
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

				// ---------------------------- CCA coord Login
				// -----------------------------------------------//

			} else if (option == 3) {
				String username = Helper.readString("Enter username > ");
				String password = Helper.readString("Enter password > ");
				if (username.equalsIgnoreCase("admin") && password.equals("admin")) {
					adminMenuList();
					int adminOption = Helper.readInt("Enter choice > ");
					if (adminOption == 1) {
						// add student
						addStudent(studentList);
					} else if (adminOption == 2) {
						viewAllStudents(studentList);
					} else if (adminOption == 3) {
						deleteStudent(studentList);
					} else if (adminOption == 4) {
						// Add CCA
						addCCA(ccaList);
					} else if (adminOption == 5) {
						// View all CCA
						C206_CaseStudy.viewAllCCA(ccaList);
					} else if (adminOption == 6) {
						// delete CCA
						C206_CaseStudy.updateCCA(ccaList);
//						deleteCCA(ccaList);
					} else if (adminOption == 7) {
						addCCACategory(ccaCategory);
					} else if (adminOption == 8) {
						deleteCCACategory(ccaCategory);
					} else if (adminOption == 9) {
						viewAllCCACategory(ccaCategory);
					}
				} else {
					System.out.println("Wrong username or password");
				}

			} else {
				System.out.println("Invalid option");
			}
			Menu();
			option = Helper.readInt("Enter choice > ");
		}
		System.out.println("GoodBye!");

	}

	// --------------------------------------------------------------------------------------------
	// METHODS ---------------------------------------------------------------- //

	// --------------------------------- USER STORY 1 - Add Student
	// --------------------------------------- //
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

	// ----------------------------------- USER STORY 2 - View All Student
	// ---------------------------------//
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

	// ---------------------------------- USER STORY 3 - Delete Student
	// ------------------------------------ //
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

	// --------------------------------------------------------------USER STORY 6 -
	// ADD CCA ----------------------------------------------------//

	private static void addCCA(ArrayList<CCA> ccaList) {
		boolean isDuplicate = false;
		String newTitle = Helper.readString("Enter new CCA Title > ");
		for (int i = 0; i < ccaList.size(); i++) {
			if (newTitle.equalsIgnoreCase(ccaList.get(i).getTitle())) {
				isDuplicate = true;
			}
		}

		if (isDuplicate == false) {
			String description = Helper.readString("Enter the description of the new CCA > ");
			int size = Helper.readInt("Enter CCA class size > ");
			String day = Helper.readString("Enter the day of CCA (Monday)> ");
			String time = Helper.readString("Enter the time of the CCA (4pm-5pm) > ");
			String venue = Helper.readString("Enter the venue for CCA > ");
			String instructor = Helper.readString("Enter the instructor name > ");
			String category = Helper.readString("Enter the CCA category > ");

			if (newTitle.isEmpty() == false && description.isEmpty() == false && size > 0 && day.isEmpty() == false
					&& time.isEmpty() == false && venue.isEmpty() == false && instructor.isEmpty() == false
					&& category.isEmpty() == false) {
				CCA newCCA = new CCA(newTitle, description, size, day, time, venue, instructor, category);
				ccaList.add(newCCA);
				String msg = String.format("The new CCA, %s is added!", newTitle);
				System.out.println(msg);
			} else {
				String msg = String.format("The CCA, %s is not added because something is missing", newTitle);
				System.out.println(msg);
			}
		} else {
			String msg = String.format("There is duplicate of the CCA %s", newTitle);
			System.out.println(msg);
		}
	}

	// ---------------------------------------------------USER STORY 7 - To View all
	// CCA ----------------------------------------------//
	private static String retrieveCCAList(ArrayList<CCA> ccaList) {
		String output = "";

		for (int i = 0; i < ccaList.size(); i++) {

			output += String.format("%-10s %-60s %-15d %-20s %-20s %-20s %-20s %-20s\n", ccaList.get(i).getTitle(),
					ccaList.get(i).getDescription(), ccaList.get(i).getSize(), ccaList.get(i).getDay(),
					ccaList.get(i).getTime(), ccaList.get(i).getVenue(), ccaList.get(i).getInstructor(),
					ccaList.get(i).getCategory());
		}
		return output;
	}

	// ---------------------------USER STORY 7 - To View all CCA
	// ------------------------------- //
	public static void viewAllCCA(ArrayList<CCA> ccaList) {
		// C206_CaseStudy.setHeader("CCA LIST");
		String output = "";
		output += String.format("%-10s %-60s %-15s %-20s %-20s %-20s %-20s %-20s\n", "CCA NAME", "DESCRIPTION",
				"CCA CAPACITY", "DAY", "TIME", "VENUE", "INSTRUCTOR", "CATEGORY");

		output += retrieveCCAList(ccaList);
		System.out.println(output);
	}

	// --------------------------------------------------------------USER STORY 8 -
	// DELETE CCA------------------------------------------------//

	private static void deleteCCA(ArrayList<CCA> ccaList) {
		String deleteTitle = Helper.readString("Enter the title of the CCA to be deleted: ");
		boolean deleted = false;
		for (int i = 0; i < ccaList.size(); i++) {
			if (deleteTitle.equalsIgnoreCase(ccaList.get(i).getTitle())) {
				ccaList.remove(i);
				deleted = true;
				break;
			}
		}
		if (deleted == true) {
			System.out.println("CCA Deleted!");
		} else if (deleted == false) {
			System.out.println("CCA Not Deleted!");
		}
	}

	// ---------------------------------------------------------------USER STORY 16
	// - UPDATE CCA DETAILS FOR SPRINT 2----------------------------------//

	private static void updateCCA(ArrayList<CCA> ccaList) {
		String ccaToChange = Helper.readString("Enter which CCA to update > ");
		for (int i = 0; i < ccaList.size(); i++) {
			if (ccaList.get(i).getTitle().contains(ccaToChange)) {
				String output = "";

				output += String.format("%-10s %-60s %-15s %-20s %-20s %-20s %-20s %-20s\n", "CCA NAME", "DESCRIPTION",
						"CCA CAPACITY", "DAY", "TIME", "VENUE", "INSTRUCTOR", "CATEGORY");

				output += String.format("%-10s %-60s %-15d %-20s %-20s %-20s %-20s %-20s\n", ccaList.get(i).getTitle(),
						ccaList.get(i).getDescription(), ccaList.get(i).getSize(), ccaList.get(i).getDay(),
						ccaList.get(i).getTime(), ccaList.get(i).getVenue(), ccaList.get(i).getInstructor(),
						ccaList.get(i).getCategory());
				System.out.println(output);

				String newDescription = Helper.readString("Enter new description for the CCA > ");
				int newClassSize = Helper.readInt("Enter new class size for CCA > ");
				String newDay = Helper.readString("Enter the new day for CCA (Monday) > ");
				String newTime = Helper.readString("Enter the new Time for CCA > ");
				String newVenue = Helper.readString("Enter new Venue for CCA > ");
				String newInstructor = Helper.readString("Enter new Instructor for CCA > ");
				String newCategory = Helper.readString("Enter new Category for CCA > ");

				if (newDescription.isEmpty() == false && newClassSize > 0 && newDay.isEmpty() == false
						&& newVenue.isEmpty() == false
						&& newInstructor.isEmpty() == false & newCategory.isEmpty() == false) {
					ccaList.get(i).setDescription(newDescription);
					ccaList.get(i).setSize(newClassSize);
					ccaList.get(i).setDay(newDay);
					ccaList.get(i).setTime(newTime);
					ccaList.get(i).setVenue(newVenue);
					ccaList.get(i).setInstructor(newInstructor);
					ccaList.get(i).setCategory(newCategory);
				}

				String result = String.format("The CCA detail for %s has been updated!", ccaToChange);
				System.out.println(result);
				break;

			} else {
				String output = String.format("The CCA, %s does not exist.", ccaToChange);
				System.out.println(output);
				break;
			}
		}
	}

// ------------------------------------------------------------------------ MENUS ----------------------------------------------------------- // 

	// ---------- Main Menu -------------- //
	public static void Menu() {

		Helper.line(30, "=");
		System.out.println("WELCOME TO CCA REGISTRATION");
		Helper.line(30, "=");

		System.out.println("1. New user register");
		System.out.println("2. Parent/Student Login");
		System.out.println("3. CCA Coordinator Login");
		System.out.println("4. Exit");

	}

	// ---------- CCA Coord Menu -------------- //
	private static void adminMenuList() {
		Helper.line(30, "=");
		System.out.println("CCA Coordinator Profile");
		Helper.line(30, "=");

		System.out.println("1. Add Student to the System");
		System.out.println("2. View All Students");
		System.out.println("3. Delete Students");
		System.out.println("4. Add CCA");
		System.out.println("5. View All CCA");
		System.out.println("6. Delete CCA");
		System.out.println("7. Add CCA Category");
		System.out.println("8. Delete CCA Category");
		System.out.println("9. View CCA Category");
		System.out.println("0. Back");
	}

	// ---------- Parent Menu -------------- //
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

	// To let the user login (Not Completed Yet)
	public static boolean doStudentParentLogin(Student student, String studentID, String registrationID) {
		boolean access = false;
		if (studentID.equals(student.getStudentID()) && registrationID.equals(registrationID)) { // not done
			access = true;
		}
		return access;
	}

	// ---------------------------USER STORY 13 - To ADD CCA Category
	// ------------------------------- //
	public static void addCCACategory(ArrayList<CCA> ccaCategory) {
		boolean dupli = false;

		String categoryName = Helper.readString("Enter Category Name: ");

		for (int i = 0; i < ccaCategory.size(); i++) {
			if (categoryName.equalsIgnoreCase(ccaCategory.get(i).getCategory())) {
				dupli = true;
			}
		}

		if (dupli == false) {
			CCA newCat = new CCA(categoryName);
			ccaCategory.add(newCat);
			String msg = "";
			msg += String.format("The Category, %s has been added into the system", categoryName);
			System.out.println(msg);
		} else {
			System.out.println("There should be no duplicate category names");
		}

	}

	// ---------------------------USER STORY 14 - To DELETE CCA Category
	// ------------------------------- //
	public static void deleteCCACategory(ArrayList<CCA> ccaCategory) {

		boolean isDeleted = false;
		String categoryNameToDel = Helper.readString("Enter Category Name to Delete: ");

		for (int i = 0; i < ccaCategory.size(); i++) {
			if (categoryNameToDel.equals(ccaCategory.get(i).getCategory())) {
				isDeleted = true;
				if (isDeleted == true) {
					ccaCategory.remove(i);
					System.out.println("Category " + categoryNameToDel + " is deleted from the system");
					break;
				} else {
					System.out.println("Not deleted");
				}
			} else if (i + 1 == ccaCategory.size()) {
				System.out.println("No such CCA Category is found in the system");
				break;
			}
		}
	}

	// ---------------------------USER STORY 15 - To View all CCA Category
	// ------------------------------- //
	public static void viewAllCCACategory(ArrayList<CCA> ccaCategory) {
		String output = String.format("%-10s\n", "CCA CATEGORY NAME");
		output += retrieveCCACategory(ccaCategory);
		System.out.println(output);
	}

	// To retrieve the CCA CATEGORY
	private static String retrieveCCACategory(ArrayList<CCA> ccaCategory) {
		String output = "";

		for (int i = 0; i < ccaCategory.size(); i++) {
			output += String.format("%-10s\n", ccaCategory.get(i).getCategory());
		}
		return output;
	}
}
