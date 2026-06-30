import java.util.*;
class reverse_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the arrary");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the array is ");
        for(int i=0;i<n;i++){
             System.out.println(arr[i]);
        }
        int start = 0;
        int end = arr.length-1; 
        int temp;

        while(start<end){
            temp = arr[start];
            System.out.println(temp);
            arr[start]=arr[end];
            System.out.println(arr[start]);
            arr[end]=temp;
            System.out.println(arr[end]);
            start++;
            end--;
        }
        System.out.println("the reverse array is ");
        for(int i=0;i<n;i++){
             System.out.println(arr[i]);
        }
        

    }

}