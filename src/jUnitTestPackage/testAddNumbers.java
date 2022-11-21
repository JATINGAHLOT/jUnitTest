package jUnitTestPackage;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions Junit=new jUnitFunctions();
		int result = Junit.AddNumbers(60,90);
		assertEquals(150,result);
	}

}
