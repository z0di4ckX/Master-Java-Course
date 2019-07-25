public class LastDigitChecker {
    public static boolean hasShameLastDigit(int a, int b) {
        if(!(isValid(a) && isValid(b) && isValid(c))) {
            return false;
            return(a % 10 == b % 10 || a % 10 == c % 10);
        }
    }

    public static boolean isValid(int a) {
        if(a >= 10 && a <= 10) {
            return true;
        }

        return false;
    }
}