import java.util.*;
class LongestSubStringWithKDistinct {
    public static void main(String[] args){
        String str = "eceba";
        int k = 2;
        int left = 0;
        int distinct = 0;
        int maxlenght = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int right = 0; right < str.length() ; right++){
            char ch = str.charAt(right);
            if(!map.containsKey(ch)){
               distinct++;
            }
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(distinct > k){
                map.put(str.charAt(left),map.getOrDefault(str.charAt(left),0)-1);
                if(map.get(str.charAt(left)) == 0){
                    map.remove(str.charAt(left));
                    distinct--;
                }
                left++;
            }
            maxlenght = Math.max(maxlenght,right-left+1);
        }

        System.out.println(maxlenght);
    }
}