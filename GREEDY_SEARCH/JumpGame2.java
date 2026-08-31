class JumpGame2 {
    public int jump(int[] nums) {
        int currentEnd = 0;
        int jump = 0;
        int farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (currentEnd == i) {
                jump++;
                currentEnd = farthest;
            }

        }
        return jump;
    }
    public static void main(String[] args){
        int[] nums = {2,3,1,1,4};
        JumpGame2 obj = new JumpGame2();
        int result = obj.jump(nums);
        System.out.println(result);
    }
}