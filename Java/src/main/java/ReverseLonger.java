public class ReverseLonger {
    public static String shorterReverseLonger(String a, String b) {
        String shortString;
        String longString;

        if (a.length() >= b.length()){
            longString = a;
            shortString = b;
        }else{
            longString = b;
            shortString = a;
        }

        return String.format("%s%s%s", shortString , reverseString(longString), shortString);
    }

    private static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
