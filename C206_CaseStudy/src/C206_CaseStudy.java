public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C206_CaseStudy.loginToSystem();
		C206_CaseStudy.Menu();

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
