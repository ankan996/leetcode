package AmazonInterview;
import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = {2,11,5,10,7,8};
        int[] result = twoSum(numbers, 9);
        System.out.println(result[0] + "," +result[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int [2];
        Map<Integer, Integer> object = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!(object.containsKey(target - nums[i]))) {
                object.put(nums[i], i);
            } else {
                result[1] = i;
                result[0] = object.get(target - nums[i]);
            }
        }
        return result;
    }

}
