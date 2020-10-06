
public class Height {
	private int height;
	private int age;
	
//	public Height() {
//		height=0;
//		age=0;
//	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	public int getHeight() {
		 return height;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		 return age;
	}
	
	public double getRecommendedWeight() {
		double recommendedWeight=(height -100+ age/10)*0.90;
		return recommendedWeight;
	}
}
