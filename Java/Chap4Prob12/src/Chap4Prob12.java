import java.util.*;
import java.text.*;
public class Chap4Prob12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.00");
        
        int userAge, userHeight;
        double recommendedWeight=0;
        Height height1=new Height();
        
        
        //Input Taking
        System.out.print("Please enter your age: ");
        userAge=scanner.nextInt();
        System.out.print("Please enter your height: ");
        userHeight=scanner.nextInt();
        
        //Passing Age and height to Height class
        height1.setAge(userAge);
        height1.setHeight(userHeight);
        recommendedWeight=height1.getRecommendedWeight();
        //Output showing
        System.out.print("Your recommended weight is "+df.format(recommendedWeight) +" Kg.");
	}

}
