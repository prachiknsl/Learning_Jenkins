package Demo.Junittraining;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

import Libs.CalculatorLib;

public class Ju04_calc_Validation {

	private static CalculatorLib mycalc;
	
	@BeforeClass
	public static void BeforeClass() {
		mycalc=null;
		//System.out.println("From Ju02>>>@BeforeClass>>BeforeClass");
	}
	
	@Before
	public void Before() {
		mycalc=new CalculatorLib();
	}
	
	
	
	@Test
	public void testAdd() {
		//System.out.println("Add : "+mycalc.add2Int(20, 20));
		assertTrue(mycalc==null);
		assertEquals(24,mycalc.add2Int(12, 12));//pass if expt=act fail if exp!=act
		assertNotEquals(25,mycalc.add2Int(12, 12));
		assertEquals(120,mycalc.add2Int(120, 0));
	
	}
	@Test
	public void testSub() {
		System.out.println("Sub : "+mycalc.sub2Int(20, 20));
	}
	@Test
	public void testMul() {
		System.out.println("Mul : "+mycalc.mul2Int(20, 20));
	}
	
	@After
	public void After() {
		mycalc=null;
	}
	
	@AfterClass
	public static void AfterClass() {
		mycalc=null;
	}

}

