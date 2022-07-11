import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String message = "";
        message = SafeInput.getNonZeroLenString(in, "What is your message");

        SafeInput.prettyHeader(message);

    }
}
