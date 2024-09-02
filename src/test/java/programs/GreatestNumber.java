package programs;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		  int greatest;
		  Scanner sc = new Scanner(System.in);
		
		  // Input three numbers 
		  System.out.println("Enter three numbers:"); int a =
		  sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
		 
		  
		 /** if(a >= b && a >= c){ greatest=a; }
		 * 
		 * else if (b >= a && b>=c) { greatest=b; } else { greatest=c; }
		 * 
		 * // Output the result
		 * System.out.println("Greatest number using if-else with &&: " + greatest);
		 */
    //using ternary operator
    greatest=(a>b)?((a>c)? a:c):((b>c)?b:c);
    System.out.println(greatest);

    sc.close();
}
}