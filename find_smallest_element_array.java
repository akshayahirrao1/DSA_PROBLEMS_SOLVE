import java.util.*;

class find_smallest_element_array{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++)
        {
        arr[i]= sc.nextInt();
        }
        int min= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("the smallest element in the array is"+min);
        sc.close();
   
    }
}