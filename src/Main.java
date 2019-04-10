import LeetCode.TwoSum.Solution;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        Solution solution = new Solution();
        int[] a = solution.twoSum(nums, 9);
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
