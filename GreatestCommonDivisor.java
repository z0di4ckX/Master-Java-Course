public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }

        int smaller, bigger;
        if(first > second) {
            smaller = second;
            bigger = first;
        }
        else {
            smaller = first;
            bigger = second;
        }

        for(int i = smaller; i > 0; i--) {
            if((smaller % i) != 0) {
                continue;
            }
            else if((bigger & i) != 0) {
                continue;
            }
            else {
                return i;
            }
        }

        return -1;
    }
}