public class C206_CaseStudy {

	public static void main(String[] args) {

	}

	public static void loginToSystem() {
		Helper.line(30, "=");
		System.out.println("LOGIN TO SYSTEM");
		Helper.line(30, "=");
		System.out.println("1. Student");
		System.out.println("2. Parent");
		System.out.println("3. Admin");

		int option = -1;

		while (option != 3) {

			loginToSystem();
			option = Helper.readInt("Enter choice > ");
			if (option == 1) {
				studentMenu();
			} else if (option == 2) {
				parentMenu();
			} else if (option == 3) {
				adminMenu();
			} else {
				System.out.println("Invalid option!");
			}

		}

	}

	public static void studentMenu() {

		Helper.line(30, "=");
		System.out.println("Student Profile");
		Helper.line(30, "=");

		System.out.println("1. Register ");
		System.out.println("2. Login");

		int option = -1;

		while (option != 3) {

			studentMenu();
			option = Helper.readInt("Enter choice > ");
			if (option == 1) {
				// write code here
			} else if (option == 2) {
				// write code here
			} else {
				System.out.println("Invalid option!");
			}

		}
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
