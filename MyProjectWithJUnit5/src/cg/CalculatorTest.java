package cg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	static Calculator ob;
	
	@BeforeAll	// junit4 @BeforeClass
	public static void beforeallTest() {
		System.out.println("Before all tests");
		ob=new Calculator();
	}
	
	@AfterAll	// junit4 @AfterClass
	public static void afterallTest() {
		System.out.println("After all tests");
		ob=null;
	}
	
	@BeforeEach	// junit4 @Before
	public void beforEachTest() {
		System.out.println("Before each test");
		//ob=new Calculator();
	}
	
	@AfterEach	// junit4 @After
	public void afterEachTest() {
		System.out.println("After each test");
		//ob=null;
	}
	
	@Test
	void testadd() {
		System.out.println("test case testadd");
		
		assertEquals(9, ob.add(4, 5));
	}
	
	@RepeatedTest(5)
	//@Test
	void testadd1() {
		System.out.println("test case testadd1");
		
		assertTrue(ob.add(4, -5)>=0);
	}
	
	@Disabled
	@Test
	void testIdGenerator() {
		System.out.println("test case testIdGenerator");
		assertTrue(ob.idgenerator()>0);
	}

}
