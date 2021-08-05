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
		System.out.println("Login");
		Helper.line(30, "=");

		System.out.println("1. Student/Parent Login");
		System.out.println("2. CCA Coordinator Login");

	
	}

}
