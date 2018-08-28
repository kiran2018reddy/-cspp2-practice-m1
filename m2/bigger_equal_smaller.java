import java.util.Scanner;
public class bigger_equal_smaller{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	double varA = scan.nextDouble();
	double varB =  scan.nextDouble();
	if(varA> varB){
		System.out.println("Bigger");
	}
	
	else if (varA< varB){
		System.out.println("Equal");
	}
    else{
    	System.out.println("Smaller");


    }
    }
}   
