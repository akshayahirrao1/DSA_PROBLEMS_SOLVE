class Palindrome{
    static boolean isPalindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return isPalindrome(str,start+1,end-1);
    }
    public static void main(String[] args)
    {
      String str="madam";
      int len= str.length();
      boolean answer=isPalindrome(str,0,len-1);
      if(answer){
        System.out.println("the string is palidrome");
      }
      else{
        System.out.println("the string is not palidrome");
      }
    }
}