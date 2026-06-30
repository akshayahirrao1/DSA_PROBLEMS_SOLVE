class ReversetheString{
    public static void main(String[] args){
   
        StringBuilder str= new StringBuilder("Programming");

        // 1 way to reverse the string 
    //     for(int i=str.length()-1;i>=0;i--){
    //         System.out.print(str.charAt(i));
    //     }
    // 
    
    //second way to reverse string using build-in method
      str.reverse();
      System.out.println(str);
    
    }

}