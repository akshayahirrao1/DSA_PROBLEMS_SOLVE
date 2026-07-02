import java.util.HashMap;
class TwoSumUsingHashMap{
    public static void main(String[] args){
        int[] nums ={2,7,11,15};
        int target = 9;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed =target - nums[i];
            if(map.containsKey(needed)){
                // return new int[]{map.get(needed),i};
                System.out.println("indices are "+map.get(needed)+" and "+i);
                break;
            }else{
                map.put(nums[i],i);
            }
            }
        }
    }
