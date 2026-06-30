class InsertPortion{
    public static void main(String[] args){
        int arr[]={1,3,4,5,6,7};
        int start=0;
        int end=arr.length-1;
        int target=5;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            
        }
        System.out.println(start);
    }
}