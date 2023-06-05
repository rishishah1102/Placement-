package LeetCode;

public class Problem26 {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int nums[] = { -3, -1, 0, 0, 0, 3, 3 };

        System.out.println(removeDuplicates(nums));
    }
}
