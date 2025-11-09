import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * test
         * Given an array of integers 'nums'and an integer 'target', retun indices of
         * the two numbers such that they add up to the target.
         * 
         * You can assume that each input would have exactly one solution, and you may
         * not use the same elemnt twice.
         * 
         * You can return the anser in any order.
         * 
         * nums:[15,7,2,11]--> target:9
         * ans: [1,2] or[2,1]
         */
        System.out.println("Hello, World!");
        int[] nums = { 2, 7, 11, 5 };
        int target = 9;
        Solution solution = new Solution();
        int[] twoSum = solution.twoSum(nums, target);
        System.out
                .println("The two numbers that form the target sum are at locations: "
                        + Arrays.toString(twoSum));
    }
}
