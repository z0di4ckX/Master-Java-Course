public class SwitchStatement {
    public static void main(String[] args) {
        
        char charValue = 'G';
        switch(charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + "was found");
                break;
            default:
                System.out.println("Could not found A, B, C, D, E");
                break;
        }

        String month = "JuNe";

        switch(month.toLowerCase()) {
            case "jenuary":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
        }
    }
}