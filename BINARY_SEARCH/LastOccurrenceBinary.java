class LastOccurrenceBinary{
   public static void main(String[] args){
      int[] arr={1,2,2,2,2,3,3,4};
      int start=0;
      int end=arr.length-1;
      int target=2;
      int index=-1;
      while(start<=end){
        int mid= start+(end-start)/2;
        if(arr[mid]==target){
            index=mid;
            start =mid+1;
        }
        else if(target>arr[mid]){
            start=mid+1;
        }
        else{
            end =mid-1;
        }
      }
      System.out.println(index);
   }
   
}