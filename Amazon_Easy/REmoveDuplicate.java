// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
// Do not allocate extra space for another array, you must do this by modifying the input array
// in-place with O(1) extra memory.
// Clarification: Confused about the output format? Return the new length of the array after
// removing the duplicates. It doesn't matter what you leave beyond the new length.
// Example 1:
package DSA_Library.Amazon_Easy;

public class REmoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] < nums[j]) {
                int temp = nums[i + 1];
                nums[i  +1] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

        return i + 1; // Return the length of the array without duplicates
    }

    // main method for testing
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4};
        int newLength = removeDuplicates(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
