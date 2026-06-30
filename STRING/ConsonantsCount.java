class ConsonantsCount{
    public static void main(String[] args){
        int count=0;
        String str= "Hello World123";
        str= str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
                {
                   count++;
                 }
            }
        }
        System.out.println(count);
   }
}
