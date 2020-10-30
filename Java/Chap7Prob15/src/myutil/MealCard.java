package myutil;

import java.util.*;

public class MealCard {
   private int pointBalance;
   private boolean isBuySuccessful;
   Map<String, Integer> priceList = new Hashtable<>(); 
   priceList.put("Rice", 120);
   priceLisy.put("Banana", 80);
   
   public void MealCard() {
	   pointBalance=100;
   }
   
   public void MealCard(int bal) {
	   pointBalance=bal;
   }
   
   public void addBalance(int bal) {
	   int newBalance=pointBalance+bal;
	   if(pointBalance<newBalance) {
		   pointBalance=newBalance;  
	   }
	   
   }
   
   public int getBalance() {
	   return pointBalance;
   }
   public void deductBalance(int val) {
	   int newBalance=pointBalance-val;
	   if((pointBalance>newBalance) && (newBalance>=0)) {
		   pointBalance=newBalance;
		   this.isBuySuccessful=true;
	   } else {
		   this.isBuySuccessful=false;
	   }
   }
   
   public void buyFood(String food) {
	   if(this.pointBalance>0) {
		   this.deductBalance(priceList.get(food));
		   if(isBuySuccessful) {
			   System.out.println("Food purchase successfull");
		   } else {
			   System.out.print("Does not have enough balance to purchase your food");
		   }
	   }
	   
   }
}
