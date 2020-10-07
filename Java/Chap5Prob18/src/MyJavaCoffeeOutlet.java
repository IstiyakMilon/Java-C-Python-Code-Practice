import java.util.*;
import java.text.*;
public class MyJavaCoffeeOutlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		final double UNIT_PRICE=5.50;
		
		int numOfBagOrdered, discount;
		double totalPrice, totalDiscount, priceAfterDiscount;
		
		System.out.print("Please enter the numbur of bag ordered: ");
		numOfBagOrdered=scanner.nextInt();
		totalPrice=numOfBagOrdered*UNIT_PRICE;
		if(numOfBagOrdered>=300) {
			discount=30;
			totalDiscount=totalPrice*discount/100;
			priceAfterDiscount=totalPrice-totalDiscount;
		} else if(numOfBagOrdered>=200) {
			discount=25;
			totalDiscount=totalPrice*discount/100;
			priceAfterDiscount=totalPrice-totalDiscount;
		} else if(numOfBagOrdered>=150) {
			discount=20;
			totalDiscount=totalPrice*discount/100;
			priceAfterDiscount=totalPrice-totalDiscount;
		} else if(numOfBagOrdered>=100) {
			discount=15;
			totalDiscount=totalPrice*discount/100;
			priceAfterDiscount=totalPrice-totalDiscount;
		} else if(numOfBagOrdered>=50) {
			discount=10;
			totalDiscount=totalPrice*discount/100;
			priceAfterDiscount=totalPrice-totalDiscount;
		} else if(numOfBagOrdered>=25) {
			discount=5;
			totalDiscount=totalPrice*discount/100;
			priceAfterDiscount=totalPrice-totalDiscount;
		} else {
			discount=0;
			totalDiscount=totalPrice*discount/100;
			priceAfterDiscount=totalPrice-totalDiscount;
		}
		System.out.println("Number of Bags Ordered: "+numOfBagOrdered +" - $ "+ df.format(totalPrice) +"\n");
		System.out.println("              Discount: ");
		System.out.println("                        "+discount +"% - $ "+ df.format(totalDiscount) + "\n");
		System.out.print("  Your total charge is: $ "+df.format(priceAfterDiscount));

	}

}
