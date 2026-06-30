class SelectionSort{
    public static void main(String[] args){
        int[] arr={1,4,5,2,3};
        for(int i=0;i<arr.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }   
            }
            if(minindex!=i)
            {
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
            }

        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}