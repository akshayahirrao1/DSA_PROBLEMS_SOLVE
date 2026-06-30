
class EvenOddCount{
    public static void main(String[] args){
        int[]arr={1,2,3,4,5,6};
        int evencount=0;
        int oddcount=0;
        for(int num:arr)
        {
            if(num%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("even numbeers are:"+evencount);
        System.out.println("odd numbeers are:"+oddcount);

    }
}