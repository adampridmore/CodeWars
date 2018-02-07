public class SquareDigit {

    public int squareDigits(int number) {
        char[] numberChars = Integer.toString(number).toCharArray();

        StringBuilder squareDigitChars = new StringBuilder();
        for(char digitChar : numberChars){
            int digit = Integer.parseInt(new String(new char[]{digitChar}));

            int squareDigit = digit * digit;

            squareDigitChars.append(Integer.toString(squareDigit));
        }

        return Integer.parseInt(squareDigitChars.toString());
    }
}