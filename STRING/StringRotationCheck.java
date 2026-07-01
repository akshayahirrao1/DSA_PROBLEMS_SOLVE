class StringRotationCheck{
    public static void main(String[] args){
        String str1 = "waterbottle";
        String str2 = "erbottlewat";

        if(str1.length() != str2.length()){
            System.out.println("Strings are not rotation of each other");
        }
        else{
            String str3= str1+str1;
            if(str3.contains(str2)){
                System.out.println("string is rotation of each other");
                        }
            else{
                System.out.println("strings are not rotation of each other");
            }
        }
    }
}