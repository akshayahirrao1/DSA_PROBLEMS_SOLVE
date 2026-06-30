class SortedRecursiveCheck{
    static boolean isSorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isSorted(arr,index+1);
    }
    public static void main(String[] args){
          int[] arr={1,2,3,4,5,4};
          boolean result=isSorted(arr,0);
          if(result){
            System.out.println("the array is sorted");
          }
          else{
            System.out.println("the array is not sorted");
          }
    }
}