import java.util.Arrays;

class zerosToEnd
{
    public static void main(String[] args){
      int[] arr={1,2,0,3,0,0,5,6};
      int index=0;
      for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                  arr[index]=arr[i];
                  index++;
            }
      }
     for(int j=index;j<arr.length;j++){
        arr[j]=0;
     }
       System.out.println(Arrays.toString(arr));
    }
}