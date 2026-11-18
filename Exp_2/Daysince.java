package Exp_2;

// using java.time package to calculate the number of days since 1 January 1970
/*
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Days {
    public static void main(String[] args) {

        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        LocalDate startDate = LocalDate.of(1970, 1, 1);
        LocalDate givenDate = LocalDate.of(year, month, day);

        long days = ChronoUnit.DAYS.between(startDate, givenDate);

        System.out.println("Number of days since 1 January 1970 = " + days);
    }
}
*/

class Days {
    public static void main(String[] args) {

        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        long totalDays = 0;

        // Days in complete years from 1970
        for (int y = 1970; y < year; y++) {

            if (isLeapYear(y)) {
                totalDays = totalDays + 366;
            }
            else {
                totalDays = totalDays + 365;
            }
        }

        // Days in complete months of the given year
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        for (int m = 1; m < month; m++) {
            totalDays = totalDays + daysInMonth[m - 1];
        }

        // Add completed days of current month
        totalDays = totalDays + (day - 1);

        System.out.println(
            "Number of days since 1 January 1970 = " + totalDays
        );
    }

    static boolean isLeapYear(int year) {

        if (year % 400 == 0) {
            return true;
        }
        else if (year % 100 == 0) {
            return false;
        }
        else if (year % 4 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}