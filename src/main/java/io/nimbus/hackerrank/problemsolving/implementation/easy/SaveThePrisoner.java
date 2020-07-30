package io.nimbus.hackerrank.problemsolving.implementation.easy;

/**
 * https://www.hackerrank.com/challenges/save-the-prisoner/problem
 */
public class SaveThePrisoner {

    static int saveThePrisoner(int nPrisoners, int mSweets, int sStart) {

        // surprisingly tricky.
        int remainder = mSweets % nPrisoners;
        int position = remainder == 0 ? nPrisoners : remainder;// so if the number of prisoners divide perfectly, then it is the last prisoner that will get the sweet.
        int offset = position + sStart - 1; // now add the offset of the start position. note that start position 2 is + 1, therefore the -1 in the code
        if (offset > nPrisoners)// if after added the offset we are greater than the number of prisoners we loop back, a modulo agin
            return offset % nPrisoners;
        else
            return offset;// else obvious
    }

    public static void main(String[] args) {
        System.out.println("should be 7: " + saveThePrisoner(7, 7, 1));
        System.out.println("should be 1: " + saveThePrisoner(1, 1, 1));
        System.out.println("should be 1: " + saveThePrisoner(7, 8, 1));
        System.out.println("should be 1: " + saveThePrisoner(1, 16, 1));
        System.out.println("should be 3: " + saveThePrisoner(3, 7, 3));
        System.out.println("should be 6: " + saveThePrisoner(7, 19, 2));
        System.out.println("should be 2: " + saveThePrisoner(5, 2, 1));
        System.out.println("should be 3: " + saveThePrisoner(5, 2, 2));
    }
}
