import java.util.*;
import java.text.*;
public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.000");
		
		//Declaring variables
		double celsius, fahrenheit;
		//Taking input in celsius
		System.out.print("Please enter the temperature value in Celsius: ");
		celsius=scanner.nextDouble();
		fahrenheit=1.8*celsius+32;
		System.out.println("Celsius to fahrenheit is " + df.format(fahrenheit));

	}

}
