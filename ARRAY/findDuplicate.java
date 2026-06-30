class findDuplicate{
    public static void main(String[] args){
        int []arr={1,2,3,4,4,5};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans= ans^arr[i];
        }
        for(int i=1;i<arr.length;i++){
            ans=ans^i;
        }
        System.out.println(ans);
        
    }
}