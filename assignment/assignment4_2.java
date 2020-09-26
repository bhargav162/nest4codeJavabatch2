package nest4codeassignment;

import java.util.Scanner;

public class assignment4_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Number");
		int number=sc.nextInt();
		number=++number;
	for (int i=2;i*i<=number;i++) {
		if(number%i==0) {
			number++;
		}
		else {
			System.out.println(number);
			break;
		}
		
		
		 
		
	}
		
		
		
		
		
		
	}

}
