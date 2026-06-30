class FirstLastOccurence{
    public static void main(String[] args){
   int arr[]={1,2,2,2,3,4};
   int target=20;
   int firstoccurence=-1;
   int lastoccurence=0;
   int start=0;
   int end= arr.length-1;
   while(start<=end){
         
         int mid=start+(end-start)/2;
         if(arr[mid]==target)
         {
            firstoccurence=mid;
            end = mid-1;
            }
         else if(target>arr[mid]){
            start=mid+1;
            }
         else{
             end=mid-1; 
          }
        } 
         start=0;
         end=arr.length-1;
   while(start<=end){
         int mid=start+(end-start)/2;
         if(arr[mid]==target){
            lastoccurence=mid;
            start = mid+1;
            }
         else if(target>arr[mid])
         {
            start=mid+1;
        }
         else{
             end=mid-1; 
          }
        } 
     if(firstoccurence!=-1){
     int count=lastoccurence-firstoccurence+1;
     System.out.println("firstoccurence:"+firstoccurence+"\nlastoccurence:"+lastoccurence+" \nthe total count is:"+count);
     }
     else{
        System.out.println("not found");
     }

         }
   }
    
