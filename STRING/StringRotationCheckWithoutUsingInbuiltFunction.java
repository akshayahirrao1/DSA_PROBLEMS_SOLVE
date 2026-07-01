
class StringRotationCheckWithoutUsingInbuiltFunction {

    public static void main(String[] args) {

        String str1 = "ABCD";
        String str2 = "CDAB";

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not rotation of each other");
            return;
        }

        String doubleString = str1 + str1;

        boolean isRotation = false;

        for (int i = 0; i < doubleString.length(); i++) {

            if (doubleString.charAt(i) == str2.charAt(0)) {

                int index = i;
                int j = 0;

                while (j < str2.length() && index < doubleString.length()) {

                    if (doubleString.charAt(index) != str2.charAt(j)) {
                        break;
                    }

                    index++;
                    j++;
                }

                if (j == str2.length()) {
                    isRotation = true;
                    break;
                }
            }
        }

        if (isRotation) {
            System.out.println("Strings are rotation of each other");
        } else {
            System.out.println("Strings are not rotation of each other");
        }
    }
}
