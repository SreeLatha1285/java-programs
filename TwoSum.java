import java.util.HashMap;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Step 1

        for (int i = 0; i < nums.length; i++) { // Step 2
            int complement = target - nums[i]; // Step 3

            if (map.containsKey(complement)) { // Step 4
                return new int[] { map.get(complement), i }; // Step 5
            }

            map.put(nums[i], i); // Step 6
        }

        throw new IllegalArgumentException("No two sum solution"); // Step 7
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // Step 8
        int target = 17;
        int[] result = twoSum(nums, target); // Step 9

        System.out.println("Indices: " + result[0] + ", " + result[1]); // Step 10
    }
}
