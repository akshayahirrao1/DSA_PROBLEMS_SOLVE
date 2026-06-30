import java.util.Scanner;
class findSecondLargest{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        int Largest= Integer.MIN_VALUE;
        int secondlargest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>Largest)
            {
                secondlargest=Largest;
                Largest=arr[i];
            }
            else if(arr[i]>secondlargest && arr[i]!=Largest)
            {
                secondlargest=arr[i];
            }
        
        }
        if(secondlargest==Integer.MIN_VALUE){
            System.out.println("no second large element found");
        }
        else{
        System.out.println("the second largest element is "+secondlargest);
        }
        sc.close();

    }
}