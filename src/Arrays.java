import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (!scan.hasNextInt())
			scan.next();
		int N = scan.nextInt();

		int[] A = new int[N];
		for (int i = N-1 ; i >= 0 ; i--) {
			A[i] = scan.nextInt();
		}
		

		for (int i : A) {
			System.out.print(i + " ");
		}

	}
}
