import java.util.Scanner;
/**
 * { item_description }
 */
import java.lang.Math.*;
/**
 * { item_description }
 */

public final class Solution {
    // object takingprivate Solution() { }
    public static void main(String[] args) {
        /**
         * { var_description }
         */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        roots(a, b, c);
    }
    private Solution() { }
     /**
     * { function_description }
     *
     * @param      x     { parameter_description }
     * @param      y     { parameter_description }
     * @param      z     { parameter_description }
     */
    public static void roots(final int x, final int y, final int z) {
        double rot1;
        double rot2;
        double quad;
        final int b = 4;
        quad = Math.sqrt((y * y) - (b * x * z));
        rot1 = (-y + quad) / (2 * x);
        rot2 = (-y - quad) / (2 * x);
        System.out.println(rot1 + " " + rot2);
    }
}
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
	 */

