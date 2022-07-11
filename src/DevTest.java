import java.util.Scanner;

public class DevTest {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String stringHolder = "";
        int intHolder = 0;
        double doubleHolder = 0.0;
        boolean boolHolder = false;

        System.out.println("Testing getNonZeroLenString");
        stringHolder = SafeInput.getNonZeroLenString(in,"Enter a test string");

        System.out.println("Testing getInt");
        intHolder = SafeInput.getInt(in,"Enter a test int");

        System.out.println("Testing getDouble");
        doubleHolder = SafeInput.getDouble(in,"Enter a test double");

        System.out.println("Testing getRangedInt");
        intHolder = SafeInput.getRangedInt(in,"Enter a test int", 0, 100);

        System.out.println("Testing getRangedDouble");
        doubleHolder = SafeInput.getRangedDouble(in,"Enter a test int", 0.0, 100.0);

        System.out.println("Testing getYNConfirm");
        boolHolder = SafeInput.getYNConfirm(in,"Enter a Y or N");

        System.out.println("Testing getRegExString");
        stringHolder = SafeInput.getRegExString(in, "Enter test value", "[abc]");

        System.out.println("Testing prettyHeader");
        SafeInput.prettyHeader("Test");
    }
}
