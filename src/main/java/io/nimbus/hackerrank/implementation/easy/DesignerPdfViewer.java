package io.nimbus.hackerrank.implementation.easy;

/**
 * https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 */
public class DesignerPdfViewer {

    private final static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    static int designerPdfViewer(int[] h, String word) {

        int height = -1;
        for (char c : word.toCharArray()) {
            int charHeight = h[alphabet.indexOf(c)];
            if (charHeight > height) {
                height = charHeight;
            }
        }

        int width = word.length();

        return width * height;
    }
}
