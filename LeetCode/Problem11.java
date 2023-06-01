package LeetCode;

public class Problem11 {
    public static int maxArea(int[] height) {
        if (height.length < 2 || height.length > 100000) {
            return 0;
        }

        int maxArea = 0;
        int j = height.length - 1;

        for (int i = 0; i < j;) {
            int temp;
            if (height[i] > height[j]) {
                temp = height[j] * (j - i);
                j--;
            } else {
                temp = height[i] * (j - i);
                i++;
            }
            maxArea = Math.max(maxArea, temp);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int height[] = { 1, 1 };

        System.out.println(maxArea(height));
    }
}
