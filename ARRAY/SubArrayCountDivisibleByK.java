import java.util.*;
class SubArrayCountDivisibleByK {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int prefix = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            int remainder = prefix % k;
            if (remainder < 0) {
                remainder += k;
            }
            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        SubArrayCountDivisibleByK obj = new SubArrayCountDivisibleByK();
        int result = obj.subarraysDivByK(nums,k);
        System.out.println(result);
    }
}