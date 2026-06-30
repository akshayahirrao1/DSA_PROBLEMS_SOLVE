class binarynumber
{
    public static void main(String[] args){
        int num=5;
        String binary="";
        // while(num>0)
        // {
        // int remainder= num%2;
        // binary=binary+remainder;
        // num= num/2;
        // }
        //another way using & operator
        while(num > 0) {

            int bit = num & 1;

            binary = bit + binary;

            num = num >> 1; 
            }
        System.out.println(binary);
    }
}
