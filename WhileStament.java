public class WhileStament {
    public static void main(String[] args) {
        int number = 5;
        int finishNumber = 20;
        int evenNumberFound = 0;
        
        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;

            evenNumberFound++;
            if(evenNumberFound >= 5) {
                break;
            }
        }

        System.out.println("Total even number found = " + evenNumberFound);
    }

    public static boolean isEvenNumber(int number) {
        if((number % 2) == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}