package IntegerInterviewPrac;

public class JumpGame {
    public static void main(String[] args) {
        //int[] nums = {2,3,1,1,4}; // true
         int[] nums = {3,2,1,0,4}; // false

        boolean result = canJump(nums);
        if (result == true) {
            System.out.println(result + ". Yes, can jump!");
        } else {
            System.out.println(result + ". No, can not jump!");
        }
    }

    public static boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length && i <= reachable; i++) {
            reachable = Math.max(reachable, (i + nums[i]));
            if (reachable >= (nums.length - 1)) {
                return true;
            }
        }
        return false;
    }
}
