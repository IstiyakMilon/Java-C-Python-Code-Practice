import java.util.*;
public class Chap2Prob19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String firstName, middleName, lastName, middleInitial;
		System.out.println("Please enter your first Name, Middle Name, Last Name: ");
		firstName=scanner.next();
		middleName=scanner.next();
		lastName=scanner.next();
		middleInitial=middleName.substring(0, 1);
		System.out.println(firstName+" " + middleInitial + ". " + lastName);

	}

}
