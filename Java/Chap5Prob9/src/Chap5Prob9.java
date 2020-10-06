import java.util.*;
public class Chap5Prob9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int power;
		System.out.print("Please enter the power of 10: ");
		power=scanner.nextInt();
		if(power==6) {
			System.out.print("10^6 is Million");
		} else if(power==9) {
			System.out.print("10^9 is Billion");
		} else if(power==12) {
			System.out.print("10^12 is Trillion");
		} else if(power==15) {
			System.out.print("10^15 is Quadrillion");
		} else if(power==18) {
			System.out.print("10^18 is Quintillion");
		} else if(power==21) {
			System.out.print("10^21 is Sextillion");
		} else if(power==30) {
			System.out.print("10^30 is Nonillion");
		} else if(power==100) {
			System.out.print("10^100 is Googol");
		} else {
			System.out.print("There is no name of the number for this kind of power of 10");
		}

	}

}
