import java.util.Scanner;

final class Solution {
	private Solution() { }
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);      
        long base = s.nextInt();
        long exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
	}
/**
 * { function_description }.
 *
 * @param      base      The base
 * @param      exponent  The exponent
 *
 * @return     { description_of_the_return_value }
 */
	public static long power(final long base, final long exponent) {
		if (exponent > 0) {
			return (base * power(base, exponent - 1));
		}
		return 1;
	}
}
