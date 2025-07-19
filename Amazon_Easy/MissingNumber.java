// problem statement :
// Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
// Example 1:   
// Input: nums = [3,0,1]
// Output: 2


package DSA_Library.Amazon_Easy;

public class MissingNumber {
    // ----------------- The function uses the formula for the sum of the first n natural numbers ----------------------------------

    // public static int findMissingNumber (int nums[]) {
    //     int n = nums.length;
    //     int expectedSum = n * (n + 1) / 2;
    //     int actualSum = 0;

    //     // If the array is empty, return 0
    //     if (n == 0) {
    //         return 0;
    //     }

    //     // Calculate the sum of the array elements
    //     for (int i = 0; i < n; i++) {
    //         actualSum += nums[i];
    //     }
    //     return expectedSum - actualSum;
    // }

    // ----------------- The function uses the bitwise XOR operator to find the missing number ----------------------------------

    public static int findMissingNumber (int nums[]) {
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            n = n ^ i;
            n = n ^ nums[i];
        }
        
        return n;
    }
    // ----------------- Main method to test the function ----------------------------------
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println("Missing number is: " + findMissingNumber(arr));
    }
}