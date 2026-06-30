class findMissingNumber{
    public static void main(String[] args){
        int arr[]={1,2,3,5,6};
        int sum=0;
        int actual=0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        int n =max;
        for(int i=0;i<arr.length;i++){
              sum+=arr[i];
        }
              actual=n*(n+1)/2;

        System.out.println("the missing element is"+ (actual-sum));
    }
}