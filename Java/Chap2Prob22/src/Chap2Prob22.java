import javax.swing.*;

import java.text.SimpleDateFormat;
import java.util.*;

public class Chap2Prob22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		JFrame myWindow=new JFrame();
////		Scanner scanner=new Scanner(System.in);
//		SimpleDateFormat sdf;
//		sdf=new SimpleDateFormat("hh:mm:ss aa");
//		Date today=new Date();
////		int W,H;
////		String title;
////		W=scanner.nextInt();
////		H=scanner.nextInt();
////		title=scanner.next();
//		myWindow.setSize(600,400);
//		myWindow.setTitle(sdf.format(today));
//		myWindow.setVisible(true);
		
//Problem 27
		Scanner scanner=new Scanner(System.in);
		String stringInput;
		scanner.useDelimiter(System.getProperty("line.separator"));
		stringInput=scanner.next();
		System.out.println(stringInput.length());
		System.out.println(stringInput.substring(0,1));
		System.out.println(stringInput.substring(stringInput.length()-1,stringInput.length()));
				
	}

}
