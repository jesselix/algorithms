package li.jesse.leetcode;

import org.junit.Test;

public class MissingNumberTest
{
	int[] testArray =  {0, 1, 3};
	
	@Test
	public void testMissingNumber()
	{
		int result = MissingNumber.missingNumber(testArray);
		System.out.println(result);
	}
}


