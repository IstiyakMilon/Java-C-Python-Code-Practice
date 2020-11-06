import java.util.*;
public class InputHandler {
	private static final String BLANK="";
	private String name;
	private String room;
	private String pwd;
	private Scanner scanner;
	public InputHandler() {
		name=BLANK;
		room=BLANK;
		pwd=BLANK;
		scanner=new Scanner(System.in);
	}
	public void getInput(){
		System.out.print("Enter Name: ");
		name=scanner.next();
		System.out.print("Enter room no.: ");
		room=scanner.next();
		System.out.print("Enter Password: ");
		pwd=scanner.next();
		try {
			if(name.startsWith(" ")|| name.equals("")) {
				throw new EmptyInputException("Name can not be blank");
			}
		}catch (EmptyInputException e) {
			System.out.println(e.getMessage());
		}
		try {
			if(room.startsWith(" ")|| room.equals("")) {
				throw new EmptyInputException("Room can not be blank");
			}
		}catch (EmptyInputException e) {
			System.out.println(e.getMessage());
		}
		try {
			if(pwd.startsWith(" ")|| pwd.equals("")) {
				throw new EmptyInputException("Password can not be blank");
			}
		}catch (EmptyInputException e) {
			System.out.println(e.getMessage());
		}
	}
	public String getName() throws EmptyInputException{
		return name;
	}
	
	
		
}


