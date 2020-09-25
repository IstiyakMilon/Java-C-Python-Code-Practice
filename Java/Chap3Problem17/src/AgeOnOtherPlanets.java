import java.util.*;
import java.text.*;
public class AgeOnOtherPlanets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.000");
		
		//Declaring vaiables and constant
		final int DAY_IN_MURCURY_YEAR=88;
		final int DAY_IN_VENUS_YEAR=255;
		final int DAY_IN_JUPITER_YEAR=4380;
		final int DAY_IN_SATURN_YEAR=10767;
		double ageInEarth, ageInMurcury, ageInVenus, ageInJupiter, ageInSaturn;
		//Taking input age
		System.out.print("Please enter your age: ");
		ageInEarth=scanner.nextDouble();
		ageInMurcury=(ageInEarth*365)/DAY_IN_MURCURY_YEAR;
		ageInVenus=(ageInEarth*365)/DAY_IN_VENUS_YEAR;
		ageInJupiter=(ageInEarth*365)/DAY_IN_JUPITER_YEAR;
		ageInSaturn=(ageInEarth*365)/DAY_IN_SATURN_YEAR;
		System.out.println("Age on Murcury: " +df.format(ageInMurcury) + " Years");
		System.out.println("Age on Venus: " +df.format(ageInVenus) + " Years");
		System.out.println("Age on Jupiter: " +df.format(ageInJupiter) + " Years");
		System.out.println("Age on Saturn: " +df.format(ageInSaturn) + " Years");
		

	}

}
