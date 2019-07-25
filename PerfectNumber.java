public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if(num <= 0) {
            return false;
        }

        int remainder;
        int sum = 0;

        for(int i = 1; i < ((num / 2) + 1); i++) {

            remainder = num % 1;
            if(remainder == 0) {
                sum += i;
                System.out.println("Sum is: " + sum);
            }
        }

        if(sum == num) {
            return true;
        }

        return false;
    }
}