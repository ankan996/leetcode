package LiveInterviewProblems;

import java.util.HashMap;

public class TestMorganStanley {

    public static void main(String[] args) {

        //int[] arr = {-1,-2,-4,-5,-6,7,-10}; : 7
        //int[] arr = {-1,-2,-4,-5,-6,7,3,-10}; : 10
        //int[] arr = {-1,-2,-4,-5,-6,-7,-3,-10}; : -1


        int[] arr = {-1, -2, -4, -5, -6, 7, -10};

    }

    public static int result(int[] arr) {
        // edge case
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input.");
        }

        int sum = 0;
        int currentMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = arr[i]; // -1
            for (int j = (i + 1); j < arr.length; j++) {
                sum = sum + arr[j]; // -1 + (-2) = -3

                if (sum > currentMax) {
                    currentMax = sum;
                }


            }
        }
        return currentMax;
    }
}











