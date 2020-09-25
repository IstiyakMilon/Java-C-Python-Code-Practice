import java.text.*;
import java.util.*;
public class CentimeterToFeetInch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.000");
        
        double centimeter, feet, inch;
        // Taking input in inches
        System.out.print("Please enter the values in centimeter: ");
        centimeter=scanner.nextDouble();
        //Calculating Feet and Inches
        feet=centimeter*0.0328084;
        inch=centimeter*0.3937008;
        System.out.println("Centimeter to feet is: " + df.format(feet));
        System.out.println("Centimeter to inch is: " + df.format(inch));
	}

}
