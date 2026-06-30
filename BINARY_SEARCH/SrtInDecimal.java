import java.util.Scanner;
class SrtInDecimal{
    public static int mySqrt(int x) {
        int s=0;
        int e=x;
        int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
        long square=(long) mid*mid; 
        if(square==x){
            return mid;
        }
        else if(square<x){
            ans=mid;
            s=mid+1;
        }
        else {
            e=mid-1;
        }
        mid=s+(e-s)/2;
        }
    return ans;
    }
    public static double morePrecision(int n,int precisions,int temp){
        double factor=1;
        double ans=temp;
        for(int i=0;i<precisions;i++){
            factor=factor/10;
            for(double j=ans;j*j<n;j=j+factor){
                ans=j;
            }
        }
        return ans;
    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number you want square root of");
         int n= sc.nextInt();
         int tempsol=mySqrt(n);
         double solution=morePrecision(n,3,tempsol);
         System.out.println(solution);
         sc.close();
    }
}