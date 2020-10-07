import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int num;
		while(true) {
			System.out.print("Please enter the number: ");
			num=scanner.nextInt();
			if(num<=0) {
				break;
			}
			int isPrime=1;
			for(int i=2;i<num/2;i++) {
				if(num%i==0) {
					isPrime=0;
				}
			}
			if(isPrime==1) {
				System.out.println("Prime");
			} else {
				System.out.println("Not Prime");
			}
		}

	}

}
