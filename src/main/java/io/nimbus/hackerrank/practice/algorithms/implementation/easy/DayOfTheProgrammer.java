package io.nimbus.hackerrank.practice.algorithms.implementation.easy;

/**
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */
public class DayOfTheProgrammer {

    private static final int[] MONTH_DAYS = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static final int DAY_OF_THE_PROGRAMMER = 256;

    static String dayOfProgrammer(int year) {

        boolean isJulianCalendar = year >= 1700 && year <= 1917;

        // need to read the instructions more carefully. Slow down as always coding the solution is fast. Understanding
        // is the skill to learn
        boolean isLeapYear = year % 4 == 0;
        if (!isJulianCalendar) {
            isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        }

        boolean isTransitionYear = year == 1918;
        int daysUsed = 0;
        int day = -1;
        int month = -1;
        for (int i = 0; i < MONTH_DAYS.length; i++) {

            int monthDay = MONTH_DAYS[i];
            // we after adding the days in the current month is less than the
            if (daysUsed + monthDay < DAY_OF_THE_PROGRAMMER) {
                daysUsed += monthDay;

                if (i == 1) {
                    if (isLeapYear)
                        daysUsed += 1;
                    if (isTransitionYear)
                        daysUsed -= 13;
                }
            } else {
                day = DAY_OF_THE_PROGRAMMER - daysUsed;
                month = i + 1;
                break;
            }
        }

        return String.format("%02d", day) + "." + String.format("%02d", month) + "." + year;
    }

    public static void main(String[] args) {

        System.out.println(dayOfProgrammer(1984));
        System.out.println(dayOfProgrammer(2017));
        System.out.println(dayOfProgrammer(2016));
        System.out.println(dayOfProgrammer(1800));
        System.out.println(dayOfProgrammer(2100));
    }


}
