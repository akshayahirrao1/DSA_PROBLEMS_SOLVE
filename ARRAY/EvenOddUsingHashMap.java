import java.util.ArrayList;
import java.util.HashMap;
class EvenOddUsingHashMap{
    public static void main(String[] args){
        int[] numbers ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        HashMap<String, ArrayList<Integer>> Map = new HashMap<>();
        Map.put("Even", new ArrayList<>());
        Map.put("Odd", new ArrayList<>());
        for(int num : numbers){
            if(num %2==0){
                Map.get("Even").add(num);
            }
            else{
                Map.get("Odd").add(num);
            }
        }
        // System.out.println("Even numbers are "+Map.get("Even"));
        // System.out.println("Odd numbers are "+Map.get("Odd"));
        System.out.println(Map);

    }
}