import java.text.DecimalFormat;
import java.util.*;
public class Chap6Prob31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.0000");
		
		double initialVelocity, angle, x,y;
		int time;
		System.out.print("Please enter the initial velocity: ");
		initialVelocity=scanner.nextDouble();
		System.out.print("Please enter the angle in degree: ");
		angle=scanner.nextDouble();
		
		Projectile projectile=new Projectile(initialVelocity, angle);
		
		do {
			System.out.print("Please enter the value of time: ");
			time=scanner.nextInt();
			x=projectile.getXCordinate(time);
			y=projectile.getYCordinate(time);
			if(y<0) {
				continue;
			} else {
				System.out.print("The projectile after time "+time+" second is X co-ordinate value= "+df.format(x)+" and Y co-ordinate value= "+df.format(y)+"\n");
			}
			
		} while(y>0);
		

	}

}
