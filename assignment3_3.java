package nest4codeassignment;

import java.util.Scanner;

public class assignment3_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String name=sc.nextLine();
	
		String add="";
		for (int i=name.length()-1;i>=0;i--) {
			
			add=add+name.charAt(i);
		}
		if(add.equals(name)) {
			System.out.println("Is Palindrome");
			
		}

		else {
			System.out.println("Not Palindrome");
		}
		
		
		
		
		
		
		
		
	}
}
