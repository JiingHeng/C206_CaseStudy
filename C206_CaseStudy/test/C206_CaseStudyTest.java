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
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@Test
	public void testAddStudent() {
		//test if studentList is not null so can add new item - boundary
		assertNotNull("Test that there is student ArrayList to add students", studentList);
		
		//Given that after adding 1 item into an empty list the new list size is 1
		C206_CaseStudy.addStudent(studentList);
		assertEquals("Test if that arraylist size is 1?", 1, studentList.size());
		
		//test that after adding 2 items into an empty list, the new list size is 2
		assertSame("test that student is added same as the item of the list?", student, studentList.get(0));
	}
	
	@Test
	public void testViewStudent() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid  arraylist to add to", studentList);

		//test if the list retrieved from the C206_CaseStudy is empty
		String allStudent = C206_CaseStudy.viewAllStudents(studentList);
		String testOutput = "";
		assertEquals("Check that ViewAllsList", testOutput, allStudent);

		//Given an empty list, after adding 1 items, test if the size of the list is 1
		C206_CaseStudy.addStudent(studentList);
		assertEquals("Test if that the  arraylist size is 1?", 1, studentList.size());

		//test if the expected output string same as the list of student retrieved from the C206_CaseStudy
		

		testOutput = String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n","ID", "name","grade","teacher", "pname","pemail","pcontact");

		assertEquals("Check that retrieveAllStudentDetail", testOutput, allStudent);

	}
	
	@Test
	public void addCCATest() {
		//Test if CCAList is not null so we can add new CCA -boundary
		assertNotNull("Test that there is an ArrayList to add CCA", ccaList);
		
		//Given that 
	}

}
