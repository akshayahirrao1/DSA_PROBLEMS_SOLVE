class findSortedArray{
public static void main (String[] args)
{
    int arr[]={1};
    boolean isSorted = true;
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i]>arr[i+1])
        {
            isSorted=false;
            break;
        }
    }
    if(isSorted)
    {
        System.out.println("array is sorted");
    }
    else if(!isSorted)
    {
        System.out.println("array is not sorted");
    }
    
}
}

