
public class CoffeeBag {
	private final double UNIT_PRICE=5.99;
	private final double SALE_TAX=0.0725;
	private int numOfBag;
	private int bagWeight;
	
	public double getUnitPrice() {
		return UNIT_PRICE;
	}
	
	public double getSalesTax() {
		return SALE_TAX;
	}
	
	public void setBagSold(int numOfBag) {
		this.numOfBag=numOfBag;
	}
	public int getBagSold() {
		return numOfBag;
	}
	public void setWeightPerBag(int weightPerBag) {
		bagWeight=weightPerBag;
	}
	public int getWeightPerBag() {
		return bagWeight;
	}
	public double getTotalSalesTax() {
		double totalSalesTax=SALE_TAX*numOfBag*bagWeight*UNIT_PRICE;
		return totalSalesTax;
	}
	
	public double getTotalPriceWithTax() {
		double totalSalesTax= getTotalSalesTax();
		double totalPrice= bagWeight*numOfBag*UNIT_PRICE;
		double totalPriceWithTax= totalSalesTax + totalPrice;
		return totalPriceWithTax;
	}

}
