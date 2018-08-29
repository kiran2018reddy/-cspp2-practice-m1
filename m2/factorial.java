import java.util.Scanner;
class factorial{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(k(num));

	}
	static int k(int num){
        int f = 1;
        if (num == 0 || num ==1){
    	    return f;
    }  		
        else{
        	f = num * k(num-1);
    	    return f;
    }
	}
}