package io.nimbus.hackerrank.interviewperparationkit.sorting.medium;


/**
 * https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class FraudulentActivityNotifications {
    static int activityNotifications(int[] expenditure, int d) {
        int n = 0;

        double halfIndex1 = Math.floor((d - 1) / 2.0);
        double halfIndex2 = Math.ceil((d - 1) / 2.0);

        int[] countArray = new int[201];// largest this could be is 200 so not that bad

        //1. get the count of the previous days
        for (int i = 0; i < d - 1; i++) {
            countArray[expenditure[i]]++;
        }

        for (int i = d; i < expenditure.length; i++) {
            double med1 = 0.0;
            double med2 = 0.0;
            for (int j = 0, k = 0; k <= halfIndex1; k += countArray[j], j++) med1 = j;
            double median;
            if (halfIndex1 == halfIndex2) {
                median = med1;
            } else {
                for (int j = 0, k = 0; k <= halfIndex2; k += countArray[j], j++) med2 = j;
                median = (med1 + med2) / 2.0;
            }

            if (expenditure[i] >= 2.0 * median)
                n++;

            // this is why you don't need an array, since the list of possible values is 0-200 inclusive.
            countArray[i - d]--;
            countArray[expenditure[i]]++;
        }

        System.out.println(n);
        return n;
    }


    public static void main(String[] args) {
        System.out.println(activityNotifications(new int[]{




        }, 10000));
    }
}