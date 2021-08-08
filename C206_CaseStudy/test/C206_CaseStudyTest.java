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
	
	@Test
	public void addCCATest() {
		//Test if CCAList is not null so we can add new CCA -boundary
		assertNotNull("Test that there is an ArrayList to add CCA", ccaList);
		
		//Given that 
	}

}
