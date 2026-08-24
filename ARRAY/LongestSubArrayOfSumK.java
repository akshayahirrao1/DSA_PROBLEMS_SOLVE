import java.util.*;
class LongestSubArrayOfSumK{
    public int longestSubarraySumK(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxlength = 0;
        int prefix = 0;
        for(int i = 0; i < nums.length; i++){
            prefix += nums[i];
            if(map.containsKey(prefix-k)){
                maxlength = Math.max(maxlength,i-map.get(prefix-k));
            }
            if(!map.containsKey(prefix)){
                map.put(prefix,i);
            }
        }
        return maxlength;
    }
    public static void main(String[] args){
        LongestSubArrayOfSumK obj = new LongestSubArrayOfSumK();
        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;
        int result = obj.longestSubarraySumK(nums,k);
        System.out.println(result);
    }
}