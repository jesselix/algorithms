package li.jesse.leetcode;

import java.util.HashMap;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		return null;
	}

	public static int[] twoSum2(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {i, map.get(complement)};
			}
		}
		throw new IllegalArgumentException("no solution");
	}

	public static int[] twoSum3(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				return new int[] {map.get(target - nums[i]), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("no solution");
	}
}

