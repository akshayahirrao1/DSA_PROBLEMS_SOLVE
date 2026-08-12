class TrappingWater {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftmax = 0;
        int rightmax = 0;
        int water = 0;
        while (left < right) {
            leftmax = Math.max(leftmax, height[left]);
            rightmax = Math.max(rightmax, height[right]);
            if (leftmax <= rightmax) {
                water += leftmax - height[left];
                left++;
            } else {
                water += rightmax - height[right];
                right--;
            }
        }
        return water;
    }
    public static void main(String[] agrs){
         TrappingWater obj = new TrappingWater();
         int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
         int result = obj.trap(height);
         System.out.println(result);
    }
}