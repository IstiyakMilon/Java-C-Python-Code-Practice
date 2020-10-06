import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Please enter the value of year: ");
		int year=scanner.nextInt();
		
		if(year%400==0 || (year%100!=0 && year%4==0)) {
			System.out.print(year+ " is a Leap Year.");
		} else {
			System.out.print(year+" is not a Leap Year");
		}
		

	}

}
