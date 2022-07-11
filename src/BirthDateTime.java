import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args)
    {
        //Use the getRangedInt method to input the year (1950-2010),
        // month (1-12), Day*, hours (1 – 24), Minutes (1-59) of a person’s birth.

        //Note: use a switch() conditional selector structure to limit the user to the correct
        // number of days for the month they were born in. For instance if they were born in Feb [1-29],
        // Oct [1-31].  HINT: there are only a few groups here not 12 different ones!
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2010);
        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        if (month == 2) {// feb
            if ((year-1952)%4 == 0) { // leap years
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 29);
            } else {
                day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 28);
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11){ //30 day months
            day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 30);
        } else { // 31 day months
            day = SafeInput.getRangedInt(in, "Enter your birth day", 1, 31);
        }

        hour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);

        minute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 60);


        System.out.println("\nYou were born in " + year + " on month " + month + " on day " + day + " at " + hour + ":" + minute);

    }
}
