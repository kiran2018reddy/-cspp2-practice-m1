import java.util.Scanner;

class area_of_circle{
	public static void main(String[] args){
		double radius;
	    Scanner scan = new Scanner(System.in);
		radius = scan.nextDouble();
		System.out.println(area(radius));
	}
	static double pi(){
		return 3.14;
	}
	static double area(double radius){
		return pi()*radius*radius;
	}

	}
	