import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {

	@Before
	public void setUp() throws Exception {
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

}
