
/*Print all  integers in  in reverse order as a single line of space-separated integers.*/
import java.util.Scanner;

public class ArrayDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arraySize = scan.nextInt();
		

		int counter = 0;
		int[] myArray = new int[arraySize];

		while(counter < arraySize){
			for(int i = 0 ; i < arraySize ; i++){
				myArray[i] = scan.nextInt();
				counter++;
			}
		}
		scan.close();
		for(int i = arraySize -1   ; i > -1; i--){
			System.out.print(myArray[i] + " ");
		}

	}

}
