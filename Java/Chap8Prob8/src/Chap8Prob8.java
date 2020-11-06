import java.util.*;

public class Chap8Prob8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    final String BLANK="";
		String name=BLANK;
		String room=BLANK;
		String pwd=BLANK;
		Scanner scanner=new Scanner(System.in);
		
		try {
			while(!name.equals("Admin") && !room.equals("X123") && !pwd.equals("$maTrix%Two$")) {
				System.out.print("Enter name: ");
				name=scanner.next();
				System.out.print("Enter room number: ");
				room=scanner.next();
				System.out.print("Enter password: ");
				pwd=scanner.next();
			}
		}catch (Exception e) {
			System.out.print("Programm terminated successfully");
		}

	}

}
