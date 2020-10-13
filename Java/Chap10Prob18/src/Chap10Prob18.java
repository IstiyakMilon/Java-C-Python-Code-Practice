import java.util.*;
public class Chap10Prob18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Fortune fortune;
		String inputString ="";
		System.out.print("Fortune (y/N)? ");
		while(!inputString.equalsIgnoreCase("n")) {
			inputString = scanner.next();
			if(inputString.equalsIgnoreCase("y")) {
				fortune = new Fortune();
			}else {
				System.out.println("Please try again!");
				break;
			}
		}
	}
}
