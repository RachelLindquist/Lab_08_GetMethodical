import java.util.Scanner;

public class Reggie {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //Use your getRegExString method several times.
       // - get a SSN from the user using this pattern: \\d{3}-\\d{2}-\\d{4}
        //- get a UC Student M number using this pattern (M|m)\\d{5}
        //-get a menu choice using this pattern [OoSsVvQq]
        //these letters are mnemonics for the menu choices Open Save View Quit

        //Do several test runs with strings that match and fail each pattern.

        String social = "";
        String mNum = "";
        String menuChoice;
        social = SafeInput.getRegExString(in, "Please enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        mNum = SafeInput.getRegExString(in, "Please enter your UC Student M number", "(M|m)\\d{5}");
        menuChoice = SafeInput.getRegExString(in, "Please enter your menu choice", "[OoSsVvQq]");
        System.out.println("\nYour SSN is " + social + ", your m number is " + mNum + " and your menuChoice is " + menuChoice);
    }
}
