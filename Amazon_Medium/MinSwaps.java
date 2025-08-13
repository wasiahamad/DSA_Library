public class MinSwaps {
    // Minimum Swaps to Group All 1's Together II
public static int minSwaps(int[] nums) {
    int n = nums.length;
    int cnt0 = 0;
    int cnt1 = 0;
    int miss0 = 0;
    int miss1 = 0;

    for (int i = 0; i < n; i++) {
        if (nums[i] == 0) {
            cnt0++;
        } else {
            cnt1++;
        }
    }

    // not exist 
    if (Math.abs(cnt0 - cnt1) > 1) {
        return -1;
    }

    // swap the min swapping
    for (int i = 0; i < n; i += 2) {
        if (nums[i] == 0) {
            miss0++;
        } else {
            miss1++;
        }
    }

    // return 
    if (cnt0 == cnt1) {
        return Math.min(miss0, miss1);
    } else if (cnt0 > cnt1) {
        return miss0;
    } else {
        return miss1;
    }
}
    public static void main(String[] args) {
        // uses example
        int[] nums = {1, 1, 1, 0, 0, 0};
        System.out.println(minSwaps(nums));
    }
}
