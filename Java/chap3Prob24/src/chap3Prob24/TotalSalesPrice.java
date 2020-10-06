import java.util.*;
import java.text.*;

public class TotalSalesPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		
		//Declaring Variables and constants
		final double UNIT_PRICE=5.99;
		final double SALE_TAX=0.0725;
		double numOfBagSold, weightPerBag, totalSalesTax, totalPrice;
		
		//Taking input of bag sold and weight per bag
		System.out.print("Number of bag sold: ");
		numOfBagSold=scanner.nextDouble();
		System.out.print("Unit weight per bag is: ");
		weightPerBag=scanner.nextDouble();
		
		//Calculating total sales tax
		totalSalesTax=SALE_TAX*numOfBagSold*weightPerBag*UNIT_PRICE;
		
		//Calculating total price
		totalPrice=totalSalesTax + numOfBagSold*weightPerBag*UNIT_PRICE;
		
		//Printing Result
		System.out.println("Number of bags sold: "+numOfBagSold);
		System.out.println("     Weight per bag: "+weightPerBag+" lb");
		System.out.println("    Price per pound: $"+UNIT_PRICE);
		System.out.println("          Sales tax: "+df.format(SALE_TAX*100)+"%"+"\n");
		System.out.print("        Total price: $ "+totalPrice);

	}

}
