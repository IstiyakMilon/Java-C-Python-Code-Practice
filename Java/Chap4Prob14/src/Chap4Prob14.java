import java.util.*;
import java.text.*;
public class Chap4Prob14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		
		//Declaring variables
		double userWeight, yourMoonWeight;
		
		// taking input weight
		System.out.print("Please enter the weight on Earth: ");
		userWeight=scanner.nextDouble();
		
		//Creating object of WeightCoverter and passing weight and weight ratio
		WeightConverter moonWeight=new WeightConverter(0.167);
		yourMoonWeight=moonWeight.convert(userWeight);
		
		//Printing Result
		System.out.print("Your weight on Moon is "+df.format(yourMoonWeight));
		
	}

}
