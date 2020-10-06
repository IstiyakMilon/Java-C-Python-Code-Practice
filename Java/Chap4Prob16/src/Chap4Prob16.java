import java.util.*;
import java.text.*;
public class Chap4Prob16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
        int numOfBagSold, weightPerBag; 
        double totalPrice;
		
		//Taking input of bag sold and weight per bag
		System.out.print("Number of bag sold: ");
		numOfBagSold=scanner.nextInt();
		System.out.print("Unit weight per bag is: ");
		weightPerBag=scanner.nextInt();
		
		CoffeeBag coffeebag= new CoffeeBag();
		coffeebag.setBagSold(numOfBagSold);
		coffeebag.setWeightPerBag(weightPerBag);
		
		totalPrice=coffeebag.getTotalPriceWithTax();
		//Printing Result
		System.out.println("Number of bags sold: "+numOfBagSold);
		System.out.println("     Weight per bag: "+weightPerBag+" lb");
		System.out.println("    Price per pound: $"+df.format(coffeebag.getUnitPrice()));
		System.out.println("          Sales tax: "+df.format(coffeebag.getSalesTax()*100)+"%"+"\n");
		System.out.print("        Total price: $ "+df.format(totalPrice));

	}

}
