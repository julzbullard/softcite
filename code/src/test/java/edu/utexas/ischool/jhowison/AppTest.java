package edu.utexas.ischool.jhowison;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;



/**
 * Unit test for simple App.
 */
//@RunWith(Junit4.class)
public class AppTest 
{
	private TTLRepository testRepo;
	
	@Before
	public void setUpRepository() {
		this.testRepo = new TTLRepository();
	}
	
	@Test 
	public void testTTLFileLoad() throws Exception
	{
		assertThat(testRepo, instanceOf(TTLRepository.class) );
	}
	
	@Test 
	public void testNumberOfPublications()
	{
		assertEquals(90, TTLRepository.getNumberPublications());
	}
	
	@Ignore
	public void testNumberOfSelections()
	{
		assertEquals(-1, TTLRepository.getNumberSelections());
	}
	
	@Test
	public void testBiojSelectionWithoutRDFtype()
	{
		assertEquals(0, TTLRepository.getBiojSelectionWithoutRDFtype());
	}
}
