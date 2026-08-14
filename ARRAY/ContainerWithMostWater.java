class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxcontainer = 0;
        while (left < right) {
            int min = Math.min(height[left], height[right]);
            int width = right - left;
            maxcontainer = Math.max(min * width, maxcontainer);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxcontainer;
    }

    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int result = obj.maxArea(height);
        System.out.println(result);
    }
}