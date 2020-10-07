import java.util.*;
public class Chap6Prob6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int startNum, endNum, breakNum;
		
		System.out.print("Please enter the starting number: ");
		startNum=scanner.nextInt();
		System.out.print("Please enter the ending number: ");
		endNum=scanner.nextInt();
		System.out.print("Please enter the number where to break: ");
		breakNum=scanner.nextInt();
		
		for(int i=startNum; i<=endNum; i++) {
			System.out.print(i +" ");
			if(i%startNum==breakNum) {
				System.out.print("\n");
			}
		}

	}

}
