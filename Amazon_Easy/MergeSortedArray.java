// https://leetcode.com/problems/merge-sorted-array/
// Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
// The number of elements initialized in nums1 and nums2 are m and n respectively.
// You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.
// Example 1:
package DSA_Library.Amazon_Easy;

public class MergeSortedArray {
    // mernge two sorted arrays function
    public static int[] merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Last index of nums1's initialized elements
        int j = n - 1; // Last index of nums2
        int k = m + n - 1; // Last index of nums1

        // Merge in reverse order

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;

        }

        // // Copy the remaining elements from nums2 to nums1 (ye tb hoga jb kuch v return nahi hua)
        // while (j >= 0) {
        //     nums1[k] = nums2[j];
        //     j--;
        //     k--;
        // }
        return nums1;

    }

    // main method for testing
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        merge1(nums1, m, nums2, n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
