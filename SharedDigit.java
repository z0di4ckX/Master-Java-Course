public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second) {
        
        if(first < 10 || first > 99 || second < 10 || second > 99) {
            return false;
        }

        for(int i = first; i > 0; i /= 10) {
            int firstLast = i % 10;
            for(int j = second; j > 0; j /= 10) {
                int secondLast = j % 10;
                if(firstlast == secondLast) {
                    return false;
                }
            }
        }
        return false;
    }
}