package LeetCode;

public class Problem27 {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }
        }
        return nums.length - count;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };

        int c = removeElement(nums, 2);

        for (int i = 0; i < c; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
