import java.util.Scanner;

public class loops {
	
	public static void multiply(int x){
		for(int i = 1; i <= 10 ; i++){
			System.out.println(x + " x " + i + " = " + (x*i) );
		}
	}
	
	
	public static void  checkNumber(int n){
		Scanner scan = new Scanner(System.in);
		if(n < 2 || n > 20){
			System.out.println("Please enter a number from 2 to 20: ");
			n = scan.nextInt();
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		checkNumber(n);
		multiply(n);
		

	}

}
