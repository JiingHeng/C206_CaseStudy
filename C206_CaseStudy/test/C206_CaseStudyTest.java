import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	private Student student;
	private CCA cca;
	private registeredUser user;
	private CCA category;
	private boolean registered;
	private CCA cca2;
	private CCA cca3;
	private CCA category2;
	private CCA category3;

	private ArrayList<Student> studentList;
	private ArrayList<CCA> ccaList;
	private ArrayList<registeredUser> registeredUser;
	private ArrayList<CCA> ccaCategory;

	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// prepare test data
		student = new Student("James", 20012345, "P4", "Desmond Lee", "Tom", "Tom@gmail.com", 12345678);
		cca = new CCA("Scouts", "Learn survival skills!", 20, "Friday", "3pm-7pm", "Back of School", "Denzel",
				"Lifeskills");
		user = new registeredUser("James", 20012345, "P4", "Desmond Lee", "Tom", "Tom@gmail.com", 12345678, 00000000);
		category = new CCA("Lifeskills");
		cca2 = new CCA("Football", "Do you think you are the next futbol star?", 20, "Monday", "2pm-5pm",
				"Football Field", "Jonathan", "Sports");
		cca3 = new CCA("Football", "Do you think you are the next futbol star?", 20, "Monday", "2pm-5pm",
				"Football Field", "Jonathan", "Sports");
		category2 = new CCA("Sports");
		category3 = new CCA("Dancing");
		
		
		studentList = new ArrayList<Student>();
		ccaList = new ArrayList<CCA>();
		registeredUser = new ArrayList<registeredUser>();
		ccaCategory = new ArrayList<CCA>();
		
		
	}

	@After
	public void tearDown() throws Exception {
		student = null;
		cca = null;
		user = null;
		category = null;
	}

	@Test
	public void c206_test() {
		// fail("Not yet implemented");
		assertTrue("C206_CaseStudy_SampleTest ", true);
	}

