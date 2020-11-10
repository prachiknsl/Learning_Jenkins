package Demo.Junittraining;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;

public class Ju02 {
	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void test1() {
		int i=100;
		i+=122;
		System.out.println("From Ju02>>@Test>>test1 : "+i);
	}
	
	@Test
	public void test2() {
		System.out.println("From Ju02>>@Test>>test2");
	}
	
	@Test
	public void test3() {
//		fail("Not yet implemented");
		System.out.println("From Ju02>>@Test>>test3");
	}
	
	@BeforeClass
	public static void BeforeClass() {
		System.out.println("From Ju02>>>@BeforeClass>>BeforeClass");
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("From Ju02>>>@AfterClass>>AfterClass");
	}
	
	
	
	
	
	@Before
	public void BeforeTest() {
		System.out.println("From Ju02>>>@Before>>BeforeTest");
	}
	
	@After
	public void AfterTest() {
		System.out.println("From Ju02>>>@After>>AfterTest");
	}
	

}
