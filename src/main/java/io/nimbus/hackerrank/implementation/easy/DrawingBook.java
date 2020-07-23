package io.nimbus.hackerrank.implementation.easy;

public class DrawingBook {


    // this was tricky. The test cases helped a lot, the sketching also helped with the test cases.
    static int pageCount(int n, int page) {
        int half = n / 2;
        boolean useFront = page <= half;
        boolean isEven = page % 2 == 0;
        System.out.print(String.format("n:%s,page:%s  = ", n, page));

        if (useFront) {
            return page / 2;
        }

        int offset = isEven ? 0 : 1;
        return (n - page + offset) / 2;
    }

    public static void main(String[] args) {
        System.out.println("should be 0: " + pageCount(5, 1));
        System.out.println("should be 1: " + pageCount(5, 2));
        System.out.println("should be 1: " + pageCount(5, 3));
        System.out.println("should be 0: " + pageCount(5, 4));
        System.out.println("should be 0: " + pageCount(5, 5));

        System.out.println();

        System.out.println("should be 0: " + pageCount(6, 1));
        System.out.println("should be 1: " + pageCount(6, 2));
        System.out.println("should be 1: " + pageCount(6, 3));
        System.out.println("should be 1: " + pageCount(6, 4));
        System.out.println("should be 1: " + pageCount(6, 5));
        System.out.println("should be 0: " + pageCount(6, 6));
    }
}
