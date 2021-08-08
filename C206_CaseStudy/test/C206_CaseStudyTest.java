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
	
	private ArrayList<Student> studentList;
	private ArrayList<CCA> ccaList;
	private ArrayList<registeredUser> registeredUser;
	private ArrayList<CCA> ccaCategory;
	
	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		//prepare test data
		student = new Student("James", 20012345, "P4", "Desmond Lee", "Tom", "Tom@gmail.com", 12345678);
		cca = new CCA("Scouts", "Learn survival skills!", 20, "Friday", "3pm-7pm", "Back of School", "Denzel", "Lifeskills");
		user = new registeredUser("James", 20012345, "P4", "Desmond Lee", "Tom", "Tom@gmail.com", 12345678, 00000000);
		category = new CCA("Lifeskills");
		
		studentList = new ArrayList<Student>();
		ccaList = new ArrayList<CCA>();
		registeredUser = new ArrayList<registeredUser>();
		ccaCategory= new ArrayList<CCA>();
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
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@Test
	public void addStudentTest() {
		//test if studentList is not null so can add new item - boundary
		assertNotNull("Test that there is student ArrayList to add students", studentList);
		
		//Given that after adding 1 item into an empty list the new list size is 1
		C206_CaseStudy.addStudent(studentList, registeredUser);
		String getOutput = "";
		assertEquals("Chech that viewAllStudent", getOutput, getStudent);
		
		//test that after adding 2 items into an empty list, the new list size is 2
		C206_CaseStudy.addStudent(studentList, sl2)
	}
	
	//----------------------------------------------------USER STORY 6 - ADD CCA --------------------------------------------------------------------//
	@Test
	public void addCCATest() {
		//Test if CCAList is not null so we can add new CCA -boundary
		assertNotNull("Test that there is an ArrayList to add CCA", ccaList);
		
		//Given that the list is empty list, after adding 1 cca, the size of the cca is 1 - normal
		//The cca just added is as same as the first cca of the list
		C206_CaseStudy.addCCA(ccaList);
		assertEquals("Check that CCA arrayList size is 1", 0, ccaList.size());
		assertSame("Check that CCA arrayList is added", cca, ccaList.get(1));
		
		//Add another cca. Test the size of the list is 2? - normal
		//The cca just added is as same as the second cca of the list
		C206_CaseStudy.addCCA(ccaList);
		assertEquals("Test that cca arrayList size is 2", 1, ccaList.size());
		assertSame("Test that cca is added", ccaList.get(0));
		
	}
	
	
	//----------------------------------------------------USER STORY 7 - VIEW CCA ---------------------------------------------------------------------//
	@Test
	public void retrieveCCATest() {
		//Test if CCAList is not null but empty - boundary
		assertNotNull("Test if there is a valid CCA ArrayList to View CCA", ccaList);
		
		//Test if the list of CCA retrieved from the C206_CaseStudy is empty - boundary
		String allCCA = C206_CaseStudy.retrieveCCAList(ccaList);
		String testOutput = "";
		assertEquals("Check that ViewCCAList", testOutput, allCCA);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addCCA(ccaList);
		C206_CaseStudy.addCCA(ccaList);
		assertEquals("Test that CCA arraylist size is 2", 2, ccaList.size());
		System.out.println("CCA added!");
		
		//test if expected output string same as the list of cca retrieved from the C206_CaseStudy
		allCCA = C206_CaseStudy.retrieveCCAList(ccaList);
		testOutput += String.format("%-10s %-60s %-15d %-20s %-20s %-20s %-20s %-20s\n", "Scouts", "Learn survival skills!", 20, "Friday", "3pm-7pm", "Back of School", "Denzel", "Lifeskills");
		testOutput += String.format("%-10s %-60s %-15d %-20s %-20s %-20s %-20s %-20s\n", "Scouts", "Learn survival skills!", 20, "Friday", "3pm-7pm", "Back of School", "Denzel", "Lifeskills");
		
		assertEquals("Test that viewAllCCAList", testOutput, allCCA);
	}
	
	//-------------------------------------------------USER STORY 8 - DELETE CCA -----------------------------------------------------------// 
	@Test
	public void deleteCCATest() {
		//Test that the CCA list is not empty - boundary
		assertNotNull("Test if there is no empty ArrayList to delete from", ccaList);
		C206_CaseStudy.addCCA(ccaList);
		
		//Test that the cca can be deleted - normal
		Boolean isDeleted = C206_CaseStudy.deleteCCA(ccaList);
		assertFalse("Test if cca is deleted - true", isDeleted);
		
		//Given an empty list - error condition 
		assertNotNull("Test if the array is null",ccaList);
		
	}
	
	
	
	@Test
	public void parentRegister() {
		//Test that studentList is not null so can add student account
		assertNotNull("Test if there is a student arraylist to add student by parent", studentList);
		
		//Test that after a parent add account the student arraylist is 1
		C206_CaseStudy.addStudent(studentList, student);
		C206_CaseStudy
		//Test that adding another account will make the size of the arraylist 2
	}

}
