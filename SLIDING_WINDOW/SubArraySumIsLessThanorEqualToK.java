class SubArraySumIsLessThanorEqualToK{
    public static void main(String[] args){
       int[] nums = {2, 1, 5, 1, 3, 2};
       int k = 7;
       int count = 0;
       int left = 0;
       int windowsum = 0;
       for(int i = 0; i < nums.length; i++){
          windowsum += nums[i];
          while(windowsum > k){
            windowsum -= nums[left];
            left++;
          }
          count = Math.max(count,i-left+1);
       }
       System.out.println(count);
    }
}