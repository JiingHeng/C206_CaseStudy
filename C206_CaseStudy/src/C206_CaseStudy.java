import java.util.ArrayList;


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
		
		Menu();
		int option = Helper.readInt("Enter choice > ");
		while (option != 5) {

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
		System.out.println("WELCOME TO CCA REGISTRATION");
		Helper.line(30, "=");

		System.out.println("1. New user register for CCA");
		System.out.println("2. Parent/Student Login");
		System.out.println("3. CCA Coordinator Login");
	
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	private static String retrieveCCAList(ArrayList<CCA> ccaList) {
		String output = "";

		for (int i = 0; i < ccaList.size(); i++) {

			output += String.format("%-10s %-30s %-10d %-10s %-20s %-10s %-20s\n", ccaList.get(i).getTitle(),
					ccaList.get(i).getDescription(), ccaList.get(i).getSize(), ccaList.get(i).getDay(), ccaList.get(i).getTime(), ccaList.get(i).getVenue(), ccaList.get(i).getInstructor());
		}
		return output;
	}
	
	public static void viewAllCCA(ArrayList<CCA> ccaList) {
		C206_CaseStudy.setHeader("CCA LIST");
		String output = String.format("%-10s %-30s %-10d %-10s %-20s %-10s %-20s\n", "CCA NAME", "DESCRIPTION",
				"CCA CAPACITY", "DAY","TIME", "VENUE", "INSTRUCTOR");
		 output += retrieveCCAList(ccaList);	
		System.out.println(output);
	}

}
