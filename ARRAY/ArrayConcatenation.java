import java.util.*;
class ArrayConcatenation {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3};
        ArrayConcatenation obj = new ArrayConcatenation();
        int[] ans = obj.getConcatenation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
