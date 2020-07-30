package io.nimbus.hackerrank.problemsolving.implementation.easy;

/***
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 */
public class CatAndAMouse {

    static String catAndMouse(int x, int y, int z) {

        int catADistance = Math.abs(x - z);
        int catBDistance = Math.abs(y - z);
        int compare = Integer.compare(catADistance, catBDistance);

        if (compare == 0)
            return "Mouse C";
        else if (compare < 0)
            return "Cat A";
        else
            return "Cat B";
    }

    public static void main(String[] args) {
        System.out.println(catAndMouse(1,5,2));
        System.out.println(catAndMouse(1,5,3));
        System.out.println(catAndMouse(1,5,4));
    }

}
