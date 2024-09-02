package programs;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		//number=6 ,28
		int number=sc.nextInt();
		int i, result=0;
		for(i=1;i<=number/2;i++)
		{
			if(number%i==0)
			{
				result=result+i;
			}
	
		}
	if(result==number)
			{
			System.out.println(number + ":" + " is a perfect no");
		}
			else
			{
			
				System.out.println(number + ":" + " is a not a perfect no");
			}
				
			sc.close();

	}

}
