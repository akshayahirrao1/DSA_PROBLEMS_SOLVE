import java.util.*;
class SmallerElementToRight{
    public int[] Solution(int[] nums){
         Stack<Integer> st = new Stack();
         int[] ans = new int[nums.length];
         for(int i = nums.length-1 ; i >=0 ; i--){
            while(!st.isEmpty() && st.peek() >= nums[i]){
                st.pop();
            }
         
         if(st.isEmpty()){
            ans[i] = -1;
         }
         else{
            ans[i] = st.peek();
         }
         st.push(nums[i]);
         }
         return ans;
}
    public static void main(String[] args){
        SmallerElementToRight obj = new SmallerElementToRight();
        int[] nums = {4, 8, 5, 2, 25};
        int[] result = obj.Solution(nums);
        for(int num : result){
            System.out.println(num);
        }    
    }
}