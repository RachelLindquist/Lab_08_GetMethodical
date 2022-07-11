import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double total = 0;
        boolean cont = true;
        do {
            total += SafeInput.getRangedDouble(in, "Enter your item price", 0.50, 9.99);
            cont = SafeInput.getYNConfirm(in, "Do you have more items? Y or N");
        } while (cont);

        System.out.println("Your total is " + String.format("%.2f", total));
    }
}
