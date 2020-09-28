import java.util.*;
import java.text.*;
public class Chap4Prob9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		
		//Declaring variables
		double innerRadius, outerRadius, circleAreaDifference;
		
		//Taking input radii
		System.out.print("Please enter the Inner Radius: ");
		innerRadius=scanner.nextDouble();
		System.out.print("Please enter the Outer radius: ");
		outerRadius=scanner.nextDouble();
		
		//Declaring and creating Circle object
		Circle innerCircle=new Circle();
		Circle outerCircle=new Circle();
		
		//Setting the radius values of the circles
		innerCircle.setRadius(innerRadius);
		outerCircle.setRadius(outerRadius);
		
		//Calculating circle area
		double innerCircleArea=innerCircle.calculateArea();
		double outerCircleArea=outerCircle.calculateArea();
		
		//Calculating the difference of the circle
		circleAreaDifference=outerCircleArea-innerCircleArea;
		
		//Printing the result
		System.out.println("The difference of the inner and the outer circle is "+ df.format(circleAreaDifference));

	}

}
