package LeetCode;

public class Problem11 {
    public static int maxArea(int[] height) {
        if (height.length < 2 || height.length > 100000) {
            return 0;
        }

        int maxArea = 0;

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int temp;
                if (height[j] > height[i]) {
                    temp = height[i] * (j-i);
                    maxArea = Math.max(maxArea, temp);
                }
                if (height[j] <= height[i]) {
                    temp = height[j] * (j-i);
                    maxArea = Math.max(maxArea, temp);
                }
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int height[] = {1,1};

        System.out.println(maxArea(height));
    }
}
