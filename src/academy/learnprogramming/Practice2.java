package academy.learnprogramming;

import java.util.Calendar;

public class Practice2 {
    // Display today's date in the format of "令和xx年xx月xx日"
    // the original question was to display the date as 平成 (use -1988 at the year field)
    public static void main(String[] args) {

        Calendar now;
        int year, month, date;

        now = Calendar.getInstance();
        year = now.get(Calendar.YEAR) - 2018;
        month = now.get(Calendar.MONTH) + 1;
        date = now.get(Calendar.DATE);

        System.out.println("令和" + year + "年" + month + "月" + date + "日");


    }

}
