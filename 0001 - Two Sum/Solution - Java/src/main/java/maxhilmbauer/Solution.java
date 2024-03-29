package maxhilmbauer;

import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complementNum = target - nums[i];
            if (numMap.containsKey(complementNum))
                return new int[]{numMap.get(complementNum), i};

            numMap.put(nums[i], i);
        }

        return new int[]{};
    }

}
