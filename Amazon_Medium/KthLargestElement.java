import java.util.PriorityQueue;

public class KthLargestElement {
    // ------------------- Approch:- 1 (using Priority Queue) ------------------find
    // KthLargestElement
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    // ------------------- Approch:- 2 (using two pointer) ------------------find
    // KthLargestElement\
    public static int findKthLargestUsingTwoPoniter(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int pivot = left + (right - left) / 2;
            if (nums[pivot] < nums[right]) {
                right = pivot;
            } else if (nums[pivot] > nums[right]) {
                left = pivot + 1;
            } else {
                right--;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        System.out.println(findKthLargest(nums, k));
        System.out.println(findKthLargestUsingTwoPoniter(nums, k));
    }
}