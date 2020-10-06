
public class RecommendedWeightWithTest {
	
	public double getRecommendedWeightTest(double height) {
		if(height>=130 && height<=240) {
			double recommendedWeight=(height -100+ age/10)*0.90;
			return recommendedWeight;
		}
	}

}
