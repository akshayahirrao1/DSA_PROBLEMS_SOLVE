class FrequencyCountArr{
    public static void main(String[] args){
        int[] arr={1,1,2,3,4,4,5};
        for(int i=0;i<arr.length;i++){
                boolean alreadyProccessed=false;
            for(int k=0;k<i;k++){
                if(arr[k]==i){
                    alreadyProccessed=true;
                }
            }
            int count=0;
                if(alreadyProccessed){
                    continue;
                }
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            
        }
            System.out.println("the frequency of number:"+arr[i]+" is "+count);
        }
    }
}