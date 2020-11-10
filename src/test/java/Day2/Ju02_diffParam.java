package Day2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class Ju02_diffParam {
	
	private static String temp;
	private static int iAge;
	private static boolean iMale;
	public Ju02_diffParam (String svalue,int iage, boolean igender) {
		this.temp=svalue;
		this.iAge=iage;
		this.iMale=igender;
	}
	
	@BeforeClass
	public static void BeforeClass() {
		System.out.println("BeforeClass : "+temp);
	}
	
	@Before
	public void Before() {
		System.out.println("BeforeClass : "+temp);
	}
	
	@Parameters
	public static Collection userInfo() {
		return Arrays.asList(new Object[][] {{"Max", 15, true},{"Radha", 18, false},{"Ram",32,true}});
	}
//	public static String[] searchValues() {
//		return new String[] {"name", "age","city","designation"};
//	}

	@Test
	public void test() {
		System.out.println("Test : "+temp+" age is "+iAge+" Male : "+iMale);
	}
	
//	@Test
//	public void test2() {
//		System.out.println("Test2 : "+temp);
//	}
	
	@After
	public void After() {
		System.out.println("AfterClass : "+temp);
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("AfterClass : "+temp);
	}
	
	

}

