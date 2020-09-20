package nest4codeassignment;
import java.util.Scanner;

public class assignment1_1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.print("price 1:");
	double p1=sc.nextDouble();
	System.out.print("price 2:");
	double p2=sc.nextDouble();
	System.out.print("price 3:");
	double p3=sc.nextDouble();
	System.out.print("tax %:");
	double taxPercentage=sc.nextDouble();
	double totalPriceOfAllProducts=p1+p2+p3;
	double taxAmount=taxPercentage/100 * totalPriceOfAllProducts;
	double totalPriceOfAllProductsInclusveTax=totalPriceOfAllProducts+ taxAmount;
	System.out.print("Final Amount:"+ totalPriceOfAllProductsInclusveTax);
	

	}

}
