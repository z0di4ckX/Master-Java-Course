public class FactorPrinter {
    public static void printFacotors(int number) {
        String factorOfNumber = "";
        
        if(number >= 1) {
            for(int i = 1; i <= number; i++) {
                if(number % i == 0) {
                    factorOfNUmber += i + " ";
                }
            }
            System.out.println(factorOfNumber);
        }
        else {
            System.out.println("Invalid value");
        }
    }
}