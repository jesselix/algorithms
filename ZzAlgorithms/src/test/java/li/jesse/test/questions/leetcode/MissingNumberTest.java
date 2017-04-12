package li.jesse.test.questions.leetcode;

import org.junit.Test;

import li.jesse.questions.leetcode.MissingNumber;

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


