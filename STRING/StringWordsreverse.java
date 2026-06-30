
class StringWordsreverse{
    public static void main(String[] args){
        String str="I     Love     Java     Programming";
        String[] words=str.split("\\s+");
        for(int i = words.length-1;i>=0;i--)
        {
            System.out.print(words[i]+" ");
        }
    }
}