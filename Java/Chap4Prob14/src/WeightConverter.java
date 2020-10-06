
public class WeightConverter {
	private double weightRatio;

	public WeightConverter(double wghtRatio) {
		weightRatio=wghtRatio;
	}
	
	public double convert(double earthWeight) {
		double convertedWeight=earthWeight*weightRatio;
		return convertedWeight;
	}
}
