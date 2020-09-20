package nest4codeassignment;

import java.util.Scanner;

public class assignment1_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Feet:");
		int feet=sc.nextInt();
		System.out.print("Inch:");
		int inch=sc.nextInt();
		System.out.print("Kg:");
		int kg=sc.nextInt();
		double  heightInCm=2.54*((feet*12)+inch);
		
		
				
				
				
				
				
				
		double weightInPounds=kg*2.24;
		System.out.println("Height in cm:" + heightInCm);
		System.out.print("Weight in pounds" + weightInPounds);
		
		
		
		
		
}
}