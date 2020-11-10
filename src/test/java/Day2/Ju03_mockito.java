package Day2;

import static org.junit.Assert.*;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class Ju03_mockito {
	
	
	@InjectMocks
	TempConverter converter = new TempConverter();

	@Mock
	TempConversionService Tconversion; 
	
	@Before
	public void Before() {
		when (Tconversion.CtoF(30.00)).thenReturn(85.5);
	}
	
	@Test
	public void test() {
		
		System.out.println(converter.CtoF(30.00));
	}

}
