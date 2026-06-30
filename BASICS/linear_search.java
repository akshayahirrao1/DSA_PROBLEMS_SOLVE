class linear_search{
    int search(int arr[],int key){
       for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            return i;
        }
       }
       return -1;
    }
    public static void main(String[] args){
          int[] arr={1,2,3,4,5,6};
          int target=6;
          linear_search obj=new linear_search();
          int result = obj.search(arr,target);
          if(result>=0)
          {
          System.out.println("element found at index"+ result);
          }
          else {
            System.out.println("element not found");
          }
    }
}