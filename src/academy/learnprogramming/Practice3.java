package academy.learnprogramming;

import java.util.Calendar;

public class Practice3 {
    // Display the number of days until your birthday this year.
    // If your birthday has already ended this year, display the number of days that have passed as a negative number
    public static void main(String[] args) {
        Calendar now, birthday;
        int dayOfYear, days;

        now = Calendar.getInstance();
        birthday = Calendar.getInstance();

        birthday.set(now.get(Calendar.YEAR), 10, 30); // Set birthday month - 1
        days = birthday.get(Calendar.DAY_OF_YEAR) - now.get(Calendar.DAY_OF_YEAR);

        System.out.println("誕生日まであと" + days + "日です");

    }


}
