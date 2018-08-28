import java.util.Scanner;

class area_of_circle{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double radius = scan.nextDouble();
		double pi = 3.14;
		double area_of_circle;
		area_of_circle = (pi*radius*radius);
		System.out.println(area_of_circle);
	}
}