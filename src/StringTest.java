public class StringTest {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "carrot";

        String maxString = str1;

        if (str2.compareTo(maxString) > 0) {
            maxString = str2;
        }

        if (str3.compareTo(maxString) > 0) {
            maxString = str3;
        }

        System.out.println("The maximum string is: " + maxString);
    }
}