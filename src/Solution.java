import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        /*
         * there are three approaches to solving this problem:
         * 1) Brute force
         * 2) Sorting and binary search O(nlogn)
         * 3) using additional data structure O(n)
         * 
         * This problem is solved using additional data structure, in our case a hashmap
         * where (key,value)=(number, index)
         * 
         */
        // Craete a hashmap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // calculate the complement of the current number
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                // If found return the indices of the complement and the current number
                return new int[] { map.get(complement), i };
            }

            // Otherwise, add the current number and its index into the map
            map.put(nums[i], i);
        }
        // return an empty array if no solution is found
        return new int[] {};

    }
}
