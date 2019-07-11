public class Challenge {
    public static void main(String[] args) {
        double myValue = 20d;
        double myValue1 = 80d;

        double myTotal = (myValue + myValue1) * 25;
        double theRemainder = myTotal % 40;

        System.out.println("myTotal = " + myTotal);
        System.out.println("Remainder is " + theRemainder);

        if (theRemainder <= 20) {
            System.out.println("Total was over the limit");
        }
    }
}