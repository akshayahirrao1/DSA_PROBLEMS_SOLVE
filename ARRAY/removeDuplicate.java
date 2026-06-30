class removeDuplicate{
    public static void main(String[] args)
{
       int[] arr={1,1,2,2,3,3,4};
       int index=1;
       for(int i=1;i<arr.length;i++){
        if(arr[i]==arr[i-1]){
            continue;
        }
        else if(arr[i]!=arr[i-1]){
            arr[index]=arr[i];
            index++;
        }
       }
       for(int j=0;j<index;j++){
        System.out.print(arr[j]+" ");
       }

}
}
