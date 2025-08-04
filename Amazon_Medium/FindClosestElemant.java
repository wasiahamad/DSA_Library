import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FindClosestElemant {
    // find K closest element
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (right - left + 1 > k) {
            if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                left++;
            } else {
                right--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            ans.add(arr[i]);
        }
        return ans;
    }

    // Approch:- 2 (using priorityQueue)

    public List<Integer> findClosestElement(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            if (k > 0) {
                pq.offer(arr[i]);
                k--;
            } else if (Math.abs(pq.peek() - x) > Math.abs(arr[i] - x)) {
                pq.poll();
                pq.offer(arr[i]);
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, };
        int k = 4;
        int x = 3;
        System.out.println(findClosestElements(arr, k, x));
    }
}
