import java.util.Scanner;

class find_largest_element_array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the elements of the array");
        for(int j=0;j<n;j++){
            arr[j] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("the largest number in the array is "+ largest);
        sc.close();
    }
}