
public class Circle {
	private double radius, area, circumference;
	private static final double PI=3.1416;
	public Circle() {
		radius=0.0;
	}
	// Setting the radius value of the circle
    public void setRadius(double radius) {
    	this.radius=radius;
    }
    
    //Getting the radius
    public double getRadius() {
    	return radius;
    }
    
    //Calculating the Area of a circle
    public double calculateArea() {
    	area=PI*radius*radius;
    	return area;
    }
    
    //Calculating the Circumference of a circle
    public double calculateCircumference() {
    	circumference=2*PI*radius;
    	return circumference;
    }
}
