class BinarySearch{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
        int target=9;
        int start=0;
        boolean found=false;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                found=true;
                System.out.println("element found at index:"+mid);
                break;
            }
            else if(target>arr[mid]){
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }
        if(!found){
            System.out.println("element not found");
        }
    }
}