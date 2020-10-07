import java.util.*;
public class PrintPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		//Declaring variable
		int startNum, endNum, isPrime;
		
		//Taking starting and ending number
		while(true) {
			System.out.print("Please enter the starting number: ");
			startNum=scanner.nextInt();
			if(startNum>=2) {
				break;
			} else {
				System.out.print("Please enter the starting number: ");
				startNum=scanner.nextInt();
			}
		}
		
		while(true) {
			System.out.print("Please enter the ending number: ");
			endNum=scanner.nextInt();
			if(endNum>=2) {
				break;
			} else {
				System.out.print("Please enter the ending number: ");
				endNum=scanner.nextInt();
			}
		}
		
		Date startTime=new Date();
		for(int i=startNum; i<=endNum; i++) {
			isPrime=1;
			for(int j=2; j<i/2; j++) {
				if(i%j==0) {
					isPrime=0;
				}
			}
			if(isPrime==1) {
				System.out.print(i+ " ");
			}
			
		}
		
		Date endTime=new Date();
		
		
		long elapseTimeInMiliSec=endTime.getTime()- startTime.getTime();
		System.out.print("\nThe required time to calculate prime numbers is: "+ elapseTimeInMiliSec + " Milli Second");

	}

}
