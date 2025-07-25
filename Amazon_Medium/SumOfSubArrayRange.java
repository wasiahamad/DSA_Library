package DSA_Library.Amazon_Medium;

public class SumOfSubArrayRange {
    // function of SumOfSubArrayRange

    public static int sumSubArrayRange(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int min = arr[i];
            for (int j = i; j < arr.length; j++) {
                max = Math.max(max, arr[j]);
                min = Math.min(min, arr[j]);
                ans += max - min;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        int sum = sumSubArrayRange(arr);
        System.out.println(sum);
    }
}