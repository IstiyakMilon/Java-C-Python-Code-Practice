import java.util.*;
import java.text.*;

public class MyJavaCoffeeOutlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		
		
		// Declaring variables and constants
		final double COST_PER_BAG=5.50;
		final int LARGE_BOX=20;
		final int MEDIUM_BOX=10;
		final double SMALL_BOX=5;
		final double LARGE_BOX_COST=1.8;
		final double MEDIUM_BOX_COST=1.0;
		final double SMALL_BOX_COST=0.6;
		int numOfBagOrdered, numOfLargeBox, numOfMediumBox;
		double numOfSmallBox;
		double totalCost;
		
		//Taking input as bags
		System.out.print("Number of bags ordered: ");
		numOfBagOrdered=scanner.nextInt();
		int temp,a;
		a=numOfBagOrdered;
		temp=a;
		numOfLargeBox=a/LARGE_BOX;
		if(numOfLargeBox>0) {
			a=a%LARGE_BOX;
			temp=a;
		}
		else {
			a=temp;
		}
		numOfMediumBox=a/MEDIUM_BOX;
		if(numOfMediumBox>0) {
			a=a%MEDIUM_BOX;
			temp=a;
		}
		else {
			a=temp;
		}
		numOfSmallBox=Math.ceil(a/SMALL_BOX);
		
		//Calculating Total Price
		totalCost=COST_PER_BAG*numOfBagOrdered + numOfLargeBox*LARGE_BOX_COST + numOfMediumBox*MEDIUM_BOX_COST + numOfSmallBox*SMALL_BOX_COST;
		System.out.println("Number of Bags Ordered: "+numOfBagOrdered +" - $ " +df.format(numOfBagOrdered*COST_PER_BAG));
        System.out.println("Boxes Used: ");
        System.out.println("            " + numOfLargeBox + " Large  - $"+df.format(numOfLargeBox*LARGE_BOX_COST));
        System.out.println("            " + numOfMediumBox + " Medium - $"+df.format(numOfMediumBox*MEDIUM_BOX_COST));
        System.out.println("            " + Math.round(numOfSmallBox) + " Small  - $"+df.format(numOfSmallBox*SMALL_BOX_COST));
		System.out.println("Your total cost is:  $ "+df.format(totalCost));
		

	}

	

}
