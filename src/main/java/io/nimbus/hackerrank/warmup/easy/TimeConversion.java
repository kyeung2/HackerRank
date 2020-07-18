package io.nimbus.hackerrank.warmup.easy;

/**
 * https://www.hackerrank.com/challenges/time-conversion/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class TimeConversion {

    static String timeConversion(String s) {

        String[] segments = s.split(":");
        int hours = Integer.parseInt(segments[0]);
        int minutes = Integer.parseInt(segments[1]);
        int seconds = Integer.parseInt(segments[2].substring(0, 2));
        String AMPM = segments[2].substring(2, 4);

        if (AMPM.equalsIgnoreCase("PM") && hours != 12)
            hours += 12;
        else if (AMPM.equalsIgnoreCase("AM") && hours == 12)
            hours = 0;

        return String.format("%02d", hours) +
                ":" +
                String.format("%02d", minutes) +
                ":" +
                String.format("%02d", seconds);


        //TODO the following works, but not sure why the website doesn't like it.
//        LocalTime time = LocalTime.parse(s.toLowerCase(), DateTimeFormatter.ofPattern("hh:mm:ssa"));
//        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public static void main(String[] args) {

        System.out.println(timeConversion("11:05:45PM"));
        System.out.println(timeConversion("12:40:22AM"));
        System.out.println(timeConversion("12:00:00AM"));
        System.out.println(timeConversion("12:00:00PM"));
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("06:40:03AM"));
        System.out.println(timeConversion("04:59:59AM"));


    }
}
