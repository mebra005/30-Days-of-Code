import java.util.Scanner;

public class review {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t;
		String s = "";
		
		while (!scan.hasNextInt())
			scan.next();
		do {
			t = scan.nextInt();
		} while (t < 1 || t > 10);

		while (t >= 0) {
			s = scan.nextLine();
			char[] buffer = s.toCharArray();

			if (buffer.length >= 2 && buffer.length <= 10000) {

				for (int j = 0; j < buffer.length; j = j + 2) {
					System.out.print(buffer[j]);
				}

				System.out.print(" ");

				for (int k = 1; k < buffer.length; k = k + 2) {
					System.out.print(buffer[k]);
				}
				System.out.println();
			}

			t--;

		}
	}
}