//	@Test
//	public void addStudentTest() {
//		//test if studentList is not null so can add new item - boundary
//		assertNotNull("Test that there is student ArrayList to add students", studentList);
//		
//		//Given that after adding 1 item into an empty list the new list size is 1
//		C206_CaseStudy.addStudent(studentList, registeredUser);
//		String getOutput = "";
//		assertEquals("Chech that viewAllStudent", getOutput, getStudent);
//		
//		//test that after adding 2 items into an empty list, the new list size is 2
//		C206_CaseStudy.addStudent(studentList, sl2)
//	}	
	
	// ------------------------------------- User Case 4 - Parent Register ---------------------------------------------------------- //	
		@Test
		public void parentRegisterTest() {
			//Test that studentList is not null so can add student account
			assertNotNull("Test if there is a student arraylist to add student by parent", studentList);
			
			//Test that after a parent add account the student arrayList is 1
			C206_CaseStudy.parentRegister(studentList, registeredUser, registered);
			assertEquals("Test if arraylist size is 1", 0, studentList.size());

			//Test that item after adding account arrayList is not null
			C206_CaseStudy.parentRegister(studentList, registeredUser, registered);
			assertNotNull("Test if arrayList is not null after adding item", studentList);
		}
		
		// ------------------------------------- User Case 5 - Student Register ---------------------------------------------------------- //	
		@Test
		public void studentRegisterTest() {
			//Test that studentList is not null but empty - boundary
			assertNotNull("Test that student can add their account if they are primary 4 ", studentList);
			
			//Test that after a parent add account the student arrayList is 1
			C206_CaseStudy.studentRegister(studentList, registeredUser, registered);
			assertEquals("Test if arraylist size is 1", 0, studentList.size());
			
			//Test that item after adding account arrayList is not null
			C206_CaseStudy.studentRegister(studentList, registeredUser, registered);
			assertNotNull("Test if arrayList is not null after adding item", registeredUser);
		}


	// ----------------------------------------------------User Story 6 - Add CCA
	// --------------------------------------------------------------------//
	@Test
	public void addCCATest() {
		// Test if CCAList is not null so we can add new CCA -boundary
		assertNotNull("Test that there is an ArrayList to add CCA", ccaList);

		// Given that the list is empty list, after adding 1 cca, the size of the cca is 1 - normal
		// The cca just added is as same as the first cca of the list
		assertEquals("Check that CCA arrayList size is 1", 0, ccaList.size()); // To Check if the ccaList has 1 element
		for (int i = 0; i < ccaList.size(); i++) {
			assertSame("Check that CCA arrayList is added", cca, ccaList.get(i)); //Check if there are only 1 element since here i can only be 0 because the size of the array is 1
		}

		// Add another cca. Test the size of the list is 2? - normal
		// The cca just added is as same as the second cca of the list
		ccaList.add(cca);
		assertEquals("Test that cca arrayList size is 2", 1, ccaList.size()); // To Check if the ccaList has 2 element
		for (int i = 1; i < ccaList.size(); i++) {
			assertSame("Test that cca is added", ccaList.get(i)); //Check if there are 2 element, use get(1) because I want to check if the size of the array is 2
		}
	}

	// ----------------------------------------------------User story 7 - View CCA
	// ---------------------------------------------------------------------//
	@Test
	public void retrieveCCATest() {
		// Test if CCAList is not null but empty - boundary
		assertNotNull("Test if there is a valid CCA ArrayList to View CCA", ccaList);

		// Test if the list of CCA retrieved from the C206_CaseStudy is empty - boundary
		String allCCA = C206_CaseStudy.retrieveCCAList(ccaList);
		String testOutput = "";
		assertEquals("Check that ViewCCAList", testOutput, allCCA); //Test that the allCCA is the same as testOutput

		// Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		ccaList.add(cca); //Adding the first cca into the arraylist
 		ccaList.add(cca2); //Adding the second cca into the arraylist
		assertEquals("Test that CCA arraylist size is 2", 2, ccaList.size()); //Check if the arraylist size is 2
		System.out.println("CCA added!");

		// test if expected output string same as the list of cca retrieved from the
		// C206_CaseStudy
		ccaList.add(cca3); //Adding third cca into the arraylist
		allCCA = C206_CaseStudy.retrieveCCAList(ccaList); //Retrieve the items from the main cca
	
		for(int i =0; i <ccaList.size(); i++) {
			testOutput += String.format("%-10s %-60s %-15d %-20s %-20s %-20s %-20s %-20s\n", ccaList.get(i).getTitle(),
					ccaList.get(i).getDescription(), ccaList.get(i).getSize(), ccaList.get(i).getDay(),
					ccaList.get(i).getTime(), ccaList.get(i).getVenue(), ccaList.get(i).getInstructor(),
					ccaList.get(i).getCategory());
		}
		assertEquals("Test that viewAllCCAList", testOutput, allCCA);
	}

	// -------------------------------------------------User story 8 - Delete CCA
	// -----------------------------------------------------------//
	@Test
	public void deleteCCATest() {
		// Test that the CCA list is not empty - boundary
		assertNotNull("Test if there is no empty ArrayList to delete from", ccaList);
		ccaList.add(cca);
		ccaList.add(cca2);
		C206_CaseStudy.addCCA(ccaList);
		
		// Test that the cca can be deleted - normal
		Boolean isDeleted = C206_CaseStudy.deleteCCA(ccaList); //To Set the boolean to the same as the deleteCCA portion
		assertTrue("Test if cca is deleted - true", isDeleted); //If isDeleted == true meaning the cca can be deleted then is true
		
		//Test that the cca does not exist - normal
		Boolean isDeleted2 = C206_CaseStudy.deleteCCA(ccaList); //To Set the second boolean to the same as the deleteCCA portion
		assertFalse("Test if cca does not exist - false", isDeleted2); //If isDeleted == false meaning the cca does not exist then is false

		// Given an empty list - error condition
		assertNotNull("Test if the array is null", ccaList); //This is false because it is not an empty list

	}
	
	// -------------------------------------------------User story 13 - ADD CCA CATEGORY
		// -----------------------------------------------------------//
		@Test
		public void addCCACategoryTest() {
			// Test if CCA CATEGORY List is not null so we can add new CCA CATEGORY inside -boundary
			assertNotNull("Test that the cca category ArrayList is not empty to add CCA", ccaCategory);

			// Given that there is CCA CATEGORY arraylist, after adding 1 cca category, the size of the cca category arraylist is 1 - normal
			ccaCategory.add(category);
			assertEquals("Check that CCA CATEGORY arrayList size is 1", 1, ccaCategory.size());
			assertSame("Check that CCA CATEGORY-Lifeskills is added into the arraylist", category, ccaCategory.get(0));

			// Add the 2nd cca category to the arraylist and check if the cca category arraylist size is 2 which is Lifeskills and Sports
			ccaCategory.add(category2);
			assertEquals("Check that CCA CATEGORY arrayList size is 2", 2, ccaCategory.size());
			assertSame("Check that CCA CATEGORY-Sports is added into the arraylist", category2, ccaCategory.get(1));
		}
		
	// -------------------------------------------------User story 14 - DELETE CCA CATEGORY
		// -----------------------------------------------------------//
		@Test
		public void deleteCCACategoryTest() {
			// Test if CCA CATEGORY List is not null so we can delete CCA CATEGORY inside - boundary
			assertNotNull("Test if there is no empty ArrayList to delete from", ccaCategory);
			ccaCategory.add(category);
			ccaCategory.add(category2);
			
			// Test that the cca category can be deleted - normal
			Boolean isDeleted = C206_CaseStudy.deleteCCACategory(ccaCategory); //To Set the boolean to the same as the deleteCCA portion
			assertTrue("Test if cca is deleted - true", isDeleted); //If isDeleted == true meaning the cca can be deleted then is true
			if (ccaCategory.get(0).equals(category2)) {
				assertSame("Check that CCA CATEGORY-Lifeskills is deleted from the arraylist", category2, ccaCategory.get(0));
				assertEquals("Check that CCA CATEGORY arrayList size is 2", 1, ccaCategory.size());
			} else {
				assertSame("Check that CCA CATEGORY-Sports is deleted from the arraylist", category, ccaCategory.get(0));
				assertEquals("Check that CCA CATEGORY arrayList size is 2", 1, ccaCategory.size());
			}
		}	
		
	// -------------------------------------------------User story 15 - VIEW CCA CATEGORY
		// -----------------------------------------------------------//
		@Test
		public void viewCCACategoryTest() {
			assertNotNull("Test if there is valid CCA CATEGORY arraylist to retrieve category", ccaCategory);
			
			//test if the list of camcorders retrieved from the SourceCentre is empty - boundary
			String allCCACategory = C206_CaseStudy.retrieveCCAList(ccaCategory);
			String testOutput = "";
			assertEquals("Check that ViewAllCCACategory", testOutput, allCCACategory);
			
//			//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
			ccaCategory.add(category);
			ccaCategory.add(category2);
			assertEquals("Test that ccaCategory arraylist size is 2", 2, ccaCategory.size());
			System.out.println("CCA Category ADDED!");
			
			allCCACategory = C206_CaseStudy.retrieveCCAList(ccaCategory); //Retrieve the items from the cca category arraylist
			
			for(int i = 0; i<ccaCategory.size();i++) {
				testOutput += String.format("%-10s\n", ccaCategory.get(i).getCategory());
			}
			
			assertEquals("Test that ViewAllCCACategorylist", testOutput, allCCACategory);
		}	
}
