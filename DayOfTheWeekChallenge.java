public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
        
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
    }

    private static void printDayOfTheWeek(int day) {
        if(day == 0) {
            System.out.println("Sunday");
        }
        else if(day == 1) {
            System.out.println("Monday");
        }
        else if(day == 2) {
            System.out.println("Tusday");
        }
        else if(day == 3) {
            System.out.println("Wednesday");
        }
        else if(day == 4) {
            System.out.println("Thursday");
        }
        else if(day == 5) {
            System.out.println("Friday");
        }
        else if(day == 6) {
            System.out.println("Satruday");
        }
        else {
            System.out.println("Invadie day");
        }
    }
}