public class C206_CaseStudy {

	public static void main(String[] args) {

		int option = -1;

		while (option != 5) {

			mainMenu();
			option = Helper.readInt("Enter choice > ");
			if (option == 1) {
				//write code here
			} else if (option == 2) {
				//write code here
			} else if (option == 3) {
				//write code here
			} else if (option == 4) {
				//write code here
			} else if (option == 5) {
				//write code here
			} else {
				System.out.println("Invalid option!");
			}

		}
	}

	private static void mainMenu() {

		Helper.line(60, "-");
		System.out.println("School CCA Registration System");
		Helper.line(60, "-");
		System.out.println("1. ");
		System.out.println("2. ");
		System.out.println("3. ");
		System.out.println("4. ");
		System.out.println("5. ");

	}
}
