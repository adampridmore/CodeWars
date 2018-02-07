public class CaffeineBuzz {
    public static String caffeineBuzz(int n){
        String baseLanguage = getBaseLanguage(n);

        if (baseLanguage.isEmpty()){
            return "mocha_missing!";
        }
        if (n % 2 == 0){
            return baseLanguage + "Script";
        }else{
            return baseLanguage;
        }
    }

    private static String getBaseLanguage(int n) {
        if (n % 3 == 0 && n % 4 == 0){
            return "Coffee";
        }else if (n % 3 == 0){
            return "Java";
        }
        return "";
    }
}