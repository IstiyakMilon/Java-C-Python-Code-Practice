import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number=scanner.nextInt();
//	    scanner.close();
		if(number%2==0) {
			System.out.println(number+ " is even");	
		}
		else {
			System.out.println(number+ " is odd");	
		}
		
      
	}

}
