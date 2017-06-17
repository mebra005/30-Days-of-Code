import java.util.Scanner;
import java.util.*;
import java.math.*;

import org.w3c.dom.stylesheets.MediaList;

public class Operators {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        double temp;
        scan.close();
      
        
        temp = mealCost + (mealCost * ((double)tipPercent / 100)) + (mealCost * ((double)taxPercent / 100));
        
        // cast the result of the rounding operation to an int 
        int totalCost = (int) Math.round(temp);
      
        System.out.println("The total meal cost is " + totalCost + " dollars.");
		

	}

}
