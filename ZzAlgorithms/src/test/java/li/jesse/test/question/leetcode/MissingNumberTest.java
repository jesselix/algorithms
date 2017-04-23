package li.jesse.test.question.leetcode;

import org.junit.Test;

import li.jesse.question.leetcode.MissingNumber;

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


