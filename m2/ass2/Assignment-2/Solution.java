import java.util.Scanner;
import java.lang.Math.*;

public final class Solution {
	// object taking
	private Solution(){}


	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		roots(a, b, c);
	}
    public static void roots(final int x, final int y, final int z) {
        double root1;
        double root2;
        double quad;
        final int b = 4;
        quad = Math.sqrt((y*y)-(b*x*z));
        root1 = (-y+quad) / (2*x);
        root2 = (-y-quad) / (2*x);
        System.out.println(root1+" "+root2);
    }
}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/

