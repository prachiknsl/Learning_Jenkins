package Demo.Junittraining;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class Ju01 {

	@Ignore("Skip this Test")
	
	@Test
	public void test4() {
//		fail("Not yet implemented");
		System.out.println("From Ju01>>@Test>>test4");
	}
	
	@Test
	public void test1() {
//		fail("Not yet implemented");
		int i=100;
		i+=122;
		System.out.println("From Ju01>>@Test>>test1 : "+i);
	}
	
	@Test
	public void Test2() {
//		fail("Not yet implemented");
		System.out.println("From Ju01>>@Test>>test2");
	}
	
	@Test
	public void TEst3() {
//		fail("Not yet implemented");
		System.out.println("From Ju01>>@Test>>test3");
	}

}
