public class RainWater {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int water = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int leftMax = height[i];
            int rightMax = height[i];
            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            for (int j = i + 1; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            water += Math.min(leftMax, rightMax)
                    - height[i];
        }
        System.out.println("Water Trapped = " + water);
    }
}