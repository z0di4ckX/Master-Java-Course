public class NumberPalindrome {
    
    public static boolean isPlalindrome(int number) {
        int reverse = 0; 
        int lastDigit, temp;

        if(number < 0) {
            temp = number * -1;
            System.out.println(temp);
        }
        else {
            temp = number;
            System.out.println(temp);
        }

        while(temp > 0) {
            lastDigit = temp % 10;
            System.out.println(lastDigit);
            reverse  *= 10 + lastDigit;
            temp /= 10;
        }

        System.out.println(reverse);

        if(Math.abs(reverse) == Math.abs(number)) {
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }

    }
}