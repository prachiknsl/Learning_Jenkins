package Day2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class Ju01 {
	
	private static String temp;
	public Ju01 (String svalue) {
		this.temp=svalue;
	}
	
	@BeforeClass
	public static void BeforeClass() {
		//temp=null;
		System.out.println("BeforeClass : "+temp);
	}
	
	@Before
	public void Before() {
		//temp="Hello Temp";
		System.out.println("BeforeClass : "+temp);
	}
	
	@Parameters
	public static String[] searchValues() {
		return new String[] {"name", "age","city","designation"};
	}

	@Test
	public void test() {
		System.out.println("Test : "+temp);
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 : "+temp);
	}
	
	@After
	public void After() {
		//temp=null;
		System.out.println("AfterClass : "+temp);
	}
	
	@AfterClass
	public static void AfterClass() {
		//temp=null;
		System.out.println("AfterClass : "+temp);
	}
	
	

}


