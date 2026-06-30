class SearchRecursive{
    static int Search(int[] arr,int index,int target){
        if(index==arr.length){
            return -1; 
        }
        if(arr[index]==target){
            return index;
        }

        return Search(arr,index+1,target);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int target=6;
        int result=Search(arr,0,target);
        System.out.println(result);
    }
}