class SUM_OF_ARRAY{
    int sum=0;
    public int sumofarray(int array[])
    {
    for (int i=0;i<array.length;i++)
    {
        sum=sum+array[i];
    }
    return sum;
    }

    
    public static void main(String[] args) {
        int arr[] = {1,3,6,3,5};
        SUM_OF_ARRAY obj = new SUM_OF_ARRAY();
        int result = obj.sumofarray(arr);
        System.out.println("the sum of the array is :"+result);
        
    }
}