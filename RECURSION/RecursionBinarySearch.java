class RecursionBinarySearch{
    static int search(int[] arr,int start,int end,int target){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
             return search(arr,start,mid-1,target);
        }
        else{
            return search(arr,mid+1,end,target);
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int target=3;
        int result=search(arr,0,arr.length-1,target);
        System.out.println(result);
    }
}