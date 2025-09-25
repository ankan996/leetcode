package FreshStart_Integer_Practise;

import FreshStart_Integer.ArrayRotationRight;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Rotating " + k + " times to the right.");
        rotateRight(nums1, k);
        printArray(nums1);
        System.out.println();

        int[] nums2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Rotating " + k + " times to the left.");
        rotateLeft(nums2, k);
        printArray(nums2);


    }

    public static void rotateRight(int[] arr, int k) {

        // edge case check
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input !!!");
        }

        k = k % arr.length;

        // reverse the entire array
        reverseArray(arr, 0, (arr.length - 1));

        // reverse the array from start as 0 to (k - 1)
        reverseArray(arr, 0, (k - 1));

        // reverse the remaining part of the array
        reverseArray(arr, k, (arr.length - 1));

    }

    public static void rotateLeft(int[] arr, int k) {

        // edge case check
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input !!!");
        }

        k = k % arr.length;

        // reverse the array from start as 0 to (k - 1)
        reverseArray(arr, 0, (k - 1));

        // reverse the array from k till array length
        reverseArray(arr, k, (arr.length - 1));

        // reverse the entire array
        reverseArray(arr, 0, (arr.length - 1));

    }

    public static void reverseArray(int[] arr, int start, int end) {

        // edge case check
        if (arr == null || arr.length == 0 || start < 0 || end < 0) {
            throw new IllegalArgumentException("Invalid Input !!!");
        }

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


    }

    public static void printArray(int[] arr) {

        // edge case check
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid Input !!!");
        }

        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }

        System.out.println();

    }
    }

