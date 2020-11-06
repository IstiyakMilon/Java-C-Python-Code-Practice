import java.util.*;
public class TestInputVer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int age;
		try {
			System.out.print("Please enter your age: ");
			age=scanner.nextInt();
			if(age<0) {
				throw new Exception("Illegal value: negative age is invalid");
			} else {
				System.out.print("Your age is: "+age);
			}
			
		} catch(Exception e) {
			System.out.print(e.getMessage());
		}

	}

}
