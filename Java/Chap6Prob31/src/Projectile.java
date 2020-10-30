import java.lang.*;
public class Projectile {
	final double GRAVITY=9.81;
	double velocity;
	double alpha;
	int time;
	
	public Projectile(double speed, double angle) {
		velocity=speed;
		alpha=angle;
		time=0;
	}
	public double getRadian(double alpha) {
		double angle=Math.PI*alpha/180;
		return angle;
	}
	
	public double getXCordinate(int time) {
		double angle=getRadian(alpha);
		double XCordinate=velocity*time*Math.cos(angle);
		return XCordinate;
	}
	public double getYCordinate(int time) {
		double angle=getRadian(alpha);
		double YCordinate=velocity*time*Math.sin(angle)-GRAVITY*time*time/2;
		return YCordinate;
	}
	
	
	

}
